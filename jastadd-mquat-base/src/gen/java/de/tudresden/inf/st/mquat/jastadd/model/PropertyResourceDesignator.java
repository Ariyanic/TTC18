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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Mquat.ast:55
 * @production PropertyResourceDesignator : {@link Designator} ::= <span class="component">{@link InstanceRef}</span> <span class="component">{@link PropertyRef}</span>;

 */
public class PropertyResourceDesignator extends Designator implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:40
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(PropertyResourceDesignator.class);
  /**
   * @declaredat ASTNode:1
   */
  public PropertyResourceDesignator() {
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
  public PropertyResourceDesignator(InstanceRef p0, PropertyRef p1) {
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
  public PropertyResourceDesignator clone() throws CloneNotSupportedException {
    PropertyResourceDesignator node = (PropertyResourceDesignator) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public PropertyResourceDesignator copy() {
    try {
      PropertyResourceDesignator node = (PropertyResourceDesignator) clone();
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
  public PropertyResourceDesignator fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:70
   */
  public PropertyResourceDesignator treeCopyNoTransform() {
    PropertyResourceDesignator tree = (PropertyResourceDesignator) copy();
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
  public PropertyResourceDesignator treeCopy() {
    PropertyResourceDesignator tree = (PropertyResourceDesignator) copy();
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
   * Replaces the InstanceRef child.
   * @param node The new node to replace the InstanceRef child.
   * @apilevel high-level
   */
  public void setInstanceRef(InstanceRef node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the InstanceRef child.
   * @return The current node used as the InstanceRef child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="InstanceRef")
  public InstanceRef getInstanceRef() {
    return (InstanceRef) getChild(0);
  }
  /**
   * Retrieves the InstanceRef child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the InstanceRef child.
   * @apilevel low-level
   */
  public InstanceRef getInstanceRefNoTransform() {
    return (InstanceRef) getChildNoTransform(0);
  }
  /**
   * Replaces the PropertyRef child.
   * @param node The new node to replace the PropertyRef child.
   * @apilevel high-level
   */
  public void setPropertyRef(PropertyRef node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the PropertyRef child.
   * @return The current node used as the PropertyRef child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="PropertyRef")
  public PropertyRef getPropertyRef() {
    return (PropertyRef) getChild(1);
  }
  /**
   * Retrieves the PropertyRef child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the PropertyRef child.
   * @apilevel low-level
   */
  public PropertyRef getPropertyRefNoTransform() {
    return (PropertyRef) getChildNoTransform(1);
  }
  /**
   * @attribute syn
   * @aspect eval
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Eval.jrag:18
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="eval", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Eval.jrag:18")
  public double evalAsDouble() {
    {
        if (inRequiringClause()) {
          // TODO
        }
        throw new RuntimeException("TODO implement PropertyResourceDesignator.evalAsDouble()");
      }
  }
  /**
   * @attribute syn
   * @aspect eval
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Eval.jrag:55
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="eval", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Eval.jrag:55")
  public double evalUsing(Assignment assignment) {
    {
        Resource resource = assignment.mappedResource(this.getInstanceRef().getRef());
        return resource.getCurrentValueByProperty(this.getPropertyRef().getRef());
      }
  }
  /**
   * @attribute syn
   * @aspect Names
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Names.jrag:38
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Names", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Names.jrag:38")
  public String simpleName() {
    String simpleName_value = getPropertyRef().name();
    return simpleName_value;
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:398
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:398")
  public boolean isPropertyResourceDesignator() {
    boolean isPropertyResourceDesignator_value = true;
    return isPropertyResourceDesignator_value;
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:401
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:401")
  public PropertyResourceDesignator asPropertyResourceDesignator() {
    PropertyResourceDesignator asPropertyResourceDesignator_value = this;
    return asPropertyResourceDesignator_value;
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
    
        result.append(getInstanceRef().print(settings, indentationLevel)).append(".");
    
        result.append(getPropertyRef().print(settings, indentationLevel));
    
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
