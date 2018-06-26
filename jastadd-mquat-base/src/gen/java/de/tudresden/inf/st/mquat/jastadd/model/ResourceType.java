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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Mquat.ast:24
 * @production ResourceType : {@link ModelElement} ::= <span class="component">&lt;Container:Boolean&gt;</span> <span class="component">SubType:{@link ResourceType}*</span> <span class="component">{@link Property}*</span> <span class="component">{@link PropertyRef}*</span>;

 */
public class ResourceType extends ModelElement implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:47
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(ResourceType.class);
  /**
   * @aspect ReferenceHelper
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\ReferenceHelper.jadd:6
   */
  public ResourceTypeRef createRef() {
    return new ResourceTypeRef(new Name(name()), this);
  }
  /**
   * @declaredat ASTNode:1
   */
  public ResourceType() {
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
    setChild(new List(), 1);
    setChild(new List(), 2);
    setChild(new List(), 3);
  }
  /**
   * @declaredat ASTNode:16
   */
  public ResourceType(Name p0, Boolean p1, List<ResourceType> p2, List<Property> p3, List<PropertyRef> p4) {
    setChild(p0, 0);
    setContainer(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setChild(p4, 3);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 4;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:30
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public ResourceType clone() throws CloneNotSupportedException {
    ResourceType node = (ResourceType) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public ResourceType copy() {
    try {
      ResourceType node = (ResourceType) clone();
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
   * @declaredat ASTNode:66
   */
  @Deprecated
  public ResourceType fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:76
   */
  public ResourceType treeCopyNoTransform() {
    ResourceType tree = (ResourceType) copy();
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
   * @declaredat ASTNode:96
   */
  public ResourceType treeCopy() {
    ResourceType tree = (ResourceType) copy();
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
   * @declaredat ASTNode:110
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenBoolean_Container == ((ResourceType) node).tokenBoolean_Container);    
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
   * Replaces the lexeme Container.
   * @param value The new value for the lexeme Container.
   * @apilevel high-level
   */
  public void setContainer(Boolean value) {
    tokenBoolean_Container = value;
  }
  /** @apilevel internal 
   */
  protected Boolean tokenBoolean_Container;
  /**
   * Retrieves the value for the lexeme Container.
   * @return The value for the lexeme Container.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Container")
  public Boolean getContainer() {
    return tokenBoolean_Container;
  }
  /**
   * Replaces the SubType list.
   * @param list The new list node to be used as the SubType list.
   * @apilevel high-level
   */
  public void setSubTypeList(List<ResourceType> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the SubType list.
   * @return Number of children in the SubType list.
   * @apilevel high-level
   */
  public int getNumSubType() {
    return getSubTypeList().getNumChild();
  }
  /**
   * Retrieves the number of children in the SubType list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the SubType list.
   * @apilevel low-level
   */
  public int getNumSubTypeNoTransform() {
    return getSubTypeListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the SubType list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the SubType list.
   * @apilevel high-level
   */
  public ResourceType getSubType(int i) {
    return (ResourceType) getSubTypeList().getChild(i);
  }
  /**
   * Check whether the SubType list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasSubType() {
    return getSubTypeList().getNumChild() != 0;
  }
  /**
   * Append an element to the SubType list.
   * @param node The element to append to the SubType list.
   * @apilevel high-level
   */
  public void addSubType(ResourceType node) {
    List<ResourceType> list = (parent == null) ? getSubTypeListNoTransform() : getSubTypeList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addSubTypeNoTransform(ResourceType node) {
    List<ResourceType> list = getSubTypeListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the SubType list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setSubType(ResourceType node, int i) {
    List<ResourceType> list = getSubTypeList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the SubType list.
   * @return The node representing the SubType list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="SubType")
  public List<ResourceType> getSubTypeList() {
    List<ResourceType> list = (List<ResourceType>) getChild(1);
    return list;
  }
  /**
   * Retrieves the SubType list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SubType list.
   * @apilevel low-level
   */
  public List<ResourceType> getSubTypeListNoTransform() {
    return (List<ResourceType>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the SubType list without
   * triggering rewrites.
   */
  public ResourceType getSubTypeNoTransform(int i) {
    return (ResourceType) getSubTypeListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the SubType list.
   * @return The node representing the SubType list.
   * @apilevel high-level
   */
  public List<ResourceType> getSubTypes() {
    return getSubTypeList();
  }
  /**
   * Retrieves the SubType list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SubType list.
   * @apilevel low-level
   */
  public List<ResourceType> getSubTypesNoTransform() {
    return getSubTypeListNoTransform();
  }
  /**
   * Replaces the Property list.
   * @param list The new list node to be used as the Property list.
   * @apilevel high-level
   */
  public void setPropertyList(List<Property> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the Property list.
   * @return Number of children in the Property list.
   * @apilevel high-level
   */
  public int getNumProperty() {
    return getPropertyList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Property list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Property list.
   * @apilevel low-level
   */
  public int getNumPropertyNoTransform() {
    return getPropertyListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Property list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Property list.
   * @apilevel high-level
   */
  public Property getProperty(int i) {
    return (Property) getPropertyList().getChild(i);
  }
  /**
   * Check whether the Property list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasProperty() {
    return getPropertyList().getNumChild() != 0;
  }
  /**
   * Append an element to the Property list.
   * @param node The element to append to the Property list.
   * @apilevel high-level
   */
  public void addProperty(Property node) {
    List<Property> list = (parent == null) ? getPropertyListNoTransform() : getPropertyList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addPropertyNoTransform(Property node) {
    List<Property> list = getPropertyListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Property list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setProperty(Property node, int i) {
    List<Property> list = getPropertyList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Property list.
   * @return The node representing the Property list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Property")
  public List<Property> getPropertyList() {
    List<Property> list = (List<Property>) getChild(2);
    return list;
  }
  /**
   * Retrieves the Property list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Property list.
   * @apilevel low-level
   */
  public List<Property> getPropertyListNoTransform() {
    return (List<Property>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the Property list without
   * triggering rewrites.
   */
  public Property getPropertyNoTransform(int i) {
    return (Property) getPropertyListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Property list.
   * @return The node representing the Property list.
   * @apilevel high-level
   */
  public List<Property> getPropertys() {
    return getPropertyList();
  }
  /**
   * Retrieves the Property list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Property list.
   * @apilevel low-level
   */
  public List<Property> getPropertysNoTransform() {
    return getPropertyListNoTransform();
  }
  /**
   * Replaces the PropertyRef list.
   * @param list The new list node to be used as the PropertyRef list.
   * @apilevel high-level
   */
  public void setPropertyRefList(List<PropertyRef> list) {
    setChild(list, 3);
  }
  /**
   * Retrieves the number of children in the PropertyRef list.
   * @return Number of children in the PropertyRef list.
   * @apilevel high-level
   */
  public int getNumPropertyRef() {
    return getPropertyRefList().getNumChild();
  }
  /**
   * Retrieves the number of children in the PropertyRef list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the PropertyRef list.
   * @apilevel low-level
   */
  public int getNumPropertyRefNoTransform() {
    return getPropertyRefListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the PropertyRef list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the PropertyRef list.
   * @apilevel high-level
   */
  public PropertyRef getPropertyRef(int i) {
    return (PropertyRef) getPropertyRefList().getChild(i);
  }
  /**
   * Check whether the PropertyRef list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasPropertyRef() {
    return getPropertyRefList().getNumChild() != 0;
  }
  /**
   * Append an element to the PropertyRef list.
   * @param node The element to append to the PropertyRef list.
   * @apilevel high-level
   */
  public void addPropertyRef(PropertyRef node) {
    List<PropertyRef> list = (parent == null) ? getPropertyRefListNoTransform() : getPropertyRefList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addPropertyRefNoTransform(PropertyRef node) {
    List<PropertyRef> list = getPropertyRefListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the PropertyRef list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setPropertyRef(PropertyRef node, int i) {
    List<PropertyRef> list = getPropertyRefList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the PropertyRef list.
   * @return The node representing the PropertyRef list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="PropertyRef")
  public List<PropertyRef> getPropertyRefList() {
    List<PropertyRef> list = (List<PropertyRef>) getChild(3);
    return list;
  }
  /**
   * Retrieves the PropertyRef list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the PropertyRef list.
   * @apilevel low-level
   */
  public List<PropertyRef> getPropertyRefListNoTransform() {
    return (List<PropertyRef>) getChildNoTransform(3);
  }
  /**
   * @return the element at index {@code i} in the PropertyRef list without
   * triggering rewrites.
   */
  public PropertyRef getPropertyRefNoTransform(int i) {
    return (PropertyRef) getPropertyRefListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the PropertyRef list.
   * @return The node representing the PropertyRef list.
   * @apilevel high-level
   */
  public List<PropertyRef> getPropertyRefs() {
    return getPropertyRefList();
  }
  /**
   * Retrieves the PropertyRef list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the PropertyRef list.
   * @apilevel low-level
   */
  public List<PropertyRef> getPropertyRefsNoTransform() {
    return getPropertyRefListNoTransform();
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:72
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:72")
  public Optional<Property> resolveProperty(String name) {
    {
        for (Property property: getPropertyList()) {
          if (property.name().equals(name)) {
            return Optional.of(property);
          }
        }
    
        for (PropertyRef ref: getPropertyRefList()) {
          if (ref.getRef().name().equals(name)) {
            return Optional.of(ref.getRef());
          }
        }
        return Optional.empty();
      }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:218
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:218")
  public Optional<ResourceType> resolveResourceType(String name) {
    {
        for (ResourceType sub: getSubTypeList()) {
          if (sub.name().equals(name)) {
            return Optional.of(sub);
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
        if (getContainer()) {
          result.append("container ");
        }
        result.append("resource type ").append(getName().print(settings, indentationLevel)).append(" {").lb().ind();
        indentationLevel++;
        for (ResourceType subType: getSubTypeList()) {
          result.append(subType.print(settings, indentationLevel));
        }
        for (Property property: getPropertyList()) {
          result.append(property.print(settings, indentationLevel));
        }
        for (PropertyRef ref: getPropertyRefList()) {
          result.append("using property ").append(ref.print(settings, indentationLevel)).lb();
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
