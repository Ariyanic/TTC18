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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.ast:5
 * @production IlpObjective : {@link ASTNode} ::= <span class="component">&lt;Kind:IlpObjectiveKind&gt;</span> <span class="component">{@link IlpLeftHandSide}</span>;

 */
public class IlpObjective extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:21
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(IlpObjective.class);
  /**
   * @declaredat ASTNode:1
   */
  public IlpObjective() {
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
  public IlpObjective(IlpObjectiveKind p0, IlpLeftHandSide p1) {
    setKind(p0);
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
  public IlpObjective clone() throws CloneNotSupportedException {
    IlpObjective node = (IlpObjective) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public IlpObjective copy() {
    try {
      IlpObjective node = (IlpObjective) clone();
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
  public IlpObjective fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:70
   */
  public IlpObjective treeCopyNoTransform() {
    IlpObjective tree = (IlpObjective) copy();
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
  public IlpObjective treeCopy() {
    IlpObjective tree = (IlpObjective) copy();
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
    return super.is$Equal(node) && (tokenIlpObjectiveKind_Kind == ((IlpObjective) node).tokenIlpObjectiveKind_Kind);    
  }
  /**
   * Replaces the lexeme Kind.
   * @param value The new value for the lexeme Kind.
   * @apilevel high-level
   */
  public void setKind(IlpObjectiveKind value) {
    tokenIlpObjectiveKind_Kind = value;
  }
  /** @apilevel internal 
   */
  protected IlpObjectiveKind tokenIlpObjectiveKind_Kind;
  /**
   * Retrieves the value for the lexeme Kind.
   * @return The value for the lexeme Kind.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Kind")
  public IlpObjectiveKind getKind() {
    return tokenIlpObjectiveKind_Kind;
  }
  /**
   * Replaces the IlpLeftHandSide child.
   * @param node The new node to replace the IlpLeftHandSide child.
   * @apilevel high-level
   */
  public void setIlpLeftHandSide(IlpLeftHandSide node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the IlpLeftHandSide child.
   * @return The current node used as the IlpLeftHandSide child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="IlpLeftHandSide")
  public IlpLeftHandSide getIlpLeftHandSide() {
    return (IlpLeftHandSide) getChild(0);
  }
  /**
   * Retrieves the IlpLeftHandSide child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the IlpLeftHandSide child.
   * @apilevel low-level
   */
  public IlpLeftHandSide getIlpLeftHandSideNoTransform() {
    return (IlpLeftHandSide) getChildNoTransform(0);
  }
  /**
   * @attribute syn
   * @aspect ILPPrinting
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILPPrinting.jrag:22
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ILPPrinting", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILPPrinting.jrag:22")
  public IlpString printIlp() {
    {
        IlpString result = new IlpString();
        switch(getKind()) {
          case MAXIMIZE: result.append("Maximize"); break;
          case MINIMIZE: result.append("Minimize"); break;
        }
        return result.lb().append(getIlpLeftHandSide().printIlp());
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
