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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Mquat.ast:30
 * @production CurrentResourceValue : {@link ASTNode} ::= <span class="component">{@link PropertyRef}</span> <span class="component">Value:{@link LiteralExpression}</span>;

 */
public class CurrentResourceValue extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:10
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(CurrentResourceValue.class);
  /**
   * @declaredat ASTNode:1
   */
  public CurrentResourceValue() {
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
  }
  /**
   * @declaredat ASTNode:13
   */
  public CurrentResourceValue(PropertyRef p0, LiteralExpression p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:18
   */
  protected int numChildren() {
    return 2;
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
  public CurrentResourceValue clone() throws CloneNotSupportedException {
    CurrentResourceValue node = (CurrentResourceValue) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public CurrentResourceValue copy() {
    try {
      CurrentResourceValue node = (CurrentResourceValue) clone();
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
  public CurrentResourceValue fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:70
   */
  public CurrentResourceValue treeCopyNoTransform() {
    CurrentResourceValue tree = (CurrentResourceValue) copy();
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
  public CurrentResourceValue treeCopy() {
    CurrentResourceValue tree = (CurrentResourceValue) copy();
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
    return super.is$Equal(node);    
  }
  /**
   * Replaces the PropertyRef child.
   * @param node The new node to replace the PropertyRef child.
   * @apilevel high-level
   */
  public void setPropertyRef(PropertyRef node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the PropertyRef child.
   * @return The current node used as the PropertyRef child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="PropertyRef")
  public PropertyRef getPropertyRef() {
    return (PropertyRef) getChild(0);
  }
  /**
   * Retrieves the PropertyRef child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the PropertyRef child.
   * @apilevel low-level
   */
  public PropertyRef getPropertyRefNoTransform() {
    return (PropertyRef) getChildNoTransform(0);
  }
  /**
   * Replaces the Value child.
   * @param node The new node to replace the Value child.
   * @apilevel high-level
   */
  public void setValue(LiteralExpression node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Value child.
   * @return The current node used as the Value child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Value")
  public LiteralExpression getValue() {
    return (LiteralExpression) getChild(1);
  }
  /**
   * Retrieves the Value child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Value child.
   * @apilevel low-level
   */
  public LiteralExpression getValueNoTransform() {
    return (LiteralExpression) getChildNoTransform(1);
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
        result.append(getPropertyRef().print(settings, indentationLevel)).append(" = ")
            .append(getValue().print(settings, indentationLevel)).lb();
        return result;
      }
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:24
   * @apilevel internal
   */
  public Clause Define_containingClause(ASTNode _callerNode, ASTNode _childNode) {
    if (getValueNoTransform() != null && _callerNode == getValue()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:31
      {
          throw new java.util.NoSuchElementException();
        }
    }
    else {
      return getParent().Define_containingClause(this, _callerNode);
    }
  }
  protected boolean canDefine_containingClause(ASTNode _callerNode, ASTNode _childNode) {
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
