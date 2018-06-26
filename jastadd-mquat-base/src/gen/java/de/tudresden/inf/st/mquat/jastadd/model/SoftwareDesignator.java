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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Mquat.ast:54
 * @production SoftwareDesignator : {@link Designator} ::= <span class="component">[{@link InstanceRef}]</span> <span class="component">{@link PropertyRef}</span>;

 */
public class SoftwareDesignator extends Designator implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:49
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(SoftwareDesignator.class);
  /**
   * @declaredat ASTNode:1
   */
  public SoftwareDesignator() {
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
    setChild(new Opt(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  public SoftwareDesignator(Opt<InstanceRef> p0, PropertyRef p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:19
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:25
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:29
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public SoftwareDesignator clone() throws CloneNotSupportedException {
    SoftwareDesignator node = (SoftwareDesignator) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public SoftwareDesignator copy() {
    try {
      SoftwareDesignator node = (SoftwareDesignator) clone();
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
   * @declaredat ASTNode:61
   */
  @Deprecated
  public SoftwareDesignator fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:71
   */
  public SoftwareDesignator treeCopyNoTransform() {
    SoftwareDesignator tree = (SoftwareDesignator) copy();
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
   * @declaredat ASTNode:91
   */
  public SoftwareDesignator treeCopy() {
    SoftwareDesignator tree = (SoftwareDesignator) copy();
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
   * @declaredat ASTNode:105
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the optional node for the InstanceRef child. This is the <code>Opt</code>
   * node containing the child InstanceRef, not the actual child!
   * @param opt The new node to be used as the optional node for the InstanceRef child.
   * @apilevel low-level
   */
  public void setInstanceRefOpt(Opt<InstanceRef> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) InstanceRef child.
   * @param node The new node to be used as the InstanceRef child.
   * @apilevel high-level
   */
  public void setInstanceRef(InstanceRef node) {
    getInstanceRefOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional InstanceRef child exists.
   * @return {@code true} if the optional InstanceRef child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasInstanceRef() {
    return getInstanceRefOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) InstanceRef child.
   * @return The InstanceRef child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public InstanceRef getInstanceRef() {
    return (InstanceRef) getInstanceRefOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the InstanceRef child. This is the <code>Opt</code> node containing the child InstanceRef, not the actual child!
   * @return The optional node for child the InstanceRef child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="InstanceRef")
  public Opt<InstanceRef> getInstanceRefOpt() {
    return (Opt<InstanceRef>) getChild(0);
  }
  /**
   * Retrieves the optional node for child InstanceRef. This is the <code>Opt</code> node containing the child InstanceRef, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child InstanceRef.
   * @apilevel low-level
   */
  public Opt<InstanceRef> getInstanceRefOptNoTransform() {
    return (Opt<InstanceRef>) getChildNoTransform(0);
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
        throw new RuntimeException("TODO implement ParentResourceDesignator.evalAsDouble()");
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
        Assignment providingAssignment;
        if (this.hasInstanceRef()) {
          // referencing a required component
          providingAssignment = assignment.mappedAssignment(this.getInstanceRef().getRef());
        } else {
          // use given implementation for resolving
          providingAssignment = assignment;
        }
        if (providingAssignment == null) {
          MquatWriteSettings settings = new MquatWriteSettings("");
          logger.error("Could not evaluate {} in {} of {}",
            this.print(settings), containingClause().print(settings),
        ((ModelElement)containingClause().getParent()).name());
          return 0;
        }
        for (Clause clause : providingAssignment.getImplementation().getClauseList()) {
          if (clause.isProvidingClause()) {
            if (clause.getDesignator().isSoftwareDesignator()) {
              SoftwareDesignator sd = clause.getDesignator().asSoftwareDesignator();
              if (!sd.hasInstanceRef()) {
                if (sd.getPropertyRef().getRef().equals(this.getPropertyRef().getRef())) {
                  return clause.getExpression().evalUsing(providingAssignment);
                }
                // found another provision clause with a different property
              }
            }
          }
        }
        throw new RuntimeException("this should not be happening!");
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
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:392
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:392")
  public boolean isSoftwareDesignator() {
    boolean isSoftwareDesignator_value = true;
    return isSoftwareDesignator_value;
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:395
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:395")
  public SoftwareDesignator asSoftwareDesignator() {
    SoftwareDesignator asSoftwareDesignator_value = this;
    return asSoftwareDesignator_value;
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
    
        if (hasInstanceRef()) {
          result.append(getInstanceRef().print(settings, indentationLevel)).append(".");
        }
    
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
