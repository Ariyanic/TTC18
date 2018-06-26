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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Mquat.ast:40
 * @production ComponentRequirement : {@link ASTNode} ::= <span class="component">{@link ComponentRef}</span> <span class="component">{@link Instance}*</span>;

 */
public class ComponentRequirement extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:9
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(ComponentRequirement.class);
  /**
   * @declaredat ASTNode:1
   */
  public ComponentRequirement() {
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
    setChild(new List(), 1);
  }
  /**
   * @declaredat ASTNode:14
   */
  public ComponentRequirement(ComponentRef p0, List<Instance> p1) {
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
  public ComponentRequirement clone() throws CloneNotSupportedException {
    ComponentRequirement node = (ComponentRequirement) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public ComponentRequirement copy() {
    try {
      ComponentRequirement node = (ComponentRequirement) clone();
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
  public ComponentRequirement fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:71
   */
  public ComponentRequirement treeCopyNoTransform() {
    ComponentRequirement tree = (ComponentRequirement) copy();
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
  public ComponentRequirement treeCopy() {
    ComponentRequirement tree = (ComponentRequirement) copy();
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
   * Replaces the ComponentRef child.
   * @param node The new node to replace the ComponentRef child.
   * @apilevel high-level
   */
  public void setComponentRef(ComponentRef node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the ComponentRef child.
   * @return The current node used as the ComponentRef child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="ComponentRef")
  public ComponentRef getComponentRef() {
    return (ComponentRef) getChild(0);
  }
  /**
   * Retrieves the ComponentRef child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the ComponentRef child.
   * @apilevel low-level
   */
  public ComponentRef getComponentRefNoTransform() {
    return (ComponentRef) getChildNoTransform(0);
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
   * @attribute syn
   * @aspect Printing
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Printing.jrag:5
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Printing", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Printing.jrag:5")
  public MquatString print(MquatWriteSettings settings, int indentationLevel) {
    {
        MquatString result = new MquatString(settings, indentationLevel);
    
        result.append("requires component ");
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
        result.append("of type ").append(getComponentRef().print(settings, indentationLevel)).lb();
        return result;
      }
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:40
   * @apilevel internal
   */
  public ResourceRequirement Define_containingResourceRequirement(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getInstanceListNoTransform()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:41
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      return null;
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
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:47
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      return null;
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
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:53
      int i = _callerNode.getIndexOfChild(_childNode);
      return getComponentRef().getRef();
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
