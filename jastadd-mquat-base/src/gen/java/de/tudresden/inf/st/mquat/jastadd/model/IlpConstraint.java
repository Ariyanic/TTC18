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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.ast:7
 * @production IlpConstraint : {@link ASTNode} ::= <span class="component">&lt;Name:String&gt;</span> <span class="component">{@link IlpLeftHandSide}</span> <span class="component">&lt;ClauseComparator:ClauseComparator&gt;</span> <span class="component">&lt;RightHandSide:double&gt;</span>;

 */
public class IlpConstraint extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:18
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(IlpConstraint.class);
  /**
   * @declaredat ASTNode:1
   */
  public IlpConstraint() {
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
  public IlpConstraint(String p0, IlpLeftHandSide p1, ClauseComparator p2, double p3) {
    setName(p0);
    setChild(p1, 0);
    setClauseComparator(p2);
    setRightHandSide(p3);
  }
  /**
   * @declaredat ASTNode:19
   */
  public IlpConstraint(beaver.Symbol p0, IlpLeftHandSide p1, ClauseComparator p2, double p3) {
    setName(p0);
    setChild(p1, 0);
    setClauseComparator(p2);
    setRightHandSide(p3);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:26
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:32
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public IlpConstraint clone() throws CloneNotSupportedException {
    IlpConstraint node = (IlpConstraint) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:49
   */
  public IlpConstraint copy() {
    try {
      IlpConstraint node = (IlpConstraint) clone();
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
   * @declaredat ASTNode:68
   */
  @Deprecated
  public IlpConstraint fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:78
   */
  public IlpConstraint treeCopyNoTransform() {
    IlpConstraint tree = (IlpConstraint) copy();
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
   * @declaredat ASTNode:98
   */
  public IlpConstraint treeCopy() {
    IlpConstraint tree = (IlpConstraint) copy();
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
   * @declaredat ASTNode:112
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Name == ((IlpConstraint) node).tokenString_Name) && (tokenClauseComparator_ClauseComparator == ((IlpConstraint) node).tokenClauseComparator_ClauseComparator) && (tokendouble_RightHandSide == ((IlpConstraint) node).tokendouble_RightHandSide);    
  }
  /**
   * Replaces the lexeme Name.
   * @param value The new value for the lexeme Name.
   * @apilevel high-level
   */
  public void setName(String value) {
    tokenString_Name = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Name;
  /**
   */
  public int Namestart;
  /**
   */
  public int Nameend;
  /**
   * JastAdd-internal setter for lexeme Name using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Name
   * @apilevel internal
   */
  public void setName(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setName is only valid for String lexemes");
    tokenString_Name = (String)symbol.value;
    Namestart = symbol.getStart();
    Nameend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Name.
   * @return The value for the lexeme Name.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Name")
  public String getName() {
    return tokenString_Name != null ? tokenString_Name : "";
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
   * Replaces the lexeme ClauseComparator.
   * @param value The new value for the lexeme ClauseComparator.
   * @apilevel high-level
   */
  public void setClauseComparator(ClauseComparator value) {
    tokenClauseComparator_ClauseComparator = value;
  }
  /** @apilevel internal 
   */
  protected ClauseComparator tokenClauseComparator_ClauseComparator;
  /**
   * Retrieves the value for the lexeme ClauseComparator.
   * @return The value for the lexeme ClauseComparator.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ClauseComparator")
  public ClauseComparator getClauseComparator() {
    return tokenClauseComparator_ClauseComparator;
  }
  /**
   * Replaces the lexeme RightHandSide.
   * @param value The new value for the lexeme RightHandSide.
   * @apilevel high-level
   */
  public void setRightHandSide(double value) {
    tokendouble_RightHandSide = value;
  }
  /** @apilevel internal 
   */
  protected double tokendouble_RightHandSide;
  /**
   * Retrieves the value for the lexeme RightHandSide.
   * @return The value for the lexeme RightHandSide.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="RightHandSide")
  public double getRightHandSide() {
    return tokendouble_RightHandSide;
  }
  /**
   * @attribute syn
   * @aspect ILPPrinting
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILPPrinting.jrag:31
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ILPPrinting", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILPPrinting.jrag:31")
  public IlpString printIlp() {
    {
        IlpString result = new IlpString();
        result.append(getName()).append(": ").append(getIlpLeftHandSide().printIlp()).append(" ");
        switch (getClauseComparator()) {
          case LT: result.append("<"); break;
          case LE: result.append("<="); break;
          case EQ: result.append("="); break;
          case NE: result.append("!="); break;
          case GE: result.append(">="); break;
          case GT: result.append(">"); break;
        }
        return result.append(" ").append(getRightHandSide());
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
