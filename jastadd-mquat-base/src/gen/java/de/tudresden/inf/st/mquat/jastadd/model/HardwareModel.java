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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Mquat.ast:22
 * @production HardwareModel : {@link ASTNode} ::= <span class="component">{@link ResourceType}*</span> <span class="component">{@link Resource}*</span> <span class="component">{@link Property}*</span>;

 */
public class HardwareModel extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:14
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(HardwareModel.class);
  /**
   * @declaredat ASTNode:1
   */
  public HardwareModel() {
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
  public HardwareModel(List<ResourceType> p0, List<Resource> p1, List<Property> p2) {
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
  public HardwareModel clone() throws CloneNotSupportedException {
    HardwareModel node = (HardwareModel) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public HardwareModel copy() {
    try {
      HardwareModel node = (HardwareModel) clone();
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
  public HardwareModel fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public HardwareModel treeCopyNoTransform() {
    HardwareModel tree = (HardwareModel) copy();
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
  public HardwareModel treeCopy() {
    HardwareModel tree = (HardwareModel) copy();
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
   * Replaces the ResourceType list.
   * @param list The new list node to be used as the ResourceType list.
   * @apilevel high-level
   */
  public void setResourceTypeList(List<ResourceType> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the ResourceType list.
   * @return Number of children in the ResourceType list.
   * @apilevel high-level
   */
  public int getNumResourceType() {
    return getResourceTypeList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ResourceType list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ResourceType list.
   * @apilevel low-level
   */
  public int getNumResourceTypeNoTransform() {
    return getResourceTypeListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ResourceType list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ResourceType list.
   * @apilevel high-level
   */
  public ResourceType getResourceType(int i) {
    return (ResourceType) getResourceTypeList().getChild(i);
  }
  /**
   * Check whether the ResourceType list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasResourceType() {
    return getResourceTypeList().getNumChild() != 0;
  }
  /**
   * Append an element to the ResourceType list.
   * @param node The element to append to the ResourceType list.
   * @apilevel high-level
   */
  public void addResourceType(ResourceType node) {
    List<ResourceType> list = (parent == null) ? getResourceTypeListNoTransform() : getResourceTypeList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addResourceTypeNoTransform(ResourceType node) {
    List<ResourceType> list = getResourceTypeListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ResourceType list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setResourceType(ResourceType node, int i) {
    List<ResourceType> list = getResourceTypeList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ResourceType list.
   * @return The node representing the ResourceType list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ResourceType")
  public List<ResourceType> getResourceTypeList() {
    List<ResourceType> list = (List<ResourceType>) getChild(0);
    return list;
  }
  /**
   * Retrieves the ResourceType list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ResourceType list.
   * @apilevel low-level
   */
  public List<ResourceType> getResourceTypeListNoTransform() {
    return (List<ResourceType>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the ResourceType list without
   * triggering rewrites.
   */
  public ResourceType getResourceTypeNoTransform(int i) {
    return (ResourceType) getResourceTypeListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ResourceType list.
   * @return The node representing the ResourceType list.
   * @apilevel high-level
   */
  public List<ResourceType> getResourceTypes() {
    return getResourceTypeList();
  }
  /**
   * Retrieves the ResourceType list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ResourceType list.
   * @apilevel low-level
   */
  public List<ResourceType> getResourceTypesNoTransform() {
    return getResourceTypeListNoTransform();
  }
  /**
   * Replaces the Resource list.
   * @param list The new list node to be used as the Resource list.
   * @apilevel high-level
   */
  public void setResourceList(List<Resource> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the Resource list.
   * @return Number of children in the Resource list.
   * @apilevel high-level
   */
  public int getNumResource() {
    return getResourceList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Resource list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Resource list.
   * @apilevel low-level
   */
  public int getNumResourceNoTransform() {
    return getResourceListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Resource list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Resource list.
   * @apilevel high-level
   */
  public Resource getResource(int i) {
    return (Resource) getResourceList().getChild(i);
  }
  /**
   * Check whether the Resource list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasResource() {
    return getResourceList().getNumChild() != 0;
  }
  /**
   * Append an element to the Resource list.
   * @param node The element to append to the Resource list.
   * @apilevel high-level
   */
  public void addResource(Resource node) {
    List<Resource> list = (parent == null) ? getResourceListNoTransform() : getResourceList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addResourceNoTransform(Resource node) {
    List<Resource> list = getResourceListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Resource list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setResource(Resource node, int i) {
    List<Resource> list = getResourceList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Resource list.
   * @return The node representing the Resource list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Resource")
  public List<Resource> getResourceList() {
    List<Resource> list = (List<Resource>) getChild(1);
    return list;
  }
  /**
   * Retrieves the Resource list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Resource list.
   * @apilevel low-level
   */
  public List<Resource> getResourceListNoTransform() {
    return (List<Resource>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the Resource list without
   * triggering rewrites.
   */
  public Resource getResourceNoTransform(int i) {
    return (Resource) getResourceListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Resource list.
   * @return The node representing the Resource list.
   * @apilevel high-level
   */
  public List<Resource> getResources() {
    return getResourceList();
  }
  /**
   * Retrieves the Resource list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Resource list.
   * @apilevel low-level
   */
  public List<Resource> getResourcesNoTransform() {
    return getResourceListNoTransform();
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
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:209
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:209")
  public Optional<ResourceType> resolveResourceType(String name) {
    {
        for (ResourceType type: getResourceTypeList()) {
          if (type.name().equals(name)) {
            return Optional.of(type);
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
    
        for (ResourceType resourceType : getResourceTypeList()) {
          result.append(resourceType.print(settings, indentationLevel));
        }
    
        for (Resource resource : getResourceList()) {
          result.append(resource.print(settings, indentationLevel));
        }
    
        for (Property property : getPropertyList()) {
          result.append(property.print(settings, indentationLevel));
        }
    
        return result;
      }
  }
  /**
   * @attribute syn
   * @aspect SimpleHardwareModel
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\SimpleHardwareModel.jrag:66
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="SimpleHardwareModel", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\SimpleHardwareModel.jrag:66")
  public ResourceType computeResourceType() {
    {
        for (ResourceType resourceType : getResourceTypeList()) {
          if ("ComputeNode".equals(resourceType.name())) {
            return resourceType;
          }
        }
        return null;
      }
  }
  /**
   * @attribute syn
   * @aspect SimpleHardwareModel
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\SimpleHardwareModel.jrag:75
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="SimpleHardwareModel", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\SimpleHardwareModel.jrag:75")
  public ResourceType cpuType() {
    {
        for (ResourceType resourceType : computeResourceType().getSubTypeList()) {
          if ("CPU".equals(resourceType.name())) {
            return resourceType;
          }
        }
        return null;
      }
  }
  /**
   * @attribute syn
   * @aspect SimpleHardwareModel
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\SimpleHardwareModel.jrag:84
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="SimpleHardwareModel", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\SimpleHardwareModel.jrag:84")
  public ResourceType ramType() {
    {
        for (ResourceType resourceType : computeResourceType().getSubTypeList()) {
          if ("RAM".equals(resourceType.name())) {
            return resourceType;
          }
        }
        return null;
      }
  }
  /**
   * @attribute syn
   * @aspect SimpleHardwareModel
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\SimpleHardwareModel.jrag:93
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="SimpleHardwareModel", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\SimpleHardwareModel.jrag:93")
  public ResourceType diskType() {
    {
        for (ResourceType resourceType : computeResourceType().getSubTypeList()) {
          if ("DISK".equals(resourceType.name())) {
            return resourceType;
          }
        }
        return null;
      }
  }
  /**
   * @attribute syn
   * @aspect SimpleHardwareModel
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\SimpleHardwareModel.jrag:102
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="SimpleHardwareModel", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\SimpleHardwareModel.jrag:102")
  public ResourceType networkType() {
    {
        for (ResourceType resourceType : computeResourceType().getSubTypeList()) {
          if ("NETWORK".equals(resourceType.name())) {
            return resourceType;
          }
        }
        return null;
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
