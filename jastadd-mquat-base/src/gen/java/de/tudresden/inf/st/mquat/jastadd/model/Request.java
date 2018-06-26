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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Mquat.ast:74
 * @production Request : {@link ASTNode} ::= <span class="component">{@link MetaParameterAssignment}*</span> <span class="component">Target:{@link ComponentRef}</span> <span class="component">Constraint:{@link Clause}*</span> <span class="component">Name:{@link Name}</span>;

 */
public class Request extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:43
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(Request.class);
  /**
   * @declaredat ASTNode:1
   */
  public Request() {
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
    children = new ASTNode[4];
    setChild(new List(), 0);
    setChild(new List(), 2);
  }
  /**
   * @declaredat ASTNode:15
   */
  public Request(List<MetaParameterAssignment> p0, ComponentRef p1, List<Clause> p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 3;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:27
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public Request clone() throws CloneNotSupportedException {
    Request node = (Request) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public Request copy() {
    try {
      Request node = (Request) clone();
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
   * @declaredat ASTNode:63
   */
  @Deprecated
  public Request fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:73
   */
  public Request treeCopyNoTransform() {
    Request tree = (Request) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        switch (i) {
        case 3:
          tree.children[i] = null;
          continue;
        }
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
   * @declaredat ASTNode:98
   */
  public Request treeCopy() {
    Request tree = (Request) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        switch (i) {
        case 3:
          tree.children[i] = null;
          continue;
        }
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
   * @declaredat ASTNode:117
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the MetaParameterAssignment list.
   * @param list The new list node to be used as the MetaParameterAssignment list.
   * @apilevel high-level
   */
  public void setMetaParameterAssignmentList(List<MetaParameterAssignment> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the MetaParameterAssignment list.
   * @return Number of children in the MetaParameterAssignment list.
   * @apilevel high-level
   */
  public int getNumMetaParameterAssignment() {
    return getMetaParameterAssignmentList().getNumChild();
  }
  /**
   * Retrieves the number of children in the MetaParameterAssignment list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the MetaParameterAssignment list.
   * @apilevel low-level
   */
  public int getNumMetaParameterAssignmentNoTransform() {
    return getMetaParameterAssignmentListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the MetaParameterAssignment list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the MetaParameterAssignment list.
   * @apilevel high-level
   */
  public MetaParameterAssignment getMetaParameterAssignment(int i) {
    return (MetaParameterAssignment) getMetaParameterAssignmentList().getChild(i);
  }
  /**
   * Check whether the MetaParameterAssignment list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasMetaParameterAssignment() {
    return getMetaParameterAssignmentList().getNumChild() != 0;
  }
  /**
   * Append an element to the MetaParameterAssignment list.
   * @param node The element to append to the MetaParameterAssignment list.
   * @apilevel high-level
   */
  public void addMetaParameterAssignment(MetaParameterAssignment node) {
    List<MetaParameterAssignment> list = (parent == null) ? getMetaParameterAssignmentListNoTransform() : getMetaParameterAssignmentList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addMetaParameterAssignmentNoTransform(MetaParameterAssignment node) {
    List<MetaParameterAssignment> list = getMetaParameterAssignmentListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the MetaParameterAssignment list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setMetaParameterAssignment(MetaParameterAssignment node, int i) {
    List<MetaParameterAssignment> list = getMetaParameterAssignmentList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the MetaParameterAssignment list.
   * @return The node representing the MetaParameterAssignment list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="MetaParameterAssignment")
  public List<MetaParameterAssignment> getMetaParameterAssignmentList() {
    List<MetaParameterAssignment> list = (List<MetaParameterAssignment>) getChild(0);
    return list;
  }
  /**
   * Retrieves the MetaParameterAssignment list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the MetaParameterAssignment list.
   * @apilevel low-level
   */
  public List<MetaParameterAssignment> getMetaParameterAssignmentListNoTransform() {
    return (List<MetaParameterAssignment>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the MetaParameterAssignment list without
   * triggering rewrites.
   */
  public MetaParameterAssignment getMetaParameterAssignmentNoTransform(int i) {
    return (MetaParameterAssignment) getMetaParameterAssignmentListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the MetaParameterAssignment list.
   * @return The node representing the MetaParameterAssignment list.
   * @apilevel high-level
   */
  public List<MetaParameterAssignment> getMetaParameterAssignments() {
    return getMetaParameterAssignmentList();
  }
  /**
   * Retrieves the MetaParameterAssignment list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the MetaParameterAssignment list.
   * @apilevel low-level
   */
  public List<MetaParameterAssignment> getMetaParameterAssignmentsNoTransform() {
    return getMetaParameterAssignmentListNoTransform();
  }
  /**
   * Replaces the Target child.
   * @param node The new node to replace the Target child.
   * @apilevel high-level
   */
  public void setTarget(ComponentRef node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Target child.
   * @return The current node used as the Target child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Target")
  public ComponentRef getTarget() {
    return (ComponentRef) getChild(1);
  }
  /**
   * Retrieves the Target child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Target child.
   * @apilevel low-level
   */
  public ComponentRef getTargetNoTransform() {
    return (ComponentRef) getChildNoTransform(1);
  }
  /**
   * Replaces the Constraint list.
   * @param list The new list node to be used as the Constraint list.
   * @apilevel high-level
   */
  public void setConstraintList(List<Clause> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the Constraint list.
   * @return Number of children in the Constraint list.
   * @apilevel high-level
   */
  public int getNumConstraint() {
    return getConstraintList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Constraint list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Constraint list.
   * @apilevel low-level
   */
  public int getNumConstraintNoTransform() {
    return getConstraintListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Constraint list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Constraint list.
   * @apilevel high-level
   */
  public Clause getConstraint(int i) {
    return (Clause) getConstraintList().getChild(i);
  }
  /**
   * Check whether the Constraint list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasConstraint() {
    return getConstraintList().getNumChild() != 0;
  }
  /**
   * Append an element to the Constraint list.
   * @param node The element to append to the Constraint list.
   * @apilevel high-level
   */
  public void addConstraint(Clause node) {
    List<Clause> list = (parent == null) ? getConstraintListNoTransform() : getConstraintList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addConstraintNoTransform(Clause node) {
    List<Clause> list = getConstraintListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Constraint list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setConstraint(Clause node, int i) {
    List<Clause> list = getConstraintList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Constraint list.
   * @return The node representing the Constraint list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Constraint")
  public List<Clause> getConstraintList() {
    List<Clause> list = (List<Clause>) getChild(2);
    return list;
  }
  /**
   * Retrieves the Constraint list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Constraint list.
   * @apilevel low-level
   */
  public List<Clause> getConstraintListNoTransform() {
    return (List<Clause>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the Constraint list without
   * triggering rewrites.
   */
  public Clause getConstraintNoTransform(int i) {
    return (Clause) getConstraintListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Constraint list.
   * @return The node representing the Constraint list.
   * @apilevel high-level
   */
  public List<Clause> getConstraints() {
    return getConstraintList();
  }
  /**
   * Retrieves the Constraint list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Constraint list.
   * @apilevel low-level
   */
  public List<Clause> getConstraintsNoTransform() {
    return getConstraintListNoTransform();
  }
  /**
   * Retrieves the Name child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Name child.
   * @apilevel low-level
   */
  public Name getNameNoTransform() {
    return (Name) getChildNoTransform(3);
  }
  /**
   * Retrieves the child position of the optional child Name.
   * @return The the child position of the optional child Name.
   * @apilevel low-level
   */
  protected int getNameChildPosition() {
    return 3;
  }
  /**
   * @return the string identifier of the referenced element
   * @attribute syn
   * @aspect Names
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Names.jrag:36
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Names", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Names.jrag:36")
  public String name() {
    String name_value = getName().getName();
    return name_value;
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:436
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:436")
  public double getConstraintValueByName(String name) {
    {
        for (Clause clause: getConstraintList()) {
          if (clause.getDesignator().simpleName().equals(name)) {
            return clause.getExpression().evalAsDouble();
          }
        }
        throw new RuntimeException("Did not find a constraint '" + name + "'");
      }
  }
  /**
   * @attribute syn
   * @aspect Printing
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Printing.jrag:5
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Printing", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Printing.jrag:5")
  public MquatString print(MquatWriteSettings settings, int indentationLevel) {
    {
        MquatString result = new MquatString(settings, indentationLevel);
    
        result.append("request ").append(getName().print(settings, indentationLevel)).append(" for ")
            .append(getTarget().print(settings, indentationLevel)).append(" {").lb().ind();
        for (MetaParameterAssignment p: getMetaParameterAssignmentList()) {
          result.append(p.print(settings, indentationLevel)).lb();
        }
        for (Clause c: getConstraintList()) {
          result.append(c.print(settings, indentationLevel));
        }
        result.und().lb().append("}").lb();
        return result;
      }
  }
  /** Target component and all possibly required components 
   * @attribute syn
   * @aspect Requests
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Requests.jrag:26
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Requests", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Requests.jrag:26")
  public java.util.Set<Component> relevantComponents() {
    {
        return getTarget().getRef().relevantComponents();
      }
  }
  /**
   * @attribute syn
   * @aspect Requests
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Requests.jrag:44
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Requests", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Requests.jrag:44")
  public LiteralExpression getMetaParameterExpression(MetaParameter meta) {
    {
        for (MetaParameterAssignment assignment : getMetaParameterAssignmentList()) {
          if (assignment.getMetaParameterRef().getRef().equals(meta)) {
            return assignment.getLiteralExpression();
          }
        }
        return null;
      }
  }
  /**
   * @attribute syn
   * @aspect ILP
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jrag:19
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ILP", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jrag:19")
  public String getIlpName() {
    String getIlpName_value = ilpSearchRegex.matcher(name()).replaceAll("_");
    return getIlpName_value;
  }
  /**
   * @attribute inh
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:327
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:327")
  public Optional<MetaParameter> resolveMetaParameter(String name) {
    Optional<MetaParameter> resolveMetaParameter_String_value = getParent().Define_resolveMetaParameter(this, null, name);
    return resolveMetaParameter_String_value;
  }
  /**
   * @attribute inh
   * @aspect Requests
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Requests.jrag:5
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Requests", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Requests.jrag:5")
  public Name getName() {
    Name getName_value = getParent().Define_getName(this, null);
    return getName_value;
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:13
   * @apilevel internal
   */
  public Implementation Define_containingImplementation(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getConstraintListNoTransform()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:15
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      return null;
    }
    else {
      return getParent().Define_containingImplementation(this, _callerNode);
    }
  }
  protected boolean canDefine_containingImplementation(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:242
   * @apilevel internal
   */
  public Designator Define_resolveQualifiedName(ASTNode _callerNode, ASTNode _childNode, QualifiedName qn) {
    if (_callerNode == getConstraintListNoTransform()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:244
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      {
          // this designator refers either to a MetaParameter ...
          Optional<MetaParameter> meta = resolveMetaParameter(qn.getName(0).getName());
          if (meta.isPresent()) {
            return new MetaParameterDesignator(meta.get().createRef());
          }
          // ... or to a property of the target component
          return new SoftwareDesignator(new Opt<>(), getTarget().getRef().resolveProperty(qn.getName(0).getName()).get().createRef());
        }
    }
    else {
      return getParent().Define_resolveQualifiedName(this, _callerNode, qn);
    }
  }
  protected boolean canDefine_resolveQualifiedName(ASTNode _callerNode, ASTNode _childNode, QualifiedName qn) {
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
