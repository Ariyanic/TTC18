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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.ast:12
 * @production IlpAllResourcesVariable : {@link IlpVariable};

 */
public class IlpAllResourcesVariable extends IlpVariable implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:16
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(IlpAllResourcesVariable.class);
  /**
   * @declaredat ASTNode:1
   */
  public IlpAllResourcesVariable() {
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
  }
  /**
   * @declaredat ASTNode:12
   */
  public IlpAllResourcesVariable(String p0, Request p1, Implementation p2) {
    setName(p0);
    setRequest(p1);
    setImpl(p2);
  }
  /**
   * @declaredat ASTNode:17
   */
  public IlpAllResourcesVariable(beaver.Symbol p0, Request p1, Implementation p2) {
    setName(p0);
    setRequest(p1);
    setImpl(p2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:29
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public IlpAllResourcesVariable clone() throws CloneNotSupportedException {
    IlpAllResourcesVariable node = (IlpAllResourcesVariable) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public IlpAllResourcesVariable copy() {
    try {
      IlpAllResourcesVariable node = (IlpAllResourcesVariable) clone();
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
   * @declaredat ASTNode:65
   */
  @Deprecated
  public IlpAllResourcesVariable fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public IlpAllResourcesVariable treeCopyNoTransform() {
    IlpAllResourcesVariable tree = (IlpAllResourcesVariable) copy();
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
   * @declaredat ASTNode:95
   */
  public IlpAllResourcesVariable treeCopy() {
    IlpAllResourcesVariable tree = (IlpAllResourcesVariable) copy();
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
   * @declaredat ASTNode:109
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Name == ((IlpAllResourcesVariable) node).tokenString_Name) && (tokenRequest_Request == ((IlpAllResourcesVariable) node).tokenRequest_Request) && (tokenImplementation_Impl == ((IlpAllResourcesVariable) node).tokenImplementation_Impl);    
  }
  /**
   * Replaces the lexeme Name.
   * @param value The new value for the lexeme Name.
   * @apilevel high-level
   */
  public void setName(String value) {
    tokenString_Name = value;
  }
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
   * Replaces the lexeme Request.
   * @param value The new value for the lexeme Request.
   * @apilevel high-level
   */
  public void setRequest(Request value) {
    tokenRequest_Request = value;
  }
  /**
   * Retrieves the value for the lexeme Request.
   * @return The value for the lexeme Request.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Request")
  public Request getRequest() {
    return tokenRequest_Request;
  }
  /**
   * Replaces the lexeme Impl.
   * @param value The new value for the lexeme Impl.
   * @apilevel high-level
   */
  public void setImpl(Implementation value) {
    tokenImplementation_Impl = value;
  }
  /**
   * Retrieves the value for the lexeme Impl.
   * @return The value for the lexeme Impl.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Impl")
  public Implementation getImpl() {
    return tokenImplementation_Impl;
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
