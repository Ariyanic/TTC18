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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Solution.ast:3
 * @production ResourceMapping : {@link ASTNode} ::= <span class="component">&lt;Instance:Instance&gt;</span> <span class="component">&lt;Resource:Resource&gt;</span> <span class="component">{@link ResourceMapping}*</span>;

 */
public class ResourceMapping extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:45
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(ResourceMapping.class);
  /**
   * @return a deep copy of the resource mapping
   * @aspect Helpers
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Helpers.jadd:25
   */
  public ResourceMapping deepCopy() {
    ResourceMapping copy = new ResourceMapping();
    copy.setInstance(this.getInstance());
    copy.setResource(this.getResource());
    for (ResourceMapping subMapping : getResourceMappingList()) {
      copy.addResourceMapping(subMapping.deepCopy());
    }
    return copy;
  }
  /**
   * @aspect Printing
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Printing.jrag:29
   */
  public MquatString print(MquatWriteSettings settings, int indentationLevel) {
    MquatString result = new MquatString(settings, indentationLevel);
    result.append(getInstance() == null ? "<no instance>" : getInstance().name())
        .append(" -> ").append((getResource() == null) ? "<no resource>" : getResource().name());
    if (getNumResourceMapping() > 0) {
      result.append(" {").lb().ind();
      for (ResourceMapping subMapping : getResourceMappingList()) {
        result.append(subMapping.print(settings, indentationLevel));
      }
      result.und().append("}").lb();
    } else {
      result.lb();
    }
    return result;
  }
  /**
   * @declaredat ASTNode:1
   */
  public ResourceMapping() {
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
  public ResourceMapping(Instance p0, Resource p1, List<ResourceMapping> p2) {
    setInstance(p0);
    setResource(p1);
    setChild(p2, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:20
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:26
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:30
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public ResourceMapping clone() throws CloneNotSupportedException {
    ResourceMapping node = (ResourceMapping) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public ResourceMapping copy() {
    try {
      ResourceMapping node = (ResourceMapping) clone();
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
   * @declaredat ASTNode:62
   */
  @Deprecated
  public ResourceMapping fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:72
   */
  public ResourceMapping treeCopyNoTransform() {
    ResourceMapping tree = (ResourceMapping) copy();
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
   * @declaredat ASTNode:92
   */
  public ResourceMapping treeCopy() {
    ResourceMapping tree = (ResourceMapping) copy();
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
   * @declaredat ASTNode:106
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenInstance_Instance == ((ResourceMapping) node).tokenInstance_Instance) && (tokenResource_Resource == ((ResourceMapping) node).tokenResource_Resource);    
  }
  /**
   * Replaces the lexeme Instance.
   * @param value The new value for the lexeme Instance.
   * @apilevel high-level
   */
  public void setInstance(Instance value) {
    tokenInstance_Instance = value;
  }
  /** @apilevel internal 
   */
  protected Instance tokenInstance_Instance;
  /**
   * Retrieves the value for the lexeme Instance.
   * @return The value for the lexeme Instance.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Instance")
  public Instance getInstance() {
    return tokenInstance_Instance;
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
   * Replaces the ResourceMapping list.
   * @param list The new list node to be used as the ResourceMapping list.
   * @apilevel high-level
   */
  public void setResourceMappingList(List<ResourceMapping> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the ResourceMapping list.
   * @return Number of children in the ResourceMapping list.
   * @apilevel high-level
   */
  public int getNumResourceMapping() {
    return getResourceMappingList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ResourceMapping list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ResourceMapping list.
   * @apilevel low-level
   */
  public int getNumResourceMappingNoTransform() {
    return getResourceMappingListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ResourceMapping list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ResourceMapping list.
   * @apilevel high-level
   */
  public ResourceMapping getResourceMapping(int i) {
    return (ResourceMapping) getResourceMappingList().getChild(i);
  }
  /**
   * Check whether the ResourceMapping list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasResourceMapping() {
    return getResourceMappingList().getNumChild() != 0;
  }
  /**
   * Append an element to the ResourceMapping list.
   * @param node The element to append to the ResourceMapping list.
   * @apilevel high-level
   */
  public void addResourceMapping(ResourceMapping node) {
    List<ResourceMapping> list = (parent == null) ? getResourceMappingListNoTransform() : getResourceMappingList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addResourceMappingNoTransform(ResourceMapping node) {
    List<ResourceMapping> list = getResourceMappingListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ResourceMapping list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setResourceMapping(ResourceMapping node, int i) {
    List<ResourceMapping> list = getResourceMappingList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ResourceMapping list.
   * @return The node representing the ResourceMapping list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ResourceMapping")
  public List<ResourceMapping> getResourceMappingList() {
    List<ResourceMapping> list = (List<ResourceMapping>) getChild(0);
    return list;
  }
  /**
   * Retrieves the ResourceMapping list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ResourceMapping list.
   * @apilevel low-level
   */
  public List<ResourceMapping> getResourceMappingListNoTransform() {
    return (List<ResourceMapping>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the ResourceMapping list without
   * triggering rewrites.
   */
  public ResourceMapping getResourceMappingNoTransform(int i) {
    return (ResourceMapping) getResourceMappingListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ResourceMapping list.
   * @return The node representing the ResourceMapping list.
   * @apilevel high-level
   */
  public List<ResourceMapping> getResourceMappings() {
    return getResourceMappingList();
  }
  /**
   * Retrieves the ResourceMapping list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ResourceMapping list.
   * @apilevel low-level
   */
  public List<ResourceMapping> getResourceMappingsNoTransform() {
    return getResourceMappingListNoTransform();
  }
  /**
   * @attribute syn
   * @aspect Traversal
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Traversal.jrag:18
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Traversal", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solution\\Traversal.jrag:18")
  public Resource mappedResource(Instance instance) {
    {
        if (this.getInstance() == instance) {
          return this.getResource();
        } else {
          for (ResourceMapping subMapping : this.getResourceMappingList()) {
            Resource result = subMapping.mappedResource(instance);
            if (result != null) {
              return result;
            }
          }
          return null;
        }
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
