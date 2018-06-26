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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Solution.ast:2
 * @production Assignment : {@link ASTNode} ::= <span class="component">&lt;TopLevel:boolean&gt;</span> <span class="component">&lt;Request:Request&gt;</span> <span class="component">&lt;Implementation:Implementation&gt;</span> <span class="component">{@link ResourceMapping}</span> <span class="component">{@link ComponentMapping}*</span>;

 */
public class Assignment extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:4
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(Assignment.class);
  /**
   * @aspect Checking
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Checking.jadd:33
   */
  public void explain() {
    if (getRequest() == null) {
      logger.warn("incomplete assignment: request missing");
      return;
    } else if (getResource() == null) {
      logger.warn("incomplete assignment: resource missing");
      return;
    } else if (getImplementation() == null) {
      logger.warn("incomplete assignment: implementation missing");
      return;
    }

    for (Clause clause : getImplementation().requirementClauses()) {
      if (!clause.checkUsing(this)) {
        logger.warn("Requirement {} of {} for {} not met",
            clause.print(new MquatWriteSettings("")),
            getImplementation().name(), this.name());
      }
    }

    // if this is a "top-level" assignment, check the properties from the request
    if (this.getRequest().getTarget().getRef().equals(getImplementation().containingComponent())) {
      for (Clause clause : getRequest().getConstraintList()) {
        if (clause.isRequiringClause() && !clause.checkUsing(this)) {
          logger.warn("Request requirement {} of {} for {} not met",
              clause.print(new MquatWriteSettings("")),
              getRequest().name(), this.name());
        }
      }
    }
  }
  /**
   * @return a deep copy of the assignment
   * @aspect Helpers
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Helpers.jadd:6
   */
  public Assignment deepCopy() {
    Assignment copy = new Assignment();
    copy.setImplementation(this.getImplementation());
    copy.setRequest(this.getRequest());
    copy.setTopLevel(this.getTopLevel());

    for (ComponentMapping subAssignment : getComponentMappingList()) {
      Assignment subAssignmentClone = subAssignment.getAssignment().deepCopy();
      copy.addComponentMapping(new ComponentMapping(subAssignment.getInstance(), subAssignmentClone));
    }

    copy.setResourceMapping(getResourceMapping().deepCopy());

    return copy;
  }
  /**
   * @aspect Iterator
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\simple\\Iterator.jadd:133
   */
  public void updateComponentMapping(Instance instance, Assignment assignment) {
    for (ComponentMapping mapping : getComponentMappingList()) {
      if (mapping.getInstance() == instance) {
        mapping.setAssignment(assignment);
        return;
      }
    }
    addComponentMapping(new ComponentMapping(instance, assignment));
  }
  /**
   * @return an iterator over all component mappings of an assignment
   * @aspect Traversal
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\simple\\Traversal.jadd:48
   */
  public Iterator<Assignment> componentMappingIterator() {
    return new Iterator<Assignment>() {

      private int index = 0;

      @Override
      public boolean hasNext() {
        return index < getNumComponentMapping();
      }

      @Override
      public Assignment next() {
        if (hasNext()) {
          Assignment result = getComponentMapping(index).getAssignment();
          index++;
          return result;
        } else {
          throw new NoSuchElementException();
        }
      }

    };
  }
  /**
   * @aspect Printing
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Printing.jrag:12
   */
  public MquatString print(MquatWriteSettings settings, int indentationLevel) {
    MquatString result = new MquatString(settings, indentationLevel);
    if (getTopLevel()) {
      result.append(getRequest() == null ? "<no request>" : getRequest().name());
    } // otherwise the instance name was already printed
    result.append(" -> ")
        .append(getImplementation() == null ? "<no impl>" : getImplementation().name())
        .append(" {").lb().ind();
    result.append(getResourceMapping().print(settings, indentationLevel + 1));
    for (ComponentMapping entry : getComponentMappingList()) {
      result.append(entry.print(settings, indentationLevel + 1));
    }
    result.und().lb().append("}");

    return result;
  }
  /**
   * @aspect Printing
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Printing.jrag:52
   */
  public String name() {
    return "Assignment@" + Integer.toHexString(hashCode());
  }
  /**
   * @declaredat ASTNode:1
   */
  public Assignment() {
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
    children = new ASTNode[2];
    setChild(new List(), 1);
  }
  /**
   * @declaredat ASTNode:14
   */
  public Assignment(boolean p0, Request p1, Implementation p2, ResourceMapping p3, List<ComponentMapping> p4) {
    setTopLevel(p0);
    setRequest(p1);
    setImplementation(p2);
    setChild(p3, 0);
    setChild(p4, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:28
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public Assignment clone() throws CloneNotSupportedException {
    Assignment node = (Assignment) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public Assignment copy() {
    try {
      Assignment node = (Assignment) clone();
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
   * @declaredat ASTNode:64
   */
  @Deprecated
  public Assignment fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public Assignment treeCopyNoTransform() {
    Assignment tree = (Assignment) copy();
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
   * @declaredat ASTNode:94
   */
  public Assignment treeCopy() {
    Assignment tree = (Assignment) copy();
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
   * @declaredat ASTNode:108
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenboolean_TopLevel == ((Assignment) node).tokenboolean_TopLevel) && (tokenRequest_Request == ((Assignment) node).tokenRequest_Request) && (tokenImplementation_Implementation == ((Assignment) node).tokenImplementation_Implementation);    
  }
  /**
   * Replaces the lexeme TopLevel.
   * @param value The new value for the lexeme TopLevel.
   * @apilevel high-level
   */
  public void setTopLevel(boolean value) {
    tokenboolean_TopLevel = value;
  }
  /** @apilevel internal 
   */
  protected boolean tokenboolean_TopLevel;
  /**
   * Retrieves the value for the lexeme TopLevel.
   * @return The value for the lexeme TopLevel.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="TopLevel")
  public boolean getTopLevel() {
    return tokenboolean_TopLevel;
  }
  /**
   * Replaces the lexeme Request.
   * @param value The new value for the lexeme Request.
   * @apilevel high-level
   */
  public void setRequest(Request value) {
    tokenRequest_Request = value;
  }
  /** @apilevel internal 
   */
  protected Request tokenRequest_Request;
  /**
   * Retrieves the value for the lexeme Request.
   * @return The value for the lexeme Request.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Request")
  public Request getRequest() {
    return tokenRequest_Request;
  }
  /**
   * Replaces the lexeme Implementation.
   * @param value The new value for the lexeme Implementation.
   * @apilevel high-level
   */
  public void setImplementation(Implementation value) {
    tokenImplementation_Implementation = value;
  }
  /** @apilevel internal 
   */
  protected Implementation tokenImplementation_Implementation;
  /**
   * Retrieves the value for the lexeme Implementation.
   * @return The value for the lexeme Implementation.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Implementation")
  public Implementation getImplementation() {
    return tokenImplementation_Implementation;
  }
  /**
   * Replaces the ResourceMapping child.
   * @param node The new node to replace the ResourceMapping child.
   * @apilevel high-level
   */
  public void setResourceMapping(ResourceMapping node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the ResourceMapping child.
   * @return The current node used as the ResourceMapping child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="ResourceMapping")
  public ResourceMapping getResourceMapping() {
    return (ResourceMapping) getChild(0);
  }
  /**
   * Retrieves the ResourceMapping child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the ResourceMapping child.
   * @apilevel low-level
   */
  public ResourceMapping getResourceMappingNoTransform() {
    return (ResourceMapping) getChildNoTransform(0);
  }
  /**
   * Replaces the ComponentMapping list.
   * @param list The new list node to be used as the ComponentMapping list.
   * @apilevel high-level
   */
  public void setComponentMappingList(List<ComponentMapping> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the ComponentMapping list.
   * @return Number of children in the ComponentMapping list.
   * @apilevel high-level
   */
  public int getNumComponentMapping() {
    return getComponentMappingList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ComponentMapping list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ComponentMapping list.
   * @apilevel low-level
   */
  public int getNumComponentMappingNoTransform() {
    return getComponentMappingListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ComponentMapping list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ComponentMapping list.
   * @apilevel high-level
   */
  public ComponentMapping getComponentMapping(int i) {
    return (ComponentMapping) getComponentMappingList().getChild(i);
  }
  /**
   * Check whether the ComponentMapping list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasComponentMapping() {
    return getComponentMappingList().getNumChild() != 0;
  }
  /**
   * Append an element to the ComponentMapping list.
   * @param node The element to append to the ComponentMapping list.
   * @apilevel high-level
   */
  public void addComponentMapping(ComponentMapping node) {
    List<ComponentMapping> list = (parent == null) ? getComponentMappingListNoTransform() : getComponentMappingList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addComponentMappingNoTransform(ComponentMapping node) {
    List<ComponentMapping> list = getComponentMappingListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ComponentMapping list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setComponentMapping(ComponentMapping node, int i) {
    List<ComponentMapping> list = getComponentMappingList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ComponentMapping list.
   * @return The node representing the ComponentMapping list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ComponentMapping")
  public List<ComponentMapping> getComponentMappingList() {
    List<ComponentMapping> list = (List<ComponentMapping>) getChild(1);
    return list;
  }
  /**
   * Retrieves the ComponentMapping list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ComponentMapping list.
   * @apilevel low-level
   */
  public List<ComponentMapping> getComponentMappingListNoTransform() {
    return (List<ComponentMapping>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the ComponentMapping list without
   * triggering rewrites.
   */
  public ComponentMapping getComponentMappingNoTransform(int i) {
    return (ComponentMapping) getComponentMappingListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ComponentMapping list.
   * @return The node representing the ComponentMapping list.
   * @apilevel high-level
   */
  public List<ComponentMapping> getComponentMappings() {
    return getComponentMappingList();
  }
  /**
   * Retrieves the ComponentMapping list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ComponentMapping list.
   * @apilevel low-level
   */
  public List<ComponentMapping> getComponentMappingsNoTransform() {
    return getComponentMappingListNoTransform();
  }
  /**
   * @attribute syn
   * @aspect Checking
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Checking.jrag:31
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Checking", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Checking.jrag:31")
  public boolean isValid() {
    {
        if (getRequest() == null || getResource() == null || getImplementation() == null) { return false; }
        for (Clause clause : getImplementation().requirementClauses()) {
          if (!clause.checkUsing(this)) {
            return false;
          }
        }
        // if this is a "top-level" assignment, check the properties from the request
        if (this.getRequest().getTarget().getRef().equals(getImplementation().containingComponent())) {
          for (Clause clause : getRequest().getConstraintList()) {
            if (clause.isRequiringClause() && !clause.checkUsing(this)) {
              return false;
            }
          }
        }
        return true;
      }
  }
  /**
   * @attribute syn
   * @aspect Checking
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Checking.jrag:62
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Checking", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Checking.jrag:62")
  public boolean isSoftwareValid() {
    {
        if (getRequest() == null) {
          logger.warn("incomplete assignment: request missing");
          return false;
        } else if (getImplementation() == null) {
          logger.warn("incomplete assignment: implementation missing");
          return false;
        }
    
        for (Clause clause : getImplementation().requirementClauses()) {
          if (clause.getDesignator().isSoftwareDesignator()) {
            if (!clause.checkUsing(this)) {
              return false;
            }
          }
    
        }
    
        // if this is a "top-level" assignment, check the properties from the request
        if (this.getRequest().getTarget().getRef().equals(getImplementation().containingComponent())) {
          for (Clause clause : getRequest().getConstraintList()) {
            if (clause.isRequiringClause() && clause.getDesignator().isSoftwareDesignator()) {
              if (!clause.checkUsing(this)) {
                return false;
              }
            }
          }
        }
    
        return true;
      }
  }
  /**
   * @attribute syn
   * @aspect Checking
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Checking.jrag:117
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Checking", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Checking.jrag:117")
  public double computeObjective() {
    {
        Objective objective = getRequest().root().getObjective();
        Property property = objective.getPropertyRef().getRef();
    
        // compute objective property for the implementation
        for (Clause clause : getImplementation().getClauseList()) {
          if (clause.isProvidingClause()) {
            if (clause.getDesignator().isSoftwareDesignator()) {
              SoftwareDesignator softwareDesignator = clause.getDesignator().asSoftwareDesignator();
              if (!softwareDesignator.hasInstanceRef()) {
                // the s.d. has no instance ref, so this is about this very implementation!
                if (softwareDesignator.getPropertyRef().getRef().equals(property)) {
                  return clause.getExpression().evalUsing(this);
                }
              }
            }
          }
        }
        // TODO what if there is no rule to
        throw new RuntimeException("Objective could not be computed!");
      }
  }
  /**
   * @attribute syn
   * @aspect Traversal
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Traversal.jrag:4
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Traversal", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Traversal.jrag:4")
  public Assignment mappedAssignment(Instance instance) {
    {
        for (ComponentMapping mapping : getComponentMappingList()) {
          if (mapping.getInstance() == instance) {
            return mapping.getAssignment();
          }
        }
        return null;
      }
  }
  /**
   * @attribute syn
   * @aspect Traversal
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Traversal.jrag:14
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Traversal", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Traversal.jrag:14")
  public Resource mappedResource(Instance instance) {
    {
        return getResourceMapping().mappedResource(instance);
      }
  }
  /**
   * @attribute syn
   * @aspect Traversal
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Traversal.jrag:32
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Traversal", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Traversal.jrag:32")
  public java.util.List<Assignment> allAssignments() {
    {
        ArrayList<Assignment> allAssignments = new ArrayList<>();
        allAssignments.add(this);
        for (ComponentMapping mapping : getComponentMappingList()) {
          allAssignments.addAll(mapping.getAssignment().allAssignments());
        }
        return Collections.unmodifiableList(allAssignments);
      }
  }
  /**
   * @attribute syn
   * @aspect Traversal
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Traversal.jrag:51
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Traversal", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Traversal.jrag:51")
  public Resource getResource() {
    {
        return getResourceMapping().getResource();
      }
  }
  /**
   * @attribute inh
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Navigation.jrag:7
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Navigation.jrag:7")
  public ComponentMapping containingComponentMapping() {
    ComponentMapping containingComponentMapping_value = getParent().Define_containingComponentMapping(this, null);
    return containingComponentMapping_value;
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Navigation.jrag:13
   * @apilevel internal
   */
  public Assignment Define_containingAssignment(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getComponentMappingListNoTransform()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Navigation.jrag:14
      int i = _callerNode.getIndexOfChild(_childNode);
      return this;
    }
    else {
      return getParent().Define_containingAssignment(this, _callerNode);
    }
  }
  protected boolean canDefine_containingAssignment(ASTNode _callerNode, ASTNode _childNode) {
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
