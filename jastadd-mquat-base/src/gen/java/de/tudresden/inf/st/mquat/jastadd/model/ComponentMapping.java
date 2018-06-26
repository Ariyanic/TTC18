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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Solution.ast:4
 * @production ComponentMapping : {@link ASTNode} ::= <span class="component">&lt;Instance:Instance&gt;</span> <span class="component">{@link Assignment}</span>;

 */
public class ComponentMapping extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:8
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(ComponentMapping.class);
  /**
   * @aspect Printing
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Printing.jrag:45
   */
  public MquatString print(MquatWriteSettings settings, int indentationLevel){
    MquatString result = new MquatString(settings, indentationLevel);
    result.append(getInstance() == null ? "<no instance>" : getInstance().name());
    result.append((getAssignment() == null) ? "<no assignment>" : getAssignment().print(settings, indentationLevel));
    return result.lb();
  }
  /**
   * @declaredat ASTNode:1
   */
  public ComponentMapping() {
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
  }
  /**
   * @declaredat ASTNode:13
   */
  public ComponentMapping(Instance p0, Assignment p1) {
    setInstance(p0);
    setChild(p1, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:18
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:24
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public ComponentMapping clone() throws CloneNotSupportedException {
    ComponentMapping node = (ComponentMapping) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public ComponentMapping copy() {
    try {
      ComponentMapping node = (ComponentMapping) clone();
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
   * @declaredat ASTNode:60
   */
  @Deprecated
  public ComponentMapping fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:70
   */
  public ComponentMapping treeCopyNoTransform() {
    ComponentMapping tree = (ComponentMapping) copy();
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
   * @declaredat ASTNode:90
   */
  public ComponentMapping treeCopy() {
    ComponentMapping tree = (ComponentMapping) copy();
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
   * @declaredat ASTNode:104
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenInstance_Instance == ((ComponentMapping) node).tokenInstance_Instance);    
  }
  /**
   * Replaces the lexeme Instance.
   * @param value The new value for the lexeme Instance.
   * @apilevel high-level
   */
  public void setInstance(Instance value) {
    tokenInstance_Instance = value;
  }
  /** @apilevel internal 
   */
  protected Instance tokenInstance_Instance;
  /**
   * Retrieves the value for the lexeme Instance.
   * @return The value for the lexeme Instance.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Instance")
  public Instance getInstance() {
    return tokenInstance_Instance;
  }
  /**
   * Replaces the Assignment child.
   * @param node The new node to replace the Assignment child.
   * @apilevel high-level
   */
  public void setAssignment(Assignment node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Assignment child.
   * @return The current node used as the Assignment child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Assignment")
  public Assignment getAssignment() {
    return (Assignment) getChild(0);
  }
  /**
   * Retrieves the Assignment child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Assignment child.
   * @apilevel low-level
   */
  public Assignment getAssignmentNoTransform() {
    return (Assignment) getChildNoTransform(0);
  }
  /**
   * @attribute inh
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Navigation.jrag:13
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Navigation.jrag:13")
  public Assignment containingAssignment() {
    Assignment containingAssignment_value = getParent().Define_containingAssignment(this, null);
    return containingAssignment_value;
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Navigation.jrag:7
   * @apilevel internal
   */
  public ComponentMapping Define_containingComponentMapping(ASTNode _callerNode, ASTNode _childNode) {
    if (getAssignmentNoTransform() != null && _callerNode == getAssignment()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Navigation.jrag:8
      return this;
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
