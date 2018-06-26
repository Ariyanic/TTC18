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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Mquat.ast:28
 * @production Resource : {@link ModelElement} ::= <span class="component">Type:{@link ResourceTypeRef}</span> <span class="component">SubResource:{@link Resource}*</span> <span class="component">{@link CurrentResourceValue}*</span>;

 */
public class Resource extends ModelElement implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:44
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(Resource.class);
  /**
   * @declaredat ASTNode:1
   */
  public Resource() {
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
    children = new ASTNode[4];
    setChild(new List(), 2);
    setChild(new List(), 3);
  }
  /**
   * @declaredat ASTNode:15
   */
  public Resource(Name p0, ResourceTypeRef p1, List<Resource> p2, List<CurrentResourceValue> p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 4;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:28
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public Resource clone() throws CloneNotSupportedException {
    Resource node = (Resource) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public Resource copy() {
    try {
      Resource node = (Resource) clone();
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
   * @declaredat ASTNode:64
   */
  @Deprecated
  public Resource fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public Resource treeCopyNoTransform() {
    Resource tree = (Resource) copy();
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
   * @declaredat ASTNode:94
   */
  public Resource treeCopy() {
    Resource tree = (Resource) copy();
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
   * @declaredat ASTNode:108
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Name child.
   * @param node The new node to replace the Name child.
   * @apilevel high-level
   */
  public void setName(Name node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Name child.
   * @return The current node used as the Name child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Name")
  public Name getName() {
    return (Name) getChild(0);
  }
  /**
   * Retrieves the Name child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Name child.
   * @apilevel low-level
   */
  public Name getNameNoTransform() {
    return (Name) getChildNoTransform(0);
  }
  /**
   * Replaces the Type child.
   * @param node The new node to replace the Type child.
   * @apilevel high-level
   */
  public void setType(ResourceTypeRef node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Type child.
   * @return The current node used as the Type child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Type")
  public ResourceTypeRef getType() {
    return (ResourceTypeRef) getChild(1);
  }
  /**
   * Retrieves the Type child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Type child.
   * @apilevel low-level
   */
  public ResourceTypeRef getTypeNoTransform() {
    return (ResourceTypeRef) getChildNoTransform(1);
  }
  /**
   * Replaces the SubResource list.
   * @param list The new list node to be used as the SubResource list.
   * @apilevel high-level
   */
  public void setSubResourceList(List<Resource> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the SubResource list.
   * @return Number of children in the SubResource list.
   * @apilevel high-level
   */
  public int getNumSubResource() {
    return getSubResourceList().getNumChild();
  }
  /**
   * Retrieves the number of children in the SubResource list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the SubResource list.
   * @apilevel low-level
   */
  public int getNumSubResourceNoTransform() {
    return getSubResourceListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the SubResource list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the SubResource list.
   * @apilevel high-level
   */
  public Resource getSubResource(int i) {
    return (Resource) getSubResourceList().getChild(i);
  }
  /**
   * Check whether the SubResource list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasSubResource() {
    return getSubResourceList().getNumChild() != 0;
  }
  /**
   * Append an element to the SubResource list.
   * @param node The element to append to the SubResource list.
   * @apilevel high-level
   */
  public void addSubResource(Resource node) {
    List<Resource> list = (parent == null) ? getSubResourceListNoTransform() : getSubResourceList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addSubResourceNoTransform(Resource node) {
    List<Resource> list = getSubResourceListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the SubResource list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setSubResource(Resource node, int i) {
    List<Resource> list = getSubResourceList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the SubResource list.
   * @return The node representing the SubResource list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="SubResource")
  public List<Resource> getSubResourceList() {
    List<Resource> list = (List<Resource>) getChild(2);
    return list;
  }
  /**
   * Retrieves the SubResource list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SubResource list.
   * @apilevel low-level
   */
  public List<Resource> getSubResourceListNoTransform() {
    return (List<Resource>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the SubResource list without
   * triggering rewrites.
   */
  public Resource getSubResourceNoTransform(int i) {
    return (Resource) getSubResourceListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the SubResource list.
   * @return The node representing the SubResource list.
   * @apilevel high-level
   */
  public List<Resource> getSubResources() {
    return getSubResourceList();
  }
  /**
   * Retrieves the SubResource list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SubResource list.
   * @apilevel low-level
   */
  public List<Resource> getSubResourcesNoTransform() {
    return getSubResourceListNoTransform();
  }
  /**
   * Replaces the CurrentResourceValue list.
   * @param list The new list node to be used as the CurrentResourceValue list.
   * @apilevel high-level
   */
  public void setCurrentResourceValueList(List<CurrentResourceValue> list) {
    setChild(list, 3);
  }
  /**
   * Retrieves the number of children in the CurrentResourceValue list.
   * @return Number of children in the CurrentResourceValue list.
   * @apilevel high-level
   */
  public int getNumCurrentResourceValue() {
    return getCurrentResourceValueList().getNumChild();
  }
  /**
   * Retrieves the number of children in the CurrentResourceValue list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the CurrentResourceValue list.
   * @apilevel low-level
   */
  public int getNumCurrentResourceValueNoTransform() {
    return getCurrentResourceValueListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the CurrentResourceValue list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the CurrentResourceValue list.
   * @apilevel high-level
   */
  public CurrentResourceValue getCurrentResourceValue(int i) {
    return (CurrentResourceValue) getCurrentResourceValueList().getChild(i);
  }
  /**
   * Check whether the CurrentResourceValue list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasCurrentResourceValue() {
    return getCurrentResourceValueList().getNumChild() != 0;
  }
  /**
   * Append an element to the CurrentResourceValue list.
   * @param node The element to append to the CurrentResourceValue list.
   * @apilevel high-level
   */
  public void addCurrentResourceValue(CurrentResourceValue node) {
    List<CurrentResourceValue> list = (parent == null) ? getCurrentResourceValueListNoTransform() : getCurrentResourceValueList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addCurrentResourceValueNoTransform(CurrentResourceValue node) {
    List<CurrentResourceValue> list = getCurrentResourceValueListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the CurrentResourceValue list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setCurrentResourceValue(CurrentResourceValue node, int i) {
    List<CurrentResourceValue> list = getCurrentResourceValueList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the CurrentResourceValue list.
   * @return The node representing the CurrentResourceValue list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="CurrentResourceValue")
  public List<CurrentResourceValue> getCurrentResourceValueList() {
    List<CurrentResourceValue> list = (List<CurrentResourceValue>) getChild(3);
    return list;
  }
  /**
   * Retrieves the CurrentResourceValue list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the CurrentResourceValue list.
   * @apilevel low-level
   */
  public List<CurrentResourceValue> getCurrentResourceValueListNoTransform() {
    return (List<CurrentResourceValue>) getChildNoTransform(3);
  }
  /**
   * @return the element at index {@code i} in the CurrentResourceValue list without
   * triggering rewrites.
   */
  public CurrentResourceValue getCurrentResourceValueNoTransform(int i) {
    return (CurrentResourceValue) getCurrentResourceValueListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the CurrentResourceValue list.
   * @return The node representing the CurrentResourceValue list.
   * @apilevel high-level
   */
  public List<CurrentResourceValue> getCurrentResourceValues() {
    return getCurrentResourceValueList();
  }
  /**
   * Retrieves the CurrentResourceValue list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the CurrentResourceValue list.
   * @apilevel low-level
   */
  public List<CurrentResourceValue> getCurrentResourceValuesNoTransform() {
    return getCurrentResourceValueListNoTransform();
  }
  /**
   * @attribute syn
   * @aspect ModelStatistics
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\ModelStatistics.jrag:23
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ModelStatistics", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\ModelStatistics.jrag:23")
  public int numResources() {
    {
        return 1 + getNumSubResource();
      }
  }
  /**
   * @attribute syn
   * @aspect ModelStatistics
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\ModelStatistics.jrag:35
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ModelStatistics", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\ModelStatistics.jrag:35")
  public int numContainers() {
    {
        int total = (getType().getRef().getContainer() ? 1 : 0);
        for (Resource sub : getSubResourceList()) {
          total += sub.numContainers();
        }
        return total;
      }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:145
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:145")
  public Optional<Resource> resolveResource(String name) {
    {
        if (name().equals(name)) {
          return Optional.of(this);
        }
        for (Resource sub : getSubResourceList()) {
          Optional<Resource> result = sub.resolveResource(name);
          if (result.isPresent()) {
            return result;
          }
        }
        return Optional.empty();
      }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:158
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:158")
  public Optional<Resource> resolveResourceByTypeName(String name) {
    {
        for (Resource sub: getSubResourceList()) {
          if (sub.getType().getRef().name().equals(name)) {
            return Optional.of(sub);
          }
        }
        return Optional.empty();
      }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:167
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:167")
  public java.util.List<Resource> findSubResourcesByTypeName(String name) {
    {
        java.util.List<Resource> result = new java.util.ArrayList<>();
        for (Resource sub: getSubResourceList()) {
          if (sub.getType().getRef().name().equals(name)) {
            result.add(sub);
          }
        }
        return result;
      }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:414
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:414")
  public double getCurrentValueByPropertyName(String name) {
    {
        for (CurrentResourceValue value: getCurrentResourceValueList()) {
          if (value.getPropertyRef().getRef().name().equals(name)) {
            return value.getValue().evalAsDouble();
          }
        }
        throw new RuntimeException("Did not find a value for a property '" + name + "'");
      }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:425
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:425")
  public double getCurrentValueByProperty(Property property) {
    {
        for (CurrentResourceValue value: getCurrentResourceValueList()) {
          if (value.getPropertyRef().getRef() == property) {
            return value.getValue().evalAsDouble();
          }
        }
        throw new RuntimeException("Did not find a value for a property '" + property.name() + "'");
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
        result.append("resource ").append(getName().print(settings, indentationLevel)).append(":").
            append(getType().print(settings, indentationLevel)).append(" {").lb().ind();
        indentationLevel++;
        for (Resource subResource: getSubResourceList()) {
          result.append(subResource.print(settings, indentationLevel));
        }
        for (CurrentResourceValue value: getCurrentResourceValueList()) {
          result.append(value.print(settings, indentationLevel));
        }
        indentationLevel--;
        result.und().append("}").lb();
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
