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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Mquat.ast:8
 * @production QualifiedName : {@link ASTNode} ::= <span class="component">{@link Name}*</span>;

 */
public class QualifiedName extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:41
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(QualifiedName.class);
  /**
   * @declaredat ASTNode:1
   */
  public QualifiedName() {
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
  public QualifiedName(List<Name> p0) {
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
  public QualifiedName clone() throws CloneNotSupportedException {
    QualifiedName node = (QualifiedName) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public QualifiedName copy() {
    try {
      QualifiedName node = (QualifiedName) clone();
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
  public QualifiedName fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:70
   */
  public QualifiedName treeCopyNoTransform() {
    QualifiedName tree = (QualifiedName) copy();
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
  public QualifiedName treeCopy() {
    QualifiedName tree = (QualifiedName) copy();
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
   * Replaces the Name list.
   * @param list The new list node to be used as the Name list.
   * @apilevel high-level
   */
  public void setNameList(List<Name> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Name list.
   * @return Number of children in the Name list.
   * @apilevel high-level
   */
  public int getNumName() {
    return getNameList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Name list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Name list.
   * @apilevel low-level
   */
  public int getNumNameNoTransform() {
    return getNameListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Name list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Name list.
   * @apilevel high-level
   */
  public Name getName(int i) {
    return (Name) getNameList().getChild(i);
  }
  /**
   * Check whether the Name list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasName() {
    return getNameList().getNumChild() != 0;
  }
  /**
   * Append an element to the Name list.
   * @param node The element to append to the Name list.
   * @apilevel high-level
   */
  public void addName(Name node) {
    List<Name> list = (parent == null) ? getNameListNoTransform() : getNameList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addNameNoTransform(Name node) {
    List<Name> list = getNameListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Name list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setName(Name node, int i) {
    List<Name> list = getNameList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Name list.
   * @return The node representing the Name list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Name")
  public List<Name> getNameList() {
    List<Name> list = (List<Name>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Name list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Name list.
   * @apilevel low-level
   */
  public List<Name> getNameListNoTransform() {
    return (List<Name>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the Name list without
   * triggering rewrites.
   */
  public Name getNameNoTransform(int i) {
    return (Name) getNameListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Name list.
   * @return The node representing the Name list.
   * @apilevel high-level
   */
  public List<Name> getNames() {
    return getNameList();
  }
  /**
   * Retrieves the Name list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Name list.
   * @apilevel low-level
   */
  public List<Name> getNamesNoTransform() {
    return getNameListNoTransform();
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
    
        boolean first = true;
        for (Name name : getNameList()) {
          if (first) {
            first = false;
          } else {
            result.append(".");
          }
          result.append(name.print(settings, indentationLevel)).append(".");
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
