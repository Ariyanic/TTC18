package ir.ac.ui.eng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

import de.tudresden.inf.st.mquat.jastadd.model.Assignment;
import de.tudresden.inf.st.mquat.jastadd.model.Implementation;
import de.tudresden.inf.st.mquat.jastadd.model.Resource;
import de.tudresden.inf.st.mquat.jastadd.model.ResourceMapping;
import de.tudresden.inf.st.mquat.jastadd.model.Solution;
import de.tudresden.inf.st.mquat.solving.SolverUtils;

/**
 * @author Samaneh Hoseindoost
 * @author Meysan Karimi
 * @author Shekoufeh Kolahdouz-Rahimi
 * @author Bahman Zamani
 */
public class Ant {

  int id;
  Solution currentSolution;
  List<Set<Resource>> possibleResources;
  List<List<Double>> eta;
  Map<Integer, List<Integer>> Sort;
  int numAssignments;


  Ant(int i, Solution solu, List<Set<Resource>> pr, List<List<Double>> et, Map<Integer, List<Integer>> Sr, int a) {
    id = i;
    currentSolution = solu;
    possibleResources = pr;
    eta = et;
    Sort = Sr;
    numAssignments = a;
  }

  private static void assignResource(Assignment assignment, Resource resource) {
    Implementation impl = assignment.getImplementation();

    ResourceMapping mapping = new ResourceMapping(impl.getResourceRequirement().getInstance(0), resource,
        new de.tudresden.inf.st.mquat.jastadd.model.List<>());
    SolverUtils.populateResourceMapping(mapping, impl.getResourceRequirement(), resource);
    assignment.setResourceMapping(mapping);
  }

  public int RoleteWhileSelection(double[] c) {

    double rangeMin = 0.0f;
    double rangeMax = c[c.length-1];
    Random r = new Random();
    double createdRanNum = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
    int i;
    for (i = 0; i < c.length-1; i++) {
      if (createdRanNum <= c[i + 1])
        break;
    }
    return i;
  }

  public Solution run(List<List<Double>> tau, List<List<Double>> numeratorP, List<Double> denominatorP) {

    List<Assignment> assignments = currentSolution.allAssignments();
    Stack<Resource> usedResources = new Stack<>();
    double alpha = 1;
    double beta = 1;
    double rho = 0.1; // Evaporation rate
    double Q = 2;

    List<Integer> keys = new ArrayList<Integer>(Sort.keySet());

    Collections.sort(keys);		// "keys" are number of possible resources
    // "values" are index of the assignments

    for (Integer key: keys) {

      int siz = Sort.get(key).size();

      for (int i = 0; i < siz; i++) {

        int index = Sort.get(key).get(i);

        Assignment assignment = assignments.get(index);

        List<Resource> resources = new ArrayList<Resource>(possibleResources.get(index));
/*
				System.out.print("Ant_" + id + "    ");
				System.out.print("assignment " + assignment.name() + "    ");
				System.out.print("possible resources: " + resources.size() + "    ");
				for (int j = 0; j < resources.size(); j++) {
					System.out.println("po: " + resources.get(j).getName());
				}
*/
        int remove = 0;
        for (Iterator<Resource> resIt = resources.iterator(); resIt.hasNext();) {
          Resource resource = resIt.next();
          if (usedResources.contains(resource)) {
            remove++;
          }
        }
        if (resources.size() == remove) {
          return null;
        }

        List<Double> numerator = numeratorP.get(index);
        double denominator = denominatorP.get(index);
        int size = resources.size();
        double[] p = new double[size];
        double[] c = new double[size + 1];
        c[0] = 0;
        for(int j=0; j<size; j++ ){
          p[j] = numerator.get(j)/denominator;
          c[j + 1] = c[j] + p[j];
        }

        int select = RoleteWhileSelection(c);
        Resource resource = resources.get(select);

        while (usedResources.contains(resource)) {
          select = RoleteWhileSelection(c);
          resource = resources.get(select);
        }

//				System.out.println("selected resource: " + resource.getName());

        assignResource(assignment, resource);
        usedResources.push(resource);


        denominatorP.set(index, denominatorP.get(index) - numeratorP.get(index).get(select));

        // tau[index][select] = tau[index][select] + (Q /assignment.computeObjective());
        // tau[index][select] = (1 - rho) * tau[index][select];
        List<Double> taui = tau.get(index);
        // Upadte Pheromone
        taui.set(select, taui.get(select) + (Q / assignment.computeObjective()));
        // Evaporation on Pheromone of antSolution.allAssignments();
        taui.set(select, (1 - rho) * taui.get(select));
        tau.set(index, taui);

        // p[index][select] = (tau[index][select] * alpha) + (eta[index][select] * beta);
        List<Double> sIndex = numeratorP.get(index);
        sIndex.set(select, (tau.get(index).get(select) * alpha) + (eta.get(index).get(select) * beta));
        numeratorP.set(index, sIndex);

        denominatorP.set(index, denominatorP.get(index) + numeratorP.get(index).get(select));

      }
    }

    numAssignments++;
    return currentSolution;

  }
}
