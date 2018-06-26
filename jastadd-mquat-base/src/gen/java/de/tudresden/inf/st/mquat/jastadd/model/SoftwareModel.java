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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Mquat.ast:36
 * @production SoftwareModel : {@link ASTNode} ::= <span class="component">{@link MetaParameter}*</span> <span class="component">{@link Component}*</span> <span class="component">{@link Property}*</span>;

 */
public class SoftwareModel extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:50
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(SoftwareModel.class);
  /**
   * @declaredat ASTNode:1
   */
  public SoftwareModel() {
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
    setChild(new List(), 0);
    setChild(new List(), 1);
    setChild(new List(), 2);
  }
  /**
   * @declaredat ASTNode:16
   */
  public SoftwareModel(List<MetaParameter> p0, List<Component> p1, List<Property> p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 3;
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
  public SoftwareModel clone() throws CloneNotSupportedException {
    SoftwareModel node = (SoftwareModel) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public SoftwareModel copy() {
    try {
      SoftwareModel node = (SoftwareModel) clone();
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
  public SoftwareModel fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public SoftwareModel treeCopyNoTransform() {
    SoftwareModel tree = (SoftwareModel) copy();
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
  public SoftwareModel treeCopy() {
    SoftwareModel tree = (SoftwareModel) copy();
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
   * Replaces the MetaParameter list.
   * @param list The new list node to be used as the MetaParameter list.
   * @apilevel high-level
   */
  public void setMetaParameterList(List<MetaParameter> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the MetaParameter list.
   * @return Number of children in the MetaParameter list.
   * @apilevel high-level
   */
  public int getNumMetaParameter() {
    return getMetaParameterList().getNumChild();
  }
  /**
   * Retrieves the number of children in the MetaParameter list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the MetaParameter list.
   * @apilevel low-level
   */
  public int getNumMetaParameterNoTransform() {
    return getMetaParameterListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the MetaParameter list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the MetaParameter list.
   * @apilevel high-level
   */
  public MetaParameter getMetaParameter(int i) {
    return (MetaParameter) getMetaParameterList().getChild(i);
  }
  /**
   * Check whether the MetaParameter list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasMetaParameter() {
    return getMetaParameterList().getNumChild() != 0;
  }
  /**
   * Append an element to the MetaParameter list.
   * @param node The element to append to the MetaParameter list.
   * @apilevel high-level
   */
  public void addMetaParameter(MetaParameter node) {
    List<MetaParameter> list = (parent == null) ? getMetaParameterListNoTransform() : getMetaParameterList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addMetaParameterNoTransform(MetaParameter node) {
    List<MetaParameter> list = getMetaParameterListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the MetaParameter list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setMetaParameter(MetaParameter node, int i) {
    List<MetaParameter> list = getMetaParameterList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the MetaParameter list.
   * @return The node representing the MetaParameter list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="MetaParameter")
  public List<MetaParameter> getMetaParameterList() {
    List<MetaParameter> list = (List<MetaParameter>) getChild(0);
    return list;
  }
  /**
   * Retrieves the MetaParameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the MetaParameter list.
   * @apilevel low-level
   */
  public List<MetaParameter> getMetaParameterListNoTransform() {
    return (List<MetaParameter>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the MetaParameter list without
   * triggering rewrites.
   */
  public MetaParameter getMetaParameterNoTransform(int i) {
    return (MetaParameter) getMetaParameterListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the MetaParameter list.
   * @return The node representing the MetaParameter list.
   * @apilevel high-level
   */
  public List<MetaParameter> getMetaParameters() {
    return getMetaParameterList();
  }
  /**
   * Retrieves the MetaParameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the MetaParameter list.
   * @apilevel low-level
   */
  public List<MetaParameter> getMetaParametersNoTransform() {
    return getMetaParameterListNoTransform();
  }
  /**
   * Replaces the Component list.
   * @param list The new list node to be used as the Component list.
   * @apilevel high-level
   */
  public void setComponentList(List<Component> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the Component list.
   * @return Number of children in the Component list.
   * @apilevel high-level
   */
  public int getNumComponent() {
    return getComponentList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Component list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Component list.
   * @apilevel low-level
   */
  public int getNumComponentNoTransform() {
    return getComponentListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Component list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Component list.
   * @apilevel high-level
   */
  public Component getComponent(int i) {
    return (Component) getComponentList().getChild(i);
  }
  /**
   * Check whether the Component list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasComponent() {
    return getComponentList().getNumChild() != 0;
  }
  /**
   * Append an element to the Component list.
   * @param node The element to append to the Component list.
   * @apilevel high-level
   */
  public void addComponent(Component node) {
    List<Component> list = (parent == null) ? getComponentListNoTransform() : getComponentList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addComponentNoTransform(Component node) {
    List<Component> list = getComponentListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Component list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setComponent(Component node, int i) {
    List<Component> list = getComponentList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Component list.
   * @return The node representing the Component list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Component")
  public List<Component> getComponentList() {
    List<Component> list = (List<Component>) getChild(1);
    return list;
  }
  /**
   * Retrieves the Component list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Component list.
   * @apilevel low-level
   */
  public List<Component> getComponentListNoTransform() {
    return (List<Component>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the Component list without
   * triggering rewrites.
   */
  public Component getComponentNoTransform(int i) {
    return (Component) getComponentListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Component list.
   * @return The node representing the Component list.
   * @apilevel high-level
   */
  public List<Component> getComponents() {
    return getComponentList();
  }
  /**
   * Retrieves the Component list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Component list.
   * @apilevel low-level
   */
  public List<Component> getComponentsNoTransform() {
    return getComponentListNoTransform();
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
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:87
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:87")
  public Optional<Property> resolveProperty(String name) {
    {
        for (Property property: getPropertyList()) {
          if (property.name().equals(name)) {
            return Optional.of(property);
          }
        }
        return Optional.empty();
      }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:312
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:312")
  public Optional<MetaParameter> resolveMetaParameter(String name) {
    {
        for (MetaParameter meta : getMetaParameterList()) {
          if (meta.name().equals(name)) {
            return Optional.of(meta);
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
    
        for (MetaParameter m: getMetaParameterList()) {
          result.append(m.print(settings, indentationLevel)).lb();
        }
        result.lb();
    
        for (Property property : getPropertyList()) {
          result.append(property.print(settings, indentationLevel));
        }
        result.lb();
    
        for (Component component : getComponentList()) {
          result.append(component.print(settings, indentationLevel));
        }
        return result;
      }
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:110
   * @apilevel internal
   */
  public Optional<Property> Define_resolvePropertyGeneral(ASTNode _callerNode, ASTNode _childNode, String name) {
    if (_callerNode == getComponentListNoTransform()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:112
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      {
          for (Property property : getPropertyList()) {
            if (property.name().equals(name)) {
              return Optional.of(property);
            }
          }
          return Optional.empty();
        }
    }
    else {
      return getParent().Define_resolvePropertyGeneral(this, _callerNode, name);
    }
  }
  protected boolean canDefine_resolvePropertyGeneral(ASTNode _callerNode, ASTNode _childNode, String name) {
    return true;
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:327
   * @apilevel internal
   */
  public Optional<MetaParameter> Define_resolveMetaParameter(ASTNode _callerNode, ASTNode _childNode, String name) {
    if (_callerNode == getComponentListNoTransform()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:322
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      return resolveMetaParameter(name);
    }
    else {
      return getParent().Define_resolveMetaParameter(this, _callerNode, name);
    }
  }
  protected boolean canDefine_resolveMetaParameter(ASTNode _callerNode, ASTNode _childNode, String name) {
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
