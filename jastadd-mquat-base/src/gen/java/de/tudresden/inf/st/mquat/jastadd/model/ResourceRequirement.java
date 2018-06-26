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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Mquat.ast:26
 * @production ResourceRequirement : {@link ASTNode} ::= <span class="component">{@link ResourceTypeRef}</span> <span class="component">{@link Instance}*</span> <span class="component">{@link ResourceRequirement}*</span>;

 */
public class ResourceRequirement extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:46
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(ResourceRequirement.class);
  /**
   * @declaredat ASTNode:1
   */
  public ResourceRequirement() {
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
    children = new ASTNode[3];
    setChild(new List(), 1);
    setChild(new List(), 2);
  }
  /**
   * @declaredat ASTNode:15
   */
  public ResourceRequirement(ResourceTypeRef p0, List<Instance> p1, List<ResourceRequirement> p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 3;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:27
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public ResourceRequirement clone() throws CloneNotSupportedException {
    ResourceRequirement node = (ResourceRequirement) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public ResourceRequirement copy() {
    try {
      ResourceRequirement node = (ResourceRequirement) clone();
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
   * @declaredat ASTNode:63
   */
  @Deprecated
  public ResourceRequirement fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:73
   */
  public ResourceRequirement treeCopyNoTransform() {
    ResourceRequirement tree = (ResourceRequirement) copy();
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
   * @declaredat ASTNode:93
   */
  public ResourceRequirement treeCopy() {
    ResourceRequirement tree = (ResourceRequirement) copy();
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
   * @declaredat ASTNode:107
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the ResourceTypeRef child.
   * @param node The new node to replace the ResourceTypeRef child.
   * @apilevel high-level
   */
  public void setResourceTypeRef(ResourceTypeRef node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the ResourceTypeRef child.
   * @return The current node used as the ResourceTypeRef child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="ResourceTypeRef")
  public ResourceTypeRef getResourceTypeRef() {
    return (ResourceTypeRef) getChild(0);
  }
  /**
   * Retrieves the ResourceTypeRef child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the ResourceTypeRef child.
   * @apilevel low-level
   */
  public ResourceTypeRef getResourceTypeRefNoTransform() {
    return (ResourceTypeRef) getChildNoTransform(0);
  }
  /**
   * Replaces the Instance list.
   * @param list The new list node to be used as the Instance list.
   * @apilevel high-level
   */
  public void setInstanceList(List<Instance> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the Instance list.
   * @return Number of children in the Instance list.
   * @apilevel high-level
   */
  public int getNumInstance() {
    return getInstanceList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Instance list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Instance list.
   * @apilevel low-level
   */
  public int getNumInstanceNoTransform() {
    return getInstanceListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Instance list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Instance list.
   * @apilevel high-level
   */
  public Instance getInstance(int i) {
    return (Instance) getInstanceList().getChild(i);
  }
  /**
   * Check whether the Instance list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasInstance() {
    return getInstanceList().getNumChild() != 0;
  }
  /**
   * Append an element to the Instance list.
   * @param node The element to append to the Instance list.
   * @apilevel high-level
   */
  public void addInstance(Instance node) {
    List<Instance> list = (parent == null) ? getInstanceListNoTransform() : getInstanceList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addInstanceNoTransform(Instance node) {
    List<Instance> list = getInstanceListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Instance list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setInstance(Instance node, int i) {
    List<Instance> list = getInstanceList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Instance list.
   * @return The node representing the Instance list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Instance")
  public List<Instance> getInstanceList() {
    List<Instance> list = (List<Instance>) getChild(1);
    return list;
  }
  /**
   * Retrieves the Instance list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Instance list.
   * @apilevel low-level
   */
  public List<Instance> getInstanceListNoTransform() {
    return (List<Instance>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the Instance list without
   * triggering rewrites.
   */
  public Instance getInstanceNoTransform(int i) {
    return (Instance) getInstanceListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Instance list.
   * @return The node representing the Instance list.
   * @apilevel high-level
   */
  public List<Instance> getInstances() {
    return getInstanceList();
  }
  /**
   * Retrieves the Instance list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Instance list.
   * @apilevel low-level
   */
  public List<Instance> getInstancesNoTransform() {
    return getInstanceListNoTransform();
  }
  /**
   * Replaces the ResourceRequirement list.
   * @param list The new list node to be used as the ResourceRequirement list.
   * @apilevel high-level
   */
  public void setResourceRequirementList(List<ResourceRequirement> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the ResourceRequirement list.
   * @return Number of children in the ResourceRequirement list.
   * @apilevel high-level
   */
  public int getNumResourceRequirement() {
    return getResourceRequirementList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ResourceRequirement list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ResourceRequirement list.
   * @apilevel low-level
   */
  public int getNumResourceRequirementNoTransform() {
    return getResourceRequirementListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ResourceRequirement list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ResourceRequirement list.
   * @apilevel high-level
   */
  public ResourceRequirement getResourceRequirement(int i) {
    return (ResourceRequirement) getResourceRequirementList().getChild(i);
  }
  /**
   * Check whether the ResourceRequirement list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasResourceRequirement() {
    return getResourceRequirementList().getNumChild() != 0;
  }
  /**
   * Append an element to the ResourceRequirement list.
   * @param node The element to append to the ResourceRequirement list.
   * @apilevel high-level
   */
  public void addResourceRequirement(ResourceRequirement node) {
    List<ResourceRequirement> list = (parent == null) ? getResourceRequirementListNoTransform() : getResourceRequirementList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addResourceRequirementNoTransform(ResourceRequirement node) {
    List<ResourceRequirement> list = getResourceRequirementListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ResourceRequirement list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setResourceRequirement(ResourceRequirement node, int i) {
    List<ResourceRequirement> list = getResourceRequirementList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ResourceRequirement list.
   * @return The node representing the ResourceRequirement list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ResourceRequirement")
  public List<ResourceRequirement> getResourceRequirementList() {
    List<ResourceRequirement> list = (List<ResourceRequirement>) getChild(2);
    return list;
  }
  /**
   * Retrieves the ResourceRequirement list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ResourceRequirement list.
   * @apilevel low-level
   */
  public List<ResourceRequirement> getResourceRequirementListNoTransform() {
    return (List<ResourceRequirement>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the ResourceRequirement list without
   * triggering rewrites.
   */
  public ResourceRequirement getResourceRequirementNoTransform(int i) {
    return (ResourceRequirement) getResourceRequirementListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ResourceRequirement list.
   * @return The node representing the ResourceRequirement list.
   * @apilevel high-level
   */
  public List<ResourceRequirement> getResourceRequirements() {
    return getResourceRequirementList();
  }
  /**
   * Retrieves the ResourceRequirement list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ResourceRequirement list.
   * @apilevel low-level
   */
  public List<ResourceRequirement> getResourceRequirementsNoTransform() {
    return getResourceRequirementListNoTransform();
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:195
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:195")
  public Optional<Instance> resolveInstance(String name) {
    {
        // search sub resource requirements
        for (ResourceRequirement subRequirement : getResourceRequirementList()) {
          for (Instance instance : subRequirement.getInstanceList()) {
            if (instance.name().equals(name)) {
              return Optional.of(instance);
            }
          }
        }
        return Optional.empty();
      }
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
        for (Instance instance: getInstanceList()) {
          if (!first) {
            result.append(", ");
          }
          result.append(instance.print(settings, indentationLevel));
          first = false;
        }
        if (getInstanceList().numChildren() > 0) {
          result.append(" ");
        }
        result.append("of type ").append(getResourceTypeRef().print(settings, indentationLevel));
        if (getNumResourceRequirement() > 0) {
          // iterate over nested requirements
          result.append(" with {").ind().lb();
          for (ResourceRequirement subReq : getResourceRequirementList()) {
            result.append(subReq.print(settings, indentationLevel + 1));
          }
          result.und().lb().append("}");
        }
        result.lb();
        return result;
      }
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:40
   * @apilevel internal
   */
  public ResourceRequirement Define_containingResourceRequirement(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getInstanceListNoTransform()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:42
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      return this;
    }
    else {
      return getParent().Define_containingResourceRequirement(this, _callerNode);
    }
  }
  protected boolean canDefine_containingResourceRequirement(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:46
   * @apilevel internal
   */
  public ResourceType Define_referringResourceType(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getInstanceListNoTransform()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:48
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      return getResourceTypeRef().getRef();
    }
    else {
      return getParent().Define_referringResourceType(this, _callerNode);
    }
  }
  protected boolean canDefine_referringResourceType(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:52
   * @apilevel internal
   */
  public Component Define_referringComponent(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getInstanceListNoTransform()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:54
      int i = _callerNode.getIndexOfChild(_childNode);
      return null;
    }
    else {
      return getParent().Define_referringComponent(this, _callerNode);
    }
  }
  protected boolean canDefine_referringComponent(ASTNode _callerNode, ASTNode _childNode) {
    return true;
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
