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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.ast:13
 * @production IlpMappingVariable : {@link IlpVariable} ::= <span class="component">&lt;Resource:Resource&gt;</span>;

 */
public class IlpMappingVariable extends IlpVariable implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:20
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(IlpMappingVariable.class);
  /**
   * @declaredat ASTNode:1
   */
  public IlpMappingVariable() {
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
  public IlpMappingVariable(String p0, Request p1, Implementation p2, Resource p3) {
    setName(p0);
    setRequest(p1);
    setImpl(p2);
    setResource(p3);
  }
  /**
   * @declaredat ASTNode:18
   */
  public IlpMappingVariable(beaver.Symbol p0, Request p1, Implementation p2, Resource p3) {
    setName(p0);
    setRequest(p1);
    setImpl(p2);
    setResource(p3);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:25
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:31
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public IlpMappingVariable clone() throws CloneNotSupportedException {
    IlpMappingVariable node = (IlpMappingVariable) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:48
   */
  public IlpMappingVariable copy() {
    try {
      IlpMappingVariable node = (IlpMappingVariable) clone();
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
   * @declaredat ASTNode:67
   */
  @Deprecated
  public IlpMappingVariable fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:77
   */
  public IlpMappingVariable treeCopyNoTransform() {
    IlpMappingVariable tree = (IlpMappingVariable) copy();
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
   * @declaredat ASTNode:97
   */
  public IlpMappingVariable treeCopy() {
    IlpMappingVariable tree = (IlpMappingVariable) copy();
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
   * @declaredat ASTNode:111
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Name == ((IlpMappingVariable) node).tokenString_Name) && (tokenRequest_Request == ((IlpMappingVariable) node).tokenRequest_Request) && (tokenImplementation_Impl == ((IlpMappingVariable) node).tokenImplementation_Impl) && (tokenResource_Resource == ((IlpMappingVariable) node).tokenResource_Resource);    
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
  /**
   * Replaces the lexeme Resource.
   * @param value The new value for the lexeme Resource.
   * @apilevel high-level
   */
  public void setResource(Resource value) {
    tokenResource_Resource = value;
  }
  /** @apilevel internal 
   */
  protected Resource tokenResource_Resource;
  /**
   * Retrieves the value for the lexeme Resource.
   * @return The value for the lexeme Resource.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Resource")
  public Resource getResource() {
    return tokenResource_Resource;
  }
  /**
   * checks if an IlpVariable is a mapping variable
   * @attribute syn
   * @aspect ILP
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jrag:6
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ILP", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jrag:6")
  public boolean isMappingVariable() {
    boolean isMappingVariable_value = true;
    return isMappingVariable_value;
  }
  /**
   * @return itself if it is a mapping variable, otherwise null
   * @attribute syn
   * @aspect ILP
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jrag:12
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ILP", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jrag:12")
  public IlpMappingVariable asMappingVariable() {
    IlpMappingVariable asMappingVariable_value = this;
    return asMappingVariable_value;
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
