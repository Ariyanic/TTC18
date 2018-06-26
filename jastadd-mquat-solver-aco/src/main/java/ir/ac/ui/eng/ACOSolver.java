package ir.ac.ui.eng;

import de.tudresden.inf.st.mquat.jastadd.model.*;
import de.tudresden.inf.st.mquat.solving.BenchmarkableSolver;
import de.tudresden.inf.st.mquat.solving.Solver;
import de.tudresden.inf.st.mquat.solving.SolverUtils;
import de.tudresden.inf.st.mquat.solving.SolvingException;
import de.tudresden.inf.st.mquat.utils.StopWatch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * @author Samaneh Hoseindoost
 * @author Meysan Karimi
 * @author Shekoufeh Kolahdouz-Rahimi
 * @author Bahman Zamani
 */
public class ACOSolver implements BenchmarkableSolver {

  int population_size = 50000;
  int iteration_size = 50;

  private static final Logger logger = LogManager.getLogger(ACOSolver.class);

  private Solution lastSolution;
  private long lastSolvingTime;

  private int solutionCounter;

  private long maxSolvingTime;
  private StopWatch stopWatch;

  private boolean timedOut;
  int numAssignments = 0;

  public ACOSolver() {
    this(Long.MAX_VALUE);
  }

  public ACOSolver(long maxSolvingTime) {
    this.maxSolvingTime = maxSolvingTime;
    reset();
  }

  public ACOSolver setPopulation_size(int population_size) {
    this.population_size = population_size;
    return this;
  }

  public ACOSolver setIteration_size(int iteration_size) {
    this.iteration_size = iteration_size;
    return this;
  }

  public Assignment ACOCreateSoftwareAssignment(Request request, Component component, boolean topLevel, int i) {
    Assignment assignment = new Assignment();
    assignment.setRequest(request);
    assignment.setTopLevel(topLevel);

    Implementation implementation = component.getImplementation(i);
    assignment.setImplementation(implementation);

    for (ComponentRequirement requirement : implementation.getComponentRequirementList()) {
      for (Instance instance : requirement.getInstanceList()) {

        int rangeMin = 0;
        int rangeMax = requirement.getComponentRef().getRef().getImplementationList().getNumChild();

        Assignment ass = null;
        do{
          int randomNum = ThreadLocalRandom.current().nextInt(rangeMin, rangeMax);
          ass = ACOCreateSoftwareAssignment(request, requirement.getComponentRef().getRef(), false, randomNum);
        }while(!ass.isSoftwareValid());

        assignment.addComponentMapping(new ComponentMapping(instance, ass));

      }
    }

    for (Instance instance : implementation.getResourceRequirement().getInstanceList()) {
      assignment.setResourceMapping(new ResourceMapping(instance, null, new de.tudresden.inf.st.mquat.jastadd.model.List<>()));
    }

    return assignment;
  }

  private static void assignResource(Assignment assignment, Resource resource) {
    Implementation impl = assignment.getImplementation();

    ResourceMapping mapping = new ResourceMapping(impl.getResourceRequirement().getInstance(0), resource,
        new de.tudresden.inf.st.mquat.jastadd.model.List<>());
    SolverUtils.populateResourceMapping(mapping, impl.getResourceRequirement(), resource);
    assignment.setResourceMapping(mapping);
  }

  @Override
  public Solution solve(Root model) throws SolvingException {
    reset();
    if (model.getNumRequest() == 0) {
      return Solution.emptySolutionOf(model);
    }
    int numSoftwareSolutions = 0;
    int numTotalSoftwareSolutions = 0;

    stopWatch = StopWatch.start();
    List<Solution> solutions = new ArrayList<>();
    List<Solution> currentSolutions = new ArrayList<>();
    List<List<Set<Resource>>> currentPossibleResources = new ArrayList<>();
    List<List<List<Double>>> currentTau = new ArrayList<>(); // Pheromone for each resources
    List<List<List<Double>>> currentEta = new ArrayList<>(); // Objective for each resources
    List<List<Double>> currentDenominatorP = new ArrayList<>();
    List<List<List<Double>>> currentNumeratorP = new ArrayList<>();
    List<Map<Integer, List<Integer>>> currentSort = new ArrayList<>();


    for (int pop = 0; pop < population_size; pop++) {
    	
    	if (stopWatch.time(TimeUnit.MILLISECONDS) > maxSolvingTime) {
    		timedOut = true;
    		break;
    	}

      Solution currentSolution = new Solution();
      currentSolution.setModel(model);
      de.tudresden.inf.st.mquat.jastadd.model.List<Request> requests = model.getRequests();

      for(Request request: requests){
        int rangeMin = 0;
        int rangeMax = request.getTarget().getRef().getImplementationList().getNumChild();
        Assignment ass = null;
        do{
          int randomNum = ThreadLocalRandom.current().nextInt(rangeMin, rangeMax);
          ass = ACOCreateSoftwareAssignment(request, request.getTarget().getRef(), true, randomNum);
        }while(!ass.isSoftwareValid());

        currentSolution.addAssignment(ass);
      }

      de.tudresden.inf.st.mquat.jastadd.model.List<Resource> resources = model.getHardwareModel().getResources();
      numTotalSoftwareSolutions++;
      List<Assignment> assignments = currentSolution.allAssignments();
      List<Set<Resource>> possibleResources = new ArrayList<>(assignments.size());
      boolean isHardwareValid = true;
      double tau0 = 1;
      List<List<Double>> tau = new ArrayList<>(); // Pheromone for each resources
      List<List<Double>> eta = new ArrayList<>(); // Objective
      double alpha = 1;
      double beta = 1;
      List<List<Double>> numeratorP = new ArrayList<>(); // soorate Probability
      List<Double> denominatorP = new ArrayList<>(); // makhraje Probability
      Map<Integer, List<Integer>> SortIndexByPossibleResource = new HashMap<>();

      int index = 0;
      for (Assignment assignment : assignments) {
        Set<Resource> resourceList = new HashSet<>();
        List<Double> taui = new ArrayList<>();
        List<Double> etai = new ArrayList<>();
        List<Double> numeratorPi = new ArrayList<>();
        double sum = 0;
        int i = 0;
        for (Resource resource : resources) {
          assignResource(assignment, resource);
          if (assignment.isValid()) {
            resourceList.add(resource);
            taui.add(tau0); // Pheromone on antSolution.allAssignments().allResources;
            etai.add(1 / assignment.computeObjective());
            numeratorPi.add((taui.get(i) * alpha) + (etai.get(i) * beta));
            sum += numeratorPi.get(i);
            i++;
          }
        }
        if(i == 0){
          isHardwareValid = false;
          break;
        }
        possibleResources.add(resourceList);
        tau.add(taui);
        eta.add(etai);
        numeratorP.add(numeratorPi);
        denominatorP.add(sum);
        SortIndexByPossibleResource.computeIfAbsent(i, k -> new ArrayList<>()).add(index);
        index++;
      }
      if(isHardwareValid == true){
        numSoftwareSolutions++;
        Solution clone = currentSolution.deepCopy();
        currentSolutions.add(clone);
        currentPossibleResources.add(possibleResources);
        currentTau.add(tau);
        currentEta.add(eta);
        currentNumeratorP.add(numeratorP);
        currentDenominatorP.add(denominatorP);
        currentSort.add(SortIndexByPossibleResource);
      }
    }

    for (int iteration = 0; iteration < iteration_size; iteration++) {
    	
    	if (stopWatch.time(TimeUnit.MILLISECONDS) > maxSolvingTime) {
    		timedOut = true;
    		break;
    	}
    	
      List<Ant> population = new ArrayList<>();
      for (int i = 0; i < currentSolutions.size(); i++) {
        Ant ant = new Ant(i, currentSolutions.get(i), currentPossibleResources.get(i), currentEta.get(i), currentSort.get(i), numAssignments);
        population.add(ant);
      }

      Parallel.ForEach(population, new LoopBody<Ant>() {
        @Override
        public void run(Ant ant) {

          int ant_Number = ant.id;
          List<List<Double>> tau = currentTau.get(ant_Number);  ///////////// BEFORE RUN
          List<List<Double>> numeratorP = currentNumeratorP.get(ant_Number);
          List<Double> denominatorP = currentDenominatorP.get(ant_Number);
          Solution antSolution = ant.run(tau, numeratorP, denominatorP);		  ////////////  Tau CHANGE AFTER RUN.

          if (antSolution != null) {
            currentTau.set(ant_Number, tau);		///////////// AFTER RUN
            currentNumeratorP.set(ant_Number, numeratorP);
            currentDenominatorP.set(ant_Number, denominatorP);
            numAssignments += ant.numAssignments;
            solutionCounter++;
            if (solutions.isEmpty() || antSolution.computeObjective() < solutions
                .get(solutions.size() - 1).computeObjective()) {
              Solution clone = antSolution.deepCopy();
              solutions.add(clone);
              logger.info("found a better solution with an objective of {}.",
                  antSolution.computeObjective());
            }
          }
        }
      });
    }

    logger.info("Number of total software solutions: {}", numTotalSoftwareSolutions);
    logger.info("Number of iterated software solutions: {}", numSoftwareSolutions);
    logger.info("Number of iterated solutions: {}", numAssignments);
    logger.info("Number of correct solutions: {}", solutionCounter);

    if (solutions.size() > 0) {
      lastSolution = solutions.get(solutions.size() - 1);
    } else {
      lastSolution = Solution.emptySolutionOf(model);
      logger.warn("Found no solution!");
    }

    lastSolvingTime = stopWatch.time(TimeUnit.MILLISECONDS);

    return lastSolution;

  }

  private void reset() {
    this.lastSolution = null;
    this.solutionCounter = 0;
    this.lastSolvingTime = 0;
    this.timedOut = false;
  }

  @Override
  public String getName() {
    return "aco";
  }

  @Override
  public long getLastSolvingTime() {
    return lastSolvingTime;
  }

  @Override
  public double getLastObjective() {
    if (lastSolution != null) {
      return lastSolution.computeObjective();
    } else {
      // TODO throw exception or do something reasonable
      return 0d;
    }
  }

  @Override
  public Solver setTimeout(long timeoutValue, TimeUnit timeoutUnit) {
    this.maxSolvingTime = timeoutUnit.toMillis(timeoutValue);
    return this;
  }

  @Override
  public boolean hadTimeout() {
    return this.timedOut;
  }
}
