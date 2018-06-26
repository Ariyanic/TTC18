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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.ast:16
 * @production IlpLeftHandSide : {@link ASTNode} ::= <span class="component">{@link IlpTerm}*</span>;

 */
public class IlpLeftHandSide extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:19
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(IlpLeftHandSide.class);
  /**
   * @declaredat ASTNode:1
   */
  public IlpLeftHandSide() {
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
  public IlpLeftHandSide(List<IlpTerm> p0) {
    setChild(p0, 0);
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
  public IlpLeftHandSide clone() throws CloneNotSupportedException {
    IlpLeftHandSide node = (IlpLeftHandSide) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public IlpLeftHandSide copy() {
    try {
      IlpLeftHandSide node = (IlpLeftHandSide) clone();
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
  public IlpLeftHandSide fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:70
   */
  public IlpLeftHandSide treeCopyNoTransform() {
    IlpLeftHandSide tree = (IlpLeftHandSide) copy();
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
  public IlpLeftHandSide treeCopy() {
    IlpLeftHandSide tree = (IlpLeftHandSide) copy();
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
   * Replaces the IlpTerm list.
   * @param list The new list node to be used as the IlpTerm list.
   * @apilevel high-level
   */
  public void setIlpTermList(List<IlpTerm> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the IlpTerm list.
   * @return Number of children in the IlpTerm list.
   * @apilevel high-level
   */
  public int getNumIlpTerm() {
    return getIlpTermList().getNumChild();
  }
  /**
   * Retrieves the number of children in the IlpTerm list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the IlpTerm list.
   * @apilevel low-level
   */
  public int getNumIlpTermNoTransform() {
    return getIlpTermListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the IlpTerm list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the IlpTerm list.
   * @apilevel high-level
   */
  public IlpTerm getIlpTerm(int i) {
    return (IlpTerm) getIlpTermList().getChild(i);
  }
  /**
   * Check whether the IlpTerm list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasIlpTerm() {
    return getIlpTermList().getNumChild() != 0;
  }
  /**
   * Append an element to the IlpTerm list.
   * @param node The element to append to the IlpTerm list.
   * @apilevel high-level
   */
  public void addIlpTerm(IlpTerm node) {
    List<IlpTerm> list = (parent == null) ? getIlpTermListNoTransform() : getIlpTermList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addIlpTermNoTransform(IlpTerm node) {
    List<IlpTerm> list = getIlpTermListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the IlpTerm list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setIlpTerm(IlpTerm node, int i) {
    List<IlpTerm> list = getIlpTermList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the IlpTerm list.
   * @return The node representing the IlpTerm list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="IlpTerm")
  public List<IlpTerm> getIlpTermList() {
    List<IlpTerm> list = (List<IlpTerm>) getChild(0);
    return list;
  }
  /**
   * Retrieves the IlpTerm list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the IlpTerm list.
   * @apilevel low-level
   */
  public List<IlpTerm> getIlpTermListNoTransform() {
    return (List<IlpTerm>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the IlpTerm list without
   * triggering rewrites.
   */
  public IlpTerm getIlpTermNoTransform(int i) {
    return (IlpTerm) getIlpTermListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the IlpTerm list.
   * @return The node representing the IlpTerm list.
   * @apilevel high-level
   */
  public List<IlpTerm> getIlpTerms() {
    return getIlpTermList();
  }
  /**
   * Retrieves the IlpTerm list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the IlpTerm list.
   * @apilevel low-level
   */
  public List<IlpTerm> getIlpTermsNoTransform() {
    return getIlpTermListNoTransform();
  }
  /**
   * @attribute syn
   * @aspect ILPPrinting
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILPPrinting.jrag:56
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ILPPrinting", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILPPrinting.jrag:56")
  public IlpString printIlp() {
    {
        IlpString result = new IlpString();
        for (IlpTerm t : getIlpTermList()) {
          if (t.getValue() >= 0) {
            result.append(" +");
          } else {
            result.append(" ");
          }
          if (t.getValue() == -1) {
            result.append("-");
          } else if (t.getValue() != 1) {
            result.append(t.getValue());
          }
          result.append(" ").append(t.getRef().getName());
        }
        return result;
      }
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
