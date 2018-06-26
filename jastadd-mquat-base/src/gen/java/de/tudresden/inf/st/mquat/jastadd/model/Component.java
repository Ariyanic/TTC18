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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Mquat.ast:38
 * @production Component : {@link ModelElement} ::= <span class="component">{@link Implementation}*</span> <span class="component">{@link Property}*</span> <span class="component">{@link PropertyRef}*</span>;

 */
public class Component extends ModelElement implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:7
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(Component.class);
  /**
   * @aspect ReferenceHelper
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\ReferenceHelper.jadd:2
   */
  public ComponentRef createRef() {
    return new ComponentRef(new Name(name()), this);
  }
  /**
   * @declaredat ASTNode:1
   */
  public Component() {
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
  public Component(Name p0, List<Implementation> p1, List<Property> p2, List<PropertyRef> p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 4;
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
  public Component clone() throws CloneNotSupportedException {
    Component node = (Component) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public Component copy() {
    try {
      Component node = (Component) clone();
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
  public Component fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public Component treeCopyNoTransform() {
    Component tree = (Component) copy();
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
  public Component treeCopy() {
    Component tree = (Component) copy();
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
   * Replaces the Implementation list.
   * @param list The new list node to be used as the Implementation list.
   * @apilevel high-level
   */
  public void setImplementationList(List<Implementation> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the Implementation list.
   * @return Number of children in the Implementation list.
   * @apilevel high-level
   */
  public int getNumImplementation() {
    return getImplementationList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Implementation list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Implementation list.
   * @apilevel low-level
   */
  public int getNumImplementationNoTransform() {
    return getImplementationListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Implementation list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Implementation list.
   * @apilevel high-level
   */
  public Implementation getImplementation(int i) {
    return (Implementation) getImplementationList().getChild(i);
  }
  /**
   * Check whether the Implementation list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasImplementation() {
    return getImplementationList().getNumChild() != 0;
  }
  /**
   * Append an element to the Implementation list.
   * @param node The element to append to the Implementation list.
   * @apilevel high-level
   */
  public void addImplementation(Implementation node) {
    List<Implementation> list = (parent == null) ? getImplementationListNoTransform() : getImplementationList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addImplementationNoTransform(Implementation node) {
    List<Implementation> list = getImplementationListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Implementation list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setImplementation(Implementation node, int i) {
    List<Implementation> list = getImplementationList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Implementation list.
   * @return The node representing the Implementation list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Implementation")
  public List<Implementation> getImplementationList() {
    List<Implementation> list = (List<Implementation>) getChild(1);
    return list;
  }
  /**
   * Retrieves the Implementation list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Implementation list.
   * @apilevel low-level
   */
  public List<Implementation> getImplementationListNoTransform() {
    return (List<Implementation>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the Implementation list without
   * triggering rewrites.
   */
  public Implementation getImplementationNoTransform(int i) {
    return (Implementation) getImplementationListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Implementation list.
   * @return The node representing the Implementation list.
   * @apilevel high-level
   */
  public List<Implementation> getImplementations() {
    return getImplementationList();
  }
  /**
   * Retrieves the Implementation list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Implementation list.
   * @apilevel low-level
   */
  public List<Implementation> getImplementationsNoTransform() {
    return getImplementationListNoTransform();
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
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:96
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:96")
  public Optional<Property> resolveProperty(String name) {
    {
        for (Property property : getPropertyList()) {
          if (property.name().equals(name)) {
            return Optional.of(property);
          }
        }
        for (PropertyRef ref : getPropertyRefList()) {
          if (ref.name().equals(name)) {
            return Optional.of(ref.getRef());
          }
        }
        return resolvePropertyGeneral(name);
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
    
        result.append("component ").append(getName().print(settings, indentationLevel)).append(" {").ind().lb();
    
        indentationLevel += 1;
        for (Implementation implementation : getImplementationList()) {
          result.append(implementation.print(settings, indentationLevel));
        }
    
        for (Property property : getPropertyList()) {
          result.append(property.print(settings, indentationLevel));
        }
    
        for (PropertyRef propertyRef : getPropertyRefList()) {
          result.append("using property ").append(propertyRef.print(settings, indentationLevel)).lb();
        }
    
        indentationLevel -= 1;
        result.und().lb().append("}").lb().append("").lb();
    
        return result;
      }
  }
  /** This component and all possibly required components 
   * @attribute syn
   * @aspect Requests
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Requests.jrag:31
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Requests", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Requests.jrag:31")
  public java.util.Set<Component> relevantComponents() {
    {
        java.util.Set<Component> result = new java.util.HashSet<>();
        result.add(this);
        for (Implementation impl : getImplementationList()) {
          for (ComponentRequirement cr : impl.getComponentRequirementList()) {
            result.addAll(cr.getComponentRef().getRef().relevantComponents());
          }
        }
        return result;
      }
  }
  /**
   * @attribute inh
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:110
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:110")
  public Optional<Property> resolvePropertyGeneral(String name) {
    Optional<Property> resolvePropertyGeneral_String_value = getParent().Define_resolvePropertyGeneral(this, null, name);
    return resolvePropertyGeneral_String_value;
  }
  /**
   * @attribute inh
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:321
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:321")
  public Optional<MetaParameter> resolveMetaParameter(String name) {
    Optional<MetaParameter> resolveMetaParameter_String_value = getParent().Define_resolveMetaParameter(this, null, name);
    return resolveMetaParameter_String_value;
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:19
   * @apilevel internal
   */
  public Component Define_containingComponent(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getImplementationListNoTransform()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:20
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      return this;
    }
    else {
      return getParent().Define_containingComponent(this, _callerNode);
    }
  }
  protected boolean canDefine_containingComponent(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:327
   * @apilevel internal
   */
  public Optional<MetaParameter> Define_resolveMetaParameter(ASTNode _callerNode, ASTNode _childNode, String name) {
    if (_callerNode == getImplementationListNoTransform()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:325
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
