/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
package de.tudresden.inf.st.mquat.jastadd.model;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Stack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Optional;
/**
 * @ast node
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Solution.ast:1
 * @production Solution : {@link ASTNode} ::= <span class="component">&lt;Model:Root&gt;</span> <span class="component">{@link Assignment}*</span>;

 */
public class Solution extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:51
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(Solution.class);
  /**
   * @aspect Checking
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Checking.jadd:2
   */
  public void explain() {
    Set<Request> requestSet = new HashSet<>();
    Map<Resource, Assignment> resourceSet = new HashMap<>();
    logger.info(this.toString());
    // check assignments
    for (Assignment assignment : allAssignments()) {
      if (!assignment.isValid()) {
        logger.warn("Invalid assignment found");
        assignment.explain();
        return;
      } else {
        if (assignment.getImplementation().containingComponent() ==
            assignment.getRequest().getTarget().getRef()) {
          requestSet.add(assignment.getRequest());
        }
        if (resourceSet.containsKey(assignment.getResource())) {
          logger.warn("Two assignments to the same resource found:\n {}---\n{}",
              assignment.toString(), resourceSet.get(assignment.getResource()));
          return;
        }
        resourceSet.put(assignment.getResource(), assignment);
      }
    }
    // check if all requests have (at least) one assignment
    if (requestSet.size() != getModel().getRequests().getNumChild()) {
      logger.warn("There are only assignments for {} of {} requests!", requestSet.size(), getModel().getRequests().getNumChild());
      return;
    }
    logger.info("Solution is valid");
  }
  /**
   * @return a deep copy of the solution
   * @aspect Helpers
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Helpers.jadd:38
   */
  public Solution deepCopy() {

    Solution copy = new Solution(getModel(), new List<>());

    for (Assignment assignment : this.getAssignments()) {
      Assignment clone = assignment.deepCopy();
      copy.addAssignment(clone);
    }

    return copy;
  }
  /**
   * Create a solution with no assignments and every resource in the model marked as free in the solution
   * 
   * @param model the model to base the solution on
   * @return a newly created solution, with not assignments
   * @aspect Construction
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\simple\\Construction.jadd:9
   */
  public static Solution emptySolutionOf(Root model) {
    return new Solution(model,new List<>());
  }
  /**
   * creates an assignment for the model given by the solution within it is called
   * 
   * @param request
   * @param component
   * @return
   * @aspect Construction
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\simple\\Construction.jadd:20
   */
  public Assignment createSoftwareAssignment(Request request, Component component, boolean topLevel) {
    Assignment assignment = new Assignment();
    assignment.setRequest(request);
    assignment.setTopLevel(topLevel);

    // ignore resources here

    // find the first impl
    Implementation implementation = component.getImplementation(0);
    assignment.setImplementation(implementation);

    for (ComponentRequirement requirement : implementation.getComponentRequirementList()) {
      for (Instance instance : requirement.getInstanceList()) {
        assignment.addComponentMapping(new ComponentMapping(instance, createSoftwareAssignment(request, requirement.getComponentRef().getRef(), false)));
      }
    }

    for (Instance instance : implementation.getResourceRequirement().getInstanceList()) {
      assignment.setResourceMapping(new ResourceMapping(instance, null, new List<>()));
    }

    return assignment;
  }
  /**
   * @aspect Construction
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\simple\\Construction.jadd:44
   */
  public static Solution createSoftwareSolution(Root model) {
    Solution solution = new Solution();

    solution.setModel(model);

    for (Request request : model.getRequests()) {
      solution.addAssignment(solution.createSoftwareAssignment(request, request.getTarget().getRef(), true));
    }

    return solution;
  }
  /**
   * Changes the solution to the next one (which may well be invalid)
   * 
   * @return true, iff a new assignment could be found
   * @aspect Iterator
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\simple\\Iterator.jadd:11
   */
  public boolean nextSoftwareAssignment() {
    return nextSoftwareAssignment(0);
  }
  /**
   * @aspect Iterator
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\simple\\Iterator.jadd:15
   */
  private boolean nextSoftwareAssignment(int start) {

    // try to get a next from the rest
    if (start == this.getNumAssignment()) {
      // if there is no rest, return false
      return false;
    } else if (nextSoftwareAssignment(start + 1)) {
      // if this succeeds, return true
      return true;
    } else {

      boolean nextResult = nextSoftwareAssignment(this.getAssignment(start));

      if (!nextResult) {
        // reset the rest
        for (int i = start; i < this.getNumAssignment(); i++) {
          Assignment oldAssignment = this.getAssignment(i);
          Assignment newAssignment = createSoftwareAssignment(oldAssignment.getRequest(), oldAssignment.getRequest().getTarget().getRef(), oldAssignment.getTopLevel());
          this.setAssignment(newAssignment, i);
        }
      } else {
        for (int i = start + 1; i < this.getNumAssignment(); i++) {
          Assignment oldAssignment = this.getAssignment(i);
          Assignment newAssignment = createSoftwareAssignment(oldAssignment.getRequest(), oldAssignment.getRequest().getTarget().getRef(), oldAssignment.getTopLevel());
          this.setAssignment(newAssignment, i);
        }
        // no need to flush, because only new assignments were added
      }
      return nextResult;
    }
  }
  /**
   * @aspect Iterator
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\simple\\Iterator.jadd:47
   */
  public boolean nextSoftwareAssignment(Assignment assignment) {

    java.util.List<Instance> componentInstanceList = new ArrayList<>();
    for (ComponentMapping mapping : assignment.getComponentMappingList()) {
      componentInstanceList.add(mapping.getInstance());
    }

    boolean nextResult = nextSoftwareAssignment(assignment, componentInstanceList, 0);

    if (!nextResult) {
      for (int i = 0; i < assignment.getNumComponentMapping(); i++) {
        Component requiredComponent = componentInstanceList.get(i).referringComponent();
        Assignment newAssignment = this.createSoftwareAssignment(assignment.getRequest(), requiredComponent, false);
        assignment.updateComponentMapping(componentInstanceList.get(i), newAssignment);
      }
      // no need to flush, this is done in the method call
      return nextLocalSoftwareAssignment(assignment);
    } else {
      // // FLUSH
      // assignment.flushTreeCache();
      // assignment.flushAssignmentUpwards();
      return true;
    }
  }
  /**
   * @aspect Iterator
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\simple\\Iterator.jadd:72
   */
  public boolean nextSoftwareAssignment(Assignment assignment, java.util.List<Instance> requiredInstances, int start) {

    // try to get a next from the rest
    if (start == assignment.getNumComponentMapping()) {
      return false;
    } else if (start < assignment.getNumComponentMapping() && nextSoftwareAssignment(assignment, requiredInstances, start + 1)) {
      return true;
    } else {
      boolean nextResult = nextSoftwareAssignment(assignment.mappedAssignment(requiredInstances.get(start)));

      if (!nextResult) {
        // reset the rest
        for (int i = start; i < assignment.getNumComponentMapping(); i++) {
          Component requiredComponent = requiredInstances.get(i).referringComponent();
          Assignment newAssignment = this.createSoftwareAssignment(assignment.getRequest(), requiredComponent, false);
          assignment.updateComponentMapping(requiredInstances.get(i), newAssignment);
        }
      } else {
        for (int i = start + 1; i < assignment.getNumComponentMapping(); i++) {
          Component requiredComponent = requiredInstances.get(i).referringComponent();
          Assignment newAssignment = this.createSoftwareAssignment(assignment.getRequest(), requiredComponent, false);
          assignment.updateComponentMapping(requiredInstances.get(i), newAssignment);
        }
      }
      // // FLUSH
      // assignment.flushCache();
      return nextResult;
    }
  }
  /**
   * @aspect Iterator
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\simple\\Iterator.jadd:103
   */
  private boolean nextLocalSoftwareAssignment(Assignment assignment) {

    // then, look at a successor implementation
    int pip = assignment.getImplementation().posInParent();
    if (pip < assignment.getImplementation().containingComponent().getNumImplementation() - 1) {
      // pick the first implementation
      Implementation newImplementation = assignment.getImplementation().containingComponent().getImplementation(pip + 1);
      assignment.setImplementation(newImplementation);

      // the resourceRequirementAssignments change (even though just the keys are set.)
      assignment.setResourceMapping(new ResourceMapping(newImplementation.getResourceRequirement().getInstance(0), null, new List<>()));

      // the componentRequirementAssignments change!
      assignment.setComponentMappingList(new List<>());
      for (ComponentRequirement componentRequirement : newImplementation.getComponentRequirementList()) {
        Component requiredComponent = componentRequirement.getComponentRef().getRef();
        for (Instance instance : componentRequirement.getInstanceList()) {
          assignment.addComponentMapping(new ComponentMapping(instance, createSoftwareAssignment(assignment.getRequest(), requiredComponent, false)));
        }
      }

      // // FLUSH
      // assignment.flushTreeCache();
      // assignment.flushAssignmentUpwards();
      return true;
    }

    return false;
  }
  /**
   * @return an iterator over all assignments in the solution
   * @aspect Traversal
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\simple\\Traversal.jadd:6
   */
  public Iterator<Assignment> assignmentIterator() {
    return new Iterator<Assignment>() {

      private Stack<Iterator<Assignment>> iteratorStack = new Stack<>();
      {
        iteratorStack.push(getAssignments().iterator());
      }

      @Override
      public boolean hasNext() {
        return !iteratorStack.isEmpty() && iteratorStack.peek().hasNext();
      }

      @Override
      public Assignment next() {

        // find current iterator
        Iterator<Assignment> currentIterator = iteratorStack.peek();

        if (currentIterator != null && currentIterator.hasNext()) {
          Assignment currentAssignment = currentIterator.next();
          Iterator<Assignment> nextIterator = currentAssignment.componentMappingIterator();
          iteratorStack.push(nextIterator);

          currentIterator = nextIterator;
          while (currentIterator != null && !currentIterator.hasNext()) {
            iteratorStack.pop();
            currentIterator = iteratorStack.isEmpty() ? null : iteratorStack.peek();
          }

          return currentAssignment;
        }

        throw new NoSuchElementException();
      }

    };
  }
  /**
   * @aspect Printing
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Printing.jrag:3
   */
  public MquatString print(MquatWriteSettings settings, int indentationLevel) {
    MquatString result = new MquatString(settings, indentationLevel);
    result.append("solution {").lb().ind();
    for (Assignment assignment : getAssignmentList()) {
      result.append(assignment.print(settings, indentationLevel + 1)).lb();
    }
    return result.und().lb().append("}").lb();
  }
  /**
   * @declaredat ASTNode:1
   */
  public Solution() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
    children = new ASTNode[1];
    setChild(new List(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  public Solution(Root p0, List<Assignment> p1) {
    setModel(p0);
    setChild(p1, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:19
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:25
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:29
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public Solution clone() throws CloneNotSupportedException {
    Solution node = (Solution) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public Solution copy() {
    try {
      Solution node = (Solution) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:61
   */
  @Deprecated
  public Solution fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:71
   */
  public Solution treeCopyNoTransform() {
    Solution tree = (Solution) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:91
   */
  public Solution treeCopy() {
    Solution tree = (Solution) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:105
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenRoot_Model == ((Solution) node).tokenRoot_Model);    
  }
  /**
   * Replaces the lexeme Model.
   * @param value The new value for the lexeme Model.
   * @apilevel high-level
   */
  public void setModel(Root value) {
    tokenRoot_Model = value;
  }
  /** @apilevel internal 
   */
  protected Root tokenRoot_Model;
  /**
   * Retrieves the value for the lexeme Model.
   * @return The value for the lexeme Model.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Model")
  public Root getModel() {
    return tokenRoot_Model;
  }
  /**
   * Replaces the Assignment list.
   * @param list The new list node to be used as the Assignment list.
   * @apilevel high-level
   */
  public void setAssignmentList(List<Assignment> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Assignment list.
   * @return Number of children in the Assignment list.
   * @apilevel high-level
   */
  public int getNumAssignment() {
    return getAssignmentList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Assignment list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Assignment list.
   * @apilevel low-level
   */
  public int getNumAssignmentNoTransform() {
    return getAssignmentListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Assignment list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Assignment list.
   * @apilevel high-level
   */
  public Assignment getAssignment(int i) {
    return (Assignment) getAssignmentList().getChild(i);
  }
  /**
   * Check whether the Assignment list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasAssignment() {
    return getAssignmentList().getNumChild() != 0;
  }
  /**
   * Append an element to the Assignment list.
   * @param node The element to append to the Assignment list.
   * @apilevel high-level
   */
  public void addAssignment(Assignment node) {
    List<Assignment> list = (parent == null) ? getAssignmentListNoTransform() : getAssignmentList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addAssignmentNoTransform(Assignment node) {
    List<Assignment> list = getAssignmentListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Assignment list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setAssignment(Assignment node, int i) {
    List<Assignment> list = getAssignmentList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Assignment list.
   * @return The node representing the Assignment list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Assignment")
  public List<Assignment> getAssignmentList() {
    List<Assignment> list = (List<Assignment>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Assignment list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Assignment list.
   * @apilevel low-level
   */
  public List<Assignment> getAssignmentListNoTransform() {
    return (List<Assignment>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the Assignment list without
   * triggering rewrites.
   */
  public Assignment getAssignmentNoTransform(int i) {
    return (Assignment) getAssignmentListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Assignment list.
   * @return The node representing the Assignment list.
   * @apilevel high-level
   */
  public List<Assignment> getAssignments() {
    return getAssignmentList();
  }
  /**
   * Retrieves the Assignment list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Assignment list.
   * @apilevel low-level
   */
  public List<Assignment> getAssignmentsNoTransform() {
    return getAssignmentListNoTransform();
  }
  /**
   * @attribute syn
   * @aspect Checking
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Checking.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Checking", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Checking.jrag:3")
  public boolean isValid() {
    {
        Set<Request> requestSet = new HashSet<>();
        Set<Resource> resourceSet = new HashSet<>();
    
        // check assignments
        Iterator<Assignment> assignmentIterator = this.assignmentIterator();
        while (assignmentIterator.hasNext()) {
          Assignment assignment = assignmentIterator.next();
          if (!assignment.isValid()) {
            return false;
          } else {
            if (assignment.getImplementation().containingComponent() ==
                assignment.getRequest().getTarget().getRef()) {
              requestSet.add(assignment.getRequest());
            }
            if (resourceSet.contains(assignment.getResource())) {
              return false;
            }
            resourceSet.add(assignment.getResource());
          }
        }
    
        // check if all requests have (at least) one assignment
        return requestSet.size() == getModel().getRequests().getNumChild();
      }
  }
  /**
   * @attribute syn
   * @aspect Checking
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Checking.jrag:49
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Checking", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Checking.jrag:49")
  public boolean isSoftwareValid() {
    {
    
        // check assignments
        Iterator<Assignment> assignmentIterator = this.assignmentIterator();
        while (assignmentIterator.hasNext()) {
          if (!assignmentIterator.next().isSoftwareValid()) {
            return false;
          }
        }
    
        return true;
      }
  }
  /**
   * @attribute syn
   * @aspect Checking
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Checking.jrag:94
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Checking", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Checking.jrag:94")
  public double computeObjective() {
    {
        Objective objective = getModel().getObjective();
    
        Iterator<Assignment> solutionIterator;
        switch (objective.getAgg()) {
          case MAX:
            double max = Double.NEGATIVE_INFINITY;
            solutionIterator = this.assignmentIterator();
            while (solutionIterator.hasNext()) {
              max = Math.max(max, solutionIterator.next().computeObjective());
            }
            return max;
          case SUM:
            double sum = 0;
            solutionIterator = this.assignmentIterator();
            while (solutionIterator.hasNext()) {
              sum += solutionIterator.next().computeObjective();
            }
            return sum;
        }
        throw new RuntimeException("java is stupid.");
      }
  }
  /**
   * @attribute syn
   * @aspect Traversal
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Traversal.jrag:43
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Traversal", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Traversal.jrag:43")
  public java.util.List<Assignment> allAssignments() {
    {
        ArrayList<Assignment> allAssignments = new ArrayList<>();
        for (Assignment assignment : getAssignments()) {
          allAssignments.addAll(assignment.allAssignments());
        }
        return Collections.unmodifiableList(allAssignments);
      }
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Navigation.jrag:7
   * @apilevel internal
   */
  public ComponentMapping Define_containingComponentMapping(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getAssignmentListNoTransform()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Navigation.jrag:9
      int i = _callerNode.getIndexOfChild(_childNode);
      return null;
    }
    else {
      return getParent().Define_containingComponentMapping(this, _callerNode);
    }
  }
  protected boolean canDefine_containingComponentMapping(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
