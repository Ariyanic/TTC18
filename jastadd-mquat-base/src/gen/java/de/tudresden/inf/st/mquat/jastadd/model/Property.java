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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Mquat.ast:62
 * @production Property : {@link ModelElement} ::= <span class="component">&lt;Unit:String&gt;</span>;

 */
public class Property extends ModelElement implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:38
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(Property.class);
  /**
   * @aspect ReferenceHelper
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\ReferenceHelper.jadd:14
   */
  public PropertyRef createRef() {
    return new PropertyRef(new Name(name()), this);
  }
  /**
   * @declaredat ASTNode:1
   */
  public Property() {
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
  public Property(Name p0, String p1) {
    setChild(p0, 0);
    setUnit(p1);
  }
  /**
   * @declaredat ASTNode:17
   */
  public Property(Name p0, beaver.Symbol p1) {
    setChild(p0, 0);
    setUnit(p1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 1;
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
  public Property clone() throws CloneNotSupportedException {
    Property node = (Property) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public Property copy() {
    try {
      Property node = (Property) clone();
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
  public Property fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public Property treeCopyNoTransform() {
    Property tree = (Property) copy();
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
  public Property treeCopy() {
    Property tree = (Property) copy();
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
    return super.is$Equal(node) && (tokenString_Unit == ((Property) node).tokenString_Unit);    
  }
  /**
   * Replaces the Name child.
   * @param node The new node to replace the Name child.
   * @apilevel high-level
   */
  public void setName(Name node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Name child.
   * @return The current node used as the Name child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Name")
  public Name getName() {
    return (Name) getChild(0);
  }
  /**
   * Retrieves the Name child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Name child.
   * @apilevel low-level
   */
  public Name getNameNoTransform() {
    return (Name) getChildNoTransform(0);
  }
  /**
   * Replaces the lexeme Unit.
   * @param value The new value for the lexeme Unit.
   * @apilevel high-level
   */
  public void setUnit(String value) {
    tokenString_Unit = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Unit;
  /**
   */
  public int Unitstart;
  /**
   */
  public int Unitend;
  /**
   * JastAdd-internal setter for lexeme Unit using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Unit
   * @apilevel internal
   */
  public void setUnit(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setUnit is only valid for String lexemes");
    tokenString_Unit = (String)symbol.value;
    Unitstart = symbol.getStart();
    Unitend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Unit.
   * @return The value for the lexeme Unit.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Unit")
  public String getUnit() {
    return tokenString_Unit != null ? tokenString_Unit : "";
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
    
        result.append("property ").append(getName().print(settings, indentationLevel)).append(" [");
        result.append(getUnit()).append("]").lb();
    
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
