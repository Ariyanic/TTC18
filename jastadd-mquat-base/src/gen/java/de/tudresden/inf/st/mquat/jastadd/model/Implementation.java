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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Mquat.ast:42
 * @production Implementation : {@link ModelElement} ::= <span class="component">{@link ComponentRequirement}*</span> <span class="component">{@link ResourceRequirement}</span> <span class="component">{@link Clause}*</span>;

 */
public class Implementation extends ModelElement implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:26
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(Implementation.class);
  /**
   * @declaredat ASTNode:1
   */
  public Implementation() {
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
    setChild(new List(), 3);
  }
  /**
   * @declaredat ASTNode:15
   */
  public Implementation(Name p0, List<ComponentRequirement> p1, ResourceRequirement p2, List<Clause> p3) {
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
  public Implementation clone() throws CloneNotSupportedException {
    Implementation node = (Implementation) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public Implementation copy() {
    try {
      Implementation node = (Implementation) clone();
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
  public Implementation fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public Implementation treeCopyNoTransform() {
    Implementation tree = (Implementation) copy();
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
  public Implementation treeCopy() {
    Implementation tree = (Implementation) copy();
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
   * Replaces the ComponentRequirement list.
   * @param list The new list node to be used as the ComponentRequirement list.
   * @apilevel high-level
   */
  public void setComponentRequirementList(List<ComponentRequirement> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the ComponentRequirement list.
   * @return Number of children in the ComponentRequirement list.
   * @apilevel high-level
   */
  public int getNumComponentRequirement() {
    return getComponentRequirementList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ComponentRequirement list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ComponentRequirement list.
   * @apilevel low-level
   */
  public int getNumComponentRequirementNoTransform() {
    return getComponentRequirementListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ComponentRequirement list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ComponentRequirement list.
   * @apilevel high-level
   */
  public ComponentRequirement getComponentRequirement(int i) {
    return (ComponentRequirement) getComponentRequirementList().getChild(i);
  }
  /**
   * Check whether the ComponentRequirement list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasComponentRequirement() {
    return getComponentRequirementList().getNumChild() != 0;
  }
  /**
   * Append an element to the ComponentRequirement list.
   * @param node The element to append to the ComponentRequirement list.
   * @apilevel high-level
   */
  public void addComponentRequirement(ComponentRequirement node) {
    List<ComponentRequirement> list = (parent == null) ? getComponentRequirementListNoTransform() : getComponentRequirementList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addComponentRequirementNoTransform(ComponentRequirement node) {
    List<ComponentRequirement> list = getComponentRequirementListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ComponentRequirement list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setComponentRequirement(ComponentRequirement node, int i) {
    List<ComponentRequirement> list = getComponentRequirementList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ComponentRequirement list.
   * @return The node representing the ComponentRequirement list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ComponentRequirement")
  public List<ComponentRequirement> getComponentRequirementList() {
    List<ComponentRequirement> list = (List<ComponentRequirement>) getChild(1);
    return list;
  }
  /**
   * Retrieves the ComponentRequirement list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ComponentRequirement list.
   * @apilevel low-level
   */
  public List<ComponentRequirement> getComponentRequirementListNoTransform() {
    return (List<ComponentRequirement>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the ComponentRequirement list without
   * triggering rewrites.
   */
  public ComponentRequirement getComponentRequirementNoTransform(int i) {
    return (ComponentRequirement) getComponentRequirementListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ComponentRequirement list.
   * @return The node representing the ComponentRequirement list.
   * @apilevel high-level
   */
  public List<ComponentRequirement> getComponentRequirements() {
    return getComponentRequirementList();
  }
  /**
   * Retrieves the ComponentRequirement list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ComponentRequirement list.
   * @apilevel low-level
   */
  public List<ComponentRequirement> getComponentRequirementsNoTransform() {
    return getComponentRequirementListNoTransform();
  }
  /**
   * Replaces the ResourceRequirement child.
   * @param node The new node to replace the ResourceRequirement child.
   * @apilevel high-level
   */
  public void setResourceRequirement(ResourceRequirement node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the ResourceRequirement child.
   * @return The current node used as the ResourceRequirement child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="ResourceRequirement")
  public ResourceRequirement getResourceRequirement() {
    return (ResourceRequirement) getChild(2);
  }
  /**
   * Retrieves the ResourceRequirement child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the ResourceRequirement child.
   * @apilevel low-level
   */
  public ResourceRequirement getResourceRequirementNoTransform() {
    return (ResourceRequirement) getChildNoTransform(2);
  }
  /**
   * Replaces the Clause list.
   * @param list The new list node to be used as the Clause list.
   * @apilevel high-level
   */
  public void setClauseList(List<Clause> list) {
    setChild(list, 3);
  }
  /**
   * Retrieves the number of children in the Clause list.
   * @return Number of children in the Clause list.
   * @apilevel high-level
   */
  public int getNumClause() {
    return getClauseList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Clause list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Clause list.
   * @apilevel low-level
   */
  public int getNumClauseNoTransform() {
    return getClauseListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Clause list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Clause list.
   * @apilevel high-level
   */
  public Clause getClause(int i) {
    return (Clause) getClauseList().getChild(i);
  }
  /**
   * Check whether the Clause list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasClause() {
    return getClauseList().getNumChild() != 0;
  }
  /**
   * Append an element to the Clause list.
   * @param node The element to append to the Clause list.
   * @apilevel high-level
   */
  public void addClause(Clause node) {
    List<Clause> list = (parent == null) ? getClauseListNoTransform() : getClauseList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addClauseNoTransform(Clause node) {
    List<Clause> list = getClauseListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Clause list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setClause(Clause node, int i) {
    List<Clause> list = getClauseList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Clause list.
   * @return The node representing the Clause list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Clause")
  public List<Clause> getClauseList() {
    List<Clause> list = (List<Clause>) getChild(3);
    return list;
  }
  /**
   * Retrieves the Clause list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Clause list.
   * @apilevel low-level
   */
  public List<Clause> getClauseListNoTransform() {
    return (List<Clause>) getChildNoTransform(3);
  }
  /**
   * @return the element at index {@code i} in the Clause list without
   * triggering rewrites.
   */
  public Clause getClauseNoTransform(int i) {
    return (Clause) getClauseListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Clause list.
   * @return The node representing the Clause list.
   * @apilevel high-level
   */
  public List<Clause> getClauses() {
    return getClauseList();
  }
  /**
   * Retrieves the Clause list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Clause list.
   * @apilevel low-level
   */
  public List<Clause> getClausesNoTransform() {
    return getClauseListNoTransform();
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:179
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:179")
  public Optional<Instance> resolveInstance(String name) {
    {
        for (ComponentRequirement cr : getComponentRequirementList()) {
          for (Instance instance : cr.getInstanceList()) {
            if (instance.name().equals(name)) {
              return Optional.of(instance);
            }
          }
        }
        for (Instance instance : getResourceRequirement().getInstanceList()) {
          if (instance.name().equals(name)) {
            return Optional.of(instance);
          }
        }
        return Optional.empty();
      }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:229
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:229")
  public Optional<Clause> findFirstProvidingClause(Property property) {
    {
        for (Clause clause : getClauseList()) {
          if (clause.getClauseType() != ClauseType.PROVIDING) continue;
          Designator designator = clause.getDesignator();
          if (designator.isSoftwareDesignator() && designator.asSoftwareDesignator().getPropertyRef().getRef().equals(property)) {
            return Optional.of(clause);
          }
        }
        return Optional.empty();
      }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:256
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:256")
  public Designator resolveQualifiedName(QualifiedName qn) {
    {
        if (qn.getNumName() == 1) {
          // we have a meta parameter or something in the current context
          Optional<MetaParameter> meta = resolveMetaParameter(qn.getName(0).getName());
          if(meta.isPresent()) {
            return new MetaParameterDesignator(meta.get().createRef());
          }
          // else, interpret the property as a local one of the current component
          // this might cause an exception of the property can not be resolved
          Optional<Property> property = containingComponent().resolveProperty(qn.getName(0).getName());
          return new SoftwareDesignator(new Opt<>(),property.get().createRef());
        } else {
    
          // first, check if it is a component requirement
          // TODO right now, component requirements are not "deep", so can assume that qn has two names, one for the
          // component instance and another for the property
          String instanceName = qn.getName(0).getName();
          String propertyName = qn.getName(1).getName();
          for (ComponentRequirement requirement : getComponentRequirementList()) {
            for(Instance instance:requirement.getInstanceList()){
              if(instance.name().equals(instanceName)){
                // now resolve property of the type of the instance. we know, the instance refers to a component.
                Component component=instance.referringComponent();
                return new SoftwareDesignator(new Opt<>(instance.createRef()),
                    component.resolveProperty(propertyName).get().createRef());
              }
            }
          }
    
          // if no component instance has been found, look for a resource instance
          ResourceRequirement currentRequirement = null;
          Instance currentInstance = null;
          for (int currentName = 0; currentName < qn.getNumName() - 1; currentName++) {
            if (currentRequirement == null) {
              currentRequirement = getResourceRequirement();
              // TODO this has to be extended if the one resource requirement there is has more than one instance
              currentInstance = getResourceRequirement().getInstance(0);
            } else {
              for (ResourceRequirement newResourceRequirement : currentRequirement.getResourceRequirementList())
                for (Instance instance : newResourceRequirement.getInstanceList()) {
                  if (instance.name().equals(qn.getName(currentName).getName())) {
                    currentRequirement = newResourceRequirement;
                    currentInstance = instance;
                  }
                }
            }
          }
          // now, currentRequirement refers to the final resource type
          return new PropertyResourceDesignator(currentInstance.createRef(), currentRequirement.getResourceTypeRef().getRef().resolveProperty(qn.getName(qn.getNumName()-1).getName()).get().createRef());
        }
      }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:335
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:335")
  public java.util.List<Clause> requirementClauses() {
    {
        java.util.List<Clause> result = new java.util.ArrayList<>();
        for (Clause clause : getClauseList()) {
          if (clause.isRequiringClause()) {
            result.add(clause);
          }
        }
        return result;
        }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:376
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:376")
  public java.util.Collection<Component> getRequiredComponents() {
    {
        java.util.List<Component> result = new java.util.ArrayList();
        for (ComponentRequirement cr: getComponentRequirementList()) {
          if (cr.getNumInstance()==0) {
            result.add(cr.getComponentRef().getRef());
          } else {
            for (Instance instance: cr.getInstanceList()) {
              result.add(cr.getComponentRef().getRef());
            }
          }
        }
        return result;
      }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:447
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:447")
  public double getRequiringClauseValue(ResourceType type, String propertyName) {
    {
        for (Clause clause: getClauseList()) {
          Designator designator = clause.getDesignator();
          if (clause.getClauseType() == ClauseType.REQUIRING
              && designator.isPropertyResourceDesignator()
              && designator.asPropertyResourceDesignator().getInstanceRef().getRef().referringResourceType().equals(type)
              && designator.simpleName().equals(propertyName)) {
            return clause.getExpression().evalAsDouble();
          }
        }
        throw new RuntimeException("Did not find a requiring clause for designator '" + propertyName + "'");
      }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:460
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:460")
  public double getRequiringClauseValue(ResourceType type, String propertyName, int index) {
    {
        int i = 0;
        for (Clause clause: getClauseList()) {
          Designator designator = clause.getDesignator();
          if (clause.getClauseType() == ClauseType.REQUIRING
              && designator.isPropertyResourceDesignator()
              && designator.asPropertyResourceDesignator().getInstanceRef().getRef().referringResourceType().equals(type)
              && designator.simpleName().equals(propertyName)) {
            if (i==index) {
              return clause.getExpression().evalAsDouble();
            } else {
              i++;
            }
          }
        }
        throw new RuntimeException("Did not find a requiring clause for designator '" + propertyName + "'");
      }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:478
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:478")
  public Instance getRequiringClauseInstance(ResourceType type, String propertyName) {
    {
        return getRequiringClauseInstance(type, propertyName, 0);
      }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:482
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:482")
  public Instance getRequiringClauseInstance(ResourceType type, String propertyName, int index) {
    {
        int i = 0;
        for (Clause clause: getClauseList()) {
          Designator designator = clause.getDesignator();
          if (clause.getClauseType() == ClauseType.REQUIRING
              && designator.isPropertyResourceDesignator()
              && designator.asPropertyResourceDesignator().getInstanceRef().getRef().referringResourceType().equals(type)
              && designator.simpleName().equals(propertyName)) {
            if (i==index) {
              return designator.asPropertyResourceDesignator().getInstanceRef().getRef();
            } else {
              i++;
            }
          }
        }
        return null;
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
    
        result.append("contract ").append(getName().print(settings, indentationLevel)).append(" {").ind().lb();
    
        indentationLevel += 1;
    
        for (ComponentRequirement componentRequirement : getComponentRequirementList()) {
          result.append(componentRequirement.print(settings, indentationLevel));
        }
    
        result.append("requires resource ");
        result.append(getResourceRequirement().print(settings, indentationLevel));
    
        for (Clause clause : getClauseList()) {
          result.append(clause.print(settings, indentationLevel)).lb();
        }
    
        result.append("").lb();
    
        indentationLevel -= 1;
        result.und().append("}").lb();
    
        return result;
      }
  }
  /**
   * @attribute inh
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:19
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:19")
  public Component containingComponent() {
    Component containingComponent_value = getParent().Define_containingComponent(this, null);
    return containingComponent_value;
  }
  /**
   * @attribute inh
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:324
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:324")
  public Optional<MetaParameter> resolveMetaParameter(String name) {
    Optional<MetaParameter> resolveMetaParameter_String_value = getParent().Define_resolveMetaParameter(this, null, name);
    return resolveMetaParameter_String_value;
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:13
   * @apilevel internal
   */
  public Implementation Define_containingImplementation(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getClauseListNoTransform()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:14
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      return this;
    }
    else {
      return getParent().Define_containingImplementation(this, _callerNode);
    }
  }
  protected boolean canDefine_containingImplementation(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:242
   * @apilevel internal
   */
  public Designator Define_resolveQualifiedName(ASTNode _callerNode, ASTNode _childNode, QualifiedName qn) {
    if (_callerNode == getClauseListNoTransform()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:254
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      return resolveQualifiedName(qn);
    }
    else {
      return getParent().Define_resolveQualifiedName(this, _callerNode, qn);
    }
  }
  protected boolean canDefine_resolveQualifiedName(ASTNode _callerNode, ASTNode _childNode, QualifiedName qn) {
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
