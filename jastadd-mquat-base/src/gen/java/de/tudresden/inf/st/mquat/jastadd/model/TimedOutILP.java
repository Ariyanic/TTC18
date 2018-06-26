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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.ast:2
 * @production TimedOutILP : {@link ILP} ::= <span class="component">&lt;Reason:String&gt;</span>;

 */
public class TimedOutILP extends ILP implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public TimedOutILP() {
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
    setChild(new List(), 1);
    setChild(new List(), 2);
    setChild(new List(), 3);
  }
  /**
   * @declaredat ASTNode:16
   */
  public TimedOutILP(IlpObjective p0, List<IlpConstraint> p1, List<IlpBound> p2, List<IlpVariable> p3, IlpVarInfo p4, String p5) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
    setInfo(p4);
    setReason(p5);
  }
  /**
   * @declaredat ASTNode:24
   */
  public TimedOutILP(IlpObjective p0, List<IlpConstraint> p1, List<IlpBound> p2, List<IlpVariable> p3, IlpVarInfo p4, beaver.Symbol p5) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
    setInfo(p4);
    setReason(p5);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:33
   */
  protected int numChildren() {
    return 4;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:39
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:51
   */
  public TimedOutILP clone() throws CloneNotSupportedException {
    TimedOutILP node = (TimedOutILP) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:56
   */
  public TimedOutILP copy() {
    try {
      TimedOutILP node = (TimedOutILP) clone();
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
   * @declaredat ASTNode:75
   */
  @Deprecated
  public TimedOutILP fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:85
   */
  public TimedOutILP treeCopyNoTransform() {
    TimedOutILP tree = (TimedOutILP) copy();
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
   * @declaredat ASTNode:105
   */
  public TimedOutILP treeCopy() {
    TimedOutILP tree = (TimedOutILP) copy();
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
   * @declaredat ASTNode:119
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenIlpVarInfo_Info == ((TimedOutILP) node).tokenIlpVarInfo_Info) && (tokenString_Reason == ((TimedOutILP) node).tokenString_Reason);    
  }
  /**
   * Replaces the IlpObjective child.
   * @param node The new node to replace the IlpObjective child.
   * @apilevel high-level
   */
  public void setIlpObjective(IlpObjective node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the IlpObjective child.
   * @return The current node used as the IlpObjective child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="IlpObjective")
  public IlpObjective getIlpObjective() {
    return (IlpObjective) getChild(0);
  }
  /**
   * Retrieves the IlpObjective child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the IlpObjective child.
   * @apilevel low-level
   */
  public IlpObjective getIlpObjectiveNoTransform() {
    return (IlpObjective) getChildNoTransform(0);
  }
  /**
   * Replaces the IlpConstraint list.
   * @param list The new list node to be used as the IlpConstraint list.
   * @apilevel high-level
   */
  public void setIlpConstraintList(List<IlpConstraint> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the IlpConstraint list.
   * @return Number of children in the IlpConstraint list.
   * @apilevel high-level
   */
  public int getNumIlpConstraint() {
    return getIlpConstraintList().getNumChild();
  }
  /**
   * Retrieves the number of children in the IlpConstraint list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the IlpConstraint list.
   * @apilevel low-level
   */
  public int getNumIlpConstraintNoTransform() {
    return getIlpConstraintListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the IlpConstraint list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the IlpConstraint list.
   * @apilevel high-level
   */
  public IlpConstraint getIlpConstraint(int i) {
    return (IlpConstraint) getIlpConstraintList().getChild(i);
  }
  /**
   * Check whether the IlpConstraint list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasIlpConstraint() {
    return getIlpConstraintList().getNumChild() != 0;
  }
  /**
   * Append an element to the IlpConstraint list.
   * @param node The element to append to the IlpConstraint list.
   * @apilevel high-level
   */
  public void addIlpConstraint(IlpConstraint node) {
    List<IlpConstraint> list = (parent == null) ? getIlpConstraintListNoTransform() : getIlpConstraintList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addIlpConstraintNoTransform(IlpConstraint node) {
    List<IlpConstraint> list = getIlpConstraintListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the IlpConstraint list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setIlpConstraint(IlpConstraint node, int i) {
    List<IlpConstraint> list = getIlpConstraintList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the IlpConstraint list.
   * @return The node representing the IlpConstraint list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="IlpConstraint")
  public List<IlpConstraint> getIlpConstraintList() {
    List<IlpConstraint> list = (List<IlpConstraint>) getChild(1);
    return list;
  }
  /**
   * Retrieves the IlpConstraint list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the IlpConstraint list.
   * @apilevel low-level
   */
  public List<IlpConstraint> getIlpConstraintListNoTransform() {
    return (List<IlpConstraint>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the IlpConstraint list without
   * triggering rewrites.
   */
  public IlpConstraint getIlpConstraintNoTransform(int i) {
    return (IlpConstraint) getIlpConstraintListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the IlpConstraint list.
   * @return The node representing the IlpConstraint list.
   * @apilevel high-level
   */
  public List<IlpConstraint> getIlpConstraints() {
    return getIlpConstraintList();
  }
  /**
   * Retrieves the IlpConstraint list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the IlpConstraint list.
   * @apilevel low-level
   */
  public List<IlpConstraint> getIlpConstraintsNoTransform() {
    return getIlpConstraintListNoTransform();
  }
  /**
   * Replaces the IlpBound list.
   * @param list The new list node to be used as the IlpBound list.
   * @apilevel high-level
   */
  public void setIlpBoundList(List<IlpBound> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the IlpBound list.
   * @return Number of children in the IlpBound list.
   * @apilevel high-level
   */
  public int getNumIlpBound() {
    return getIlpBoundList().getNumChild();
  }
  /**
   * Retrieves the number of children in the IlpBound list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the IlpBound list.
   * @apilevel low-level
   */
  public int getNumIlpBoundNoTransform() {
    return getIlpBoundListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the IlpBound list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the IlpBound list.
   * @apilevel high-level
   */
  public IlpBound getIlpBound(int i) {
    return (IlpBound) getIlpBoundList().getChild(i);
  }
  /**
   * Check whether the IlpBound list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasIlpBound() {
    return getIlpBoundList().getNumChild() != 0;
  }
  /**
   * Append an element to the IlpBound list.
   * @param node The element to append to the IlpBound list.
   * @apilevel high-level
   */
  public void addIlpBound(IlpBound node) {
    List<IlpBound> list = (parent == null) ? getIlpBoundListNoTransform() : getIlpBoundList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addIlpBoundNoTransform(IlpBound node) {
    List<IlpBound> list = getIlpBoundListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the IlpBound list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setIlpBound(IlpBound node, int i) {
    List<IlpBound> list = getIlpBoundList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the IlpBound list.
   * @return The node representing the IlpBound list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="IlpBound")
  public List<IlpBound> getIlpBoundList() {
    List<IlpBound> list = (List<IlpBound>) getChild(2);
    return list;
  }
  /**
   * Retrieves the IlpBound list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the IlpBound list.
   * @apilevel low-level
   */
  public List<IlpBound> getIlpBoundListNoTransform() {
    return (List<IlpBound>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the IlpBound list without
   * triggering rewrites.
   */
  public IlpBound getIlpBoundNoTransform(int i) {
    return (IlpBound) getIlpBoundListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the IlpBound list.
   * @return The node representing the IlpBound list.
   * @apilevel high-level
   */
  public List<IlpBound> getIlpBounds() {
    return getIlpBoundList();
  }
  /**
   * Retrieves the IlpBound list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the IlpBound list.
   * @apilevel low-level
   */
  public List<IlpBound> getIlpBoundsNoTransform() {
    return getIlpBoundListNoTransform();
  }
  /**
   * Replaces the IlpVariable list.
   * @param list The new list node to be used as the IlpVariable list.
   * @apilevel high-level
   */
  public void setIlpVariableList(List<IlpVariable> list) {
    setChild(list, 3);
  }
  /**
   * Retrieves the number of children in the IlpVariable list.
   * @return Number of children in the IlpVariable list.
   * @apilevel high-level
   */
  public int getNumIlpVariable() {
    return getIlpVariableList().getNumChild();
  }
  /**
   * Retrieves the number of children in the IlpVariable list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the IlpVariable list.
   * @apilevel low-level
   */
  public int getNumIlpVariableNoTransform() {
    return getIlpVariableListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the IlpVariable list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the IlpVariable list.
   * @apilevel high-level
   */
  public IlpVariable getIlpVariable(int i) {
    return (IlpVariable) getIlpVariableList().getChild(i);
  }
  /**
   * Check whether the IlpVariable list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasIlpVariable() {
    return getIlpVariableList().getNumChild() != 0;
  }
  /**
   * Append an element to the IlpVariable list.
   * @param node The element to append to the IlpVariable list.
   * @apilevel high-level
   */
  public void addIlpVariable(IlpVariable node) {
    List<IlpVariable> list = (parent == null) ? getIlpVariableListNoTransform() : getIlpVariableList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addIlpVariableNoTransform(IlpVariable node) {
    List<IlpVariable> list = getIlpVariableListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the IlpVariable list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setIlpVariable(IlpVariable node, int i) {
    List<IlpVariable> list = getIlpVariableList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the IlpVariable list.
   * @return The node representing the IlpVariable list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="IlpVariable")
  public List<IlpVariable> getIlpVariableList() {
    List<IlpVariable> list = (List<IlpVariable>) getChild(3);
    return list;
  }
  /**
   * Retrieves the IlpVariable list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the IlpVariable list.
   * @apilevel low-level
   */
  public List<IlpVariable> getIlpVariableListNoTransform() {
    return (List<IlpVariable>) getChildNoTransform(3);
  }
  /**
   * @return the element at index {@code i} in the IlpVariable list without
   * triggering rewrites.
   */
  public IlpVariable getIlpVariableNoTransform(int i) {
    return (IlpVariable) getIlpVariableListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the IlpVariable list.
   * @return The node representing the IlpVariable list.
   * @apilevel high-level
   */
  public List<IlpVariable> getIlpVariables() {
    return getIlpVariableList();
  }
  /**
   * Retrieves the IlpVariable list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the IlpVariable list.
   * @apilevel low-level
   */
  public List<IlpVariable> getIlpVariablesNoTransform() {
    return getIlpVariableListNoTransform();
  }
  /**
   * Replaces the lexeme Info.
   * @param value The new value for the lexeme Info.
   * @apilevel high-level
   */
  public void setInfo(IlpVarInfo value) {
    tokenIlpVarInfo_Info = value;
  }
  /**
   * Retrieves the value for the lexeme Info.
   * @return The value for the lexeme Info.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Info")
  public IlpVarInfo getInfo() {
    return tokenIlpVarInfo_Info;
  }
  /**
   * Replaces the lexeme Reason.
   * @param value The new value for the lexeme Reason.
   * @apilevel high-level
   */
  public void setReason(String value) {
    tokenString_Reason = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Reason;
  /**
   */
  public int Reasonstart;
  /**
   */
  public int Reasonend;
  /**
   * JastAdd-internal setter for lexeme Reason using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Reason
   * @apilevel internal
   */
  public void setReason(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setReason is only valid for String lexemes");
    tokenString_Reason = (String)symbol.value;
    Reasonstart = symbol.getStart();
    Reasonend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Reason.
   * @return The value for the lexeme Reason.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Reason")
  public String getReason() {
    return tokenString_Reason != null ? tokenString_Reason : "";
  }
  /**
   * @attribute syn
   * @aspect ILP
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jrag:32
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ILP", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jrag:32")
  public boolean hasTimeout() {
    boolean hasTimeout_value = true;
    return hasTimeout_value;
  }
  /**
   * @attribute syn
   * @aspect ILP
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jrag:37
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ILP", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jrag:37")
  public String timeoutReason() {
    String timeoutReason_value = getReason();
    return timeoutReason_value;
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
