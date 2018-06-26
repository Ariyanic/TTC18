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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Mquat.ast:77
 * @production Objective : {@link ASTNode} ::= <span class="component">{@link PropertyRef}</span> <span class="component">&lt;Agg:PropertyAggregation&gt;</span>;

 */
public class Objective extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:35
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(Objective.class);
  /**
   * @declaredat ASTNode:1
   */
  public Objective() {
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
  public Objective(PropertyRef p0, PropertyAggregation p1) {
    setChild(p0, 0);
    setAgg(p1);
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
  public Objective clone() throws CloneNotSupportedException {
    Objective node = (Objective) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public Objective copy() {
    try {
      Objective node = (Objective) clone();
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
  public Objective fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:70
   */
  public Objective treeCopyNoTransform() {
    Objective tree = (Objective) copy();
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
  public Objective treeCopy() {
    Objective tree = (Objective) copy();
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
    return super.is$Equal(node) && (tokenPropertyAggregation_Agg == ((Objective) node).tokenPropertyAggregation_Agg);    
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
   * Replaces the lexeme Agg.
   * @param value The new value for the lexeme Agg.
   * @apilevel high-level
   */
  public void setAgg(PropertyAggregation value) {
    tokenPropertyAggregation_Agg = value;
  }
  /** @apilevel internal 
   */
  protected PropertyAggregation tokenPropertyAggregation_Agg;
  /**
   * Retrieves the value for the lexeme Agg.
   * @return The value for the lexeme Agg.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Agg")
  public PropertyAggregation getAgg() {
    return tokenPropertyAggregation_Agg;
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
        if (getAgg() == PropertyAggregation.SUM) {
          return result.append("minimize sum(").append(getPropertyRef().print(settings, indentationLevel)).append(")").lb();
        } else if (getAgg() == PropertyAggregation.MAX) {
          return result.append("minimize maximum(").append(getPropertyRef().print(settings, indentationLevel)).append(")").lb();
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
