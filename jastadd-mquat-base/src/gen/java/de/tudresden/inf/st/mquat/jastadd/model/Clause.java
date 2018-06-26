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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Mquat.ast:51
 * @production Clause : {@link ASTNode} ::= <span class="component">&lt;ClauseType:ClauseType&gt;</span> <span class="component">{@link Designator}</span> <span class="component">&lt;ClauseComparator:ClauseComparator&gt;</span> <span class="component">{@link Expression}</span>;

 */
public class Clause extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:6
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(Clause.class);
  /**
   * @aspect Helpers
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\Helpers.jadd:3
   */
  public static void populateResourceMapping(ResourceMapping mapping, ResourceRequirement requirement, Resource resource) {

    for (ResourceRequirement subRequirement : requirement.getResourceRequirementList()) {
      int fittingResourceCount = 0;
      for (int currentInstance = 0; currentInstance < subRequirement.getNumInstance(); currentInstance++) {
        Instance instance = subRequirement.getInstance(currentInstance);
        for (int currentResource = 0; currentResource < resource.getNumSubResource(); currentResource++) {
          Resource subResource = resource.getSubResource(currentResource);
          if (subResource.getType().getRef() == subRequirement.getResourceTypeRef().getRef()) {
            if (currentInstance == fittingResourceCount) {
              ResourceMapping newMapping = new ResourceMapping(instance, subResource, new de.tudresden.inf.st.mquat.jastadd.model.List<>());
              mapping.addResourceMapping(newMapping);
              populateResourceMapping(newMapping, subRequirement, subResource);
              fittingResourceCount++;
            }
            currentInstance++;
          }
        }
      }
    }
  }
  /**
   * @declaredat ASTNode:1
   */
  public Clause() {
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
  }
  /**
   * @declaredat ASTNode:13
   */
  public Clause(ClauseType p0, Designator p1, ClauseComparator p2, Expression p3) {
    setClauseType(p0);
    setChild(p1, 0);
    setClauseComparator(p2);
    setChild(p3, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:20
   */
  protected int numChildren() {
    return 2;
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
  public Clause clone() throws CloneNotSupportedException {
    Clause node = (Clause) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public Clause copy() {
    try {
      Clause node = (Clause) clone();
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
  public Clause fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:72
   */
  public Clause treeCopyNoTransform() {
    Clause tree = (Clause) copy();
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
  public Clause treeCopy() {
    Clause tree = (Clause) copy();
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
    return super.is$Equal(node) && (tokenClauseType_ClauseType == ((Clause) node).tokenClauseType_ClauseType) && (tokenClauseComparator_ClauseComparator == ((Clause) node).tokenClauseComparator_ClauseComparator);    
  }
  /**
   * Replaces the lexeme ClauseType.
   * @param value The new value for the lexeme ClauseType.
   * @apilevel high-level
   */
  public void setClauseType(ClauseType value) {
    tokenClauseType_ClauseType = value;
  }
  /** @apilevel internal 
   */
  protected ClauseType tokenClauseType_ClauseType;
  /**
   * Retrieves the value for the lexeme ClauseType.
   * @return The value for the lexeme ClauseType.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ClauseType")
  public ClauseType getClauseType() {
    return tokenClauseType_ClauseType;
  }
  /**
   * Replaces the Designator child.
   * @param node The new node to replace the Designator child.
   * @apilevel high-level
   */
  public void setDesignator(Designator node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Designator child.
   * @return The current node used as the Designator child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Designator")
  public Designator getDesignator() {
    return (Designator) getChild(0);
  }
  /**
   * Retrieves the Designator child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Designator child.
   * @apilevel low-level
   */
  public Designator getDesignatorNoTransform() {
    return (Designator) getChildNoTransform(0);
  }
  /**
   * Replaces the lexeme ClauseComparator.
   * @param value The new value for the lexeme ClauseComparator.
   * @apilevel high-level
   */
  public void setClauseComparator(ClauseComparator value) {
    tokenClauseComparator_ClauseComparator = value;
  }
  /** @apilevel internal 
   */
  protected ClauseComparator tokenClauseComparator_ClauseComparator;
  /**
   * Retrieves the value for the lexeme ClauseComparator.
   * @return The value for the lexeme ClauseComparator.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ClauseComparator")
  public ClauseComparator getClauseComparator() {
    return tokenClauseComparator_ClauseComparator;
  }
  /**
   * Replaces the Expression child.
   * @param node The new node to replace the Expression child.
   * @apilevel high-level
   */
  public void setExpression(Expression node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Expression child.
   * @return The current node used as the Expression child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Expression")
  public Expression getExpression() {
    return (Expression) getChild(1);
  }
  /**
   * Retrieves the Expression child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Expression child.
   * @apilevel low-level
   */
  public Expression getExpressionNoTransform() {
    return (Expression) getChildNoTransform(1);
  }
  /**
   * @attribute syn
   * @aspect Helpers
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\Helpers.jadd:26
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Helpers", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\Helpers.jadd:26")
  public Assignment simpleAssignment(Request request, Resource resource) {
    {
        Assignment assignment = new Assignment();
        assignment.setRequest(request);
        Implementation impl = containingImplementation();
        if (impl != null) {
          assignment.setImplementation(impl);
    
          ResourceMapping mapping=new ResourceMapping(impl.getResourceRequirement().getInstance(0),resource,new de.tudresden.inf.st.mquat.jastadd.model.List<>());
          populateResourceMapping(mapping,impl.getResourceRequirement(),resource);
          assignment.setResourceMapping(mapping);
        }
        return assignment;
      }
  }
  /**
   * @attribute syn
   * @aspect Analysis
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Analysis.jrag:6
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Analysis", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Analysis.jrag:6")
  public boolean isRequiringClause() {
    boolean isRequiringClause_value = getClauseType() == ClauseType.REQUIRING;
    return isRequiringClause_value;
  }
  /**
   * @attribute syn
   * @aspect Analysis
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Analysis.jrag:7
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Analysis", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Analysis.jrag:7")
  public boolean isProvidingClause() {
    boolean isProvidingClause_value = getClauseType() == ClauseType.PROVIDING;
    return isProvidingClause_value;
  }
  /**
   * @attribute syn
   * @aspect Clauses
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Clauses.jrag:4
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Clauses", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Clauses.jrag:4")
  public boolean checkUsing(Assignment assignment) {
    {
        double leftSide = getDesignator().evalUsing(assignment);
        double rightSide = getExpression().evalUsing(assignment);
        switch (getClauseComparator()) {
          case LT:
            return leftSide < rightSide;
          case LE:
            return leftSide <= rightSide;
          case EQ:
            return leftSide == rightSide;
          case NE:
            return leftSide != rightSide;
          case GE:
            return leftSide >= rightSide;
          case GT:
            return leftSide > rightSide;
        }
        throw new RuntimeException("Unknown clause comparator. This should never happen!");
      }
  }
  /**
   * @attribute syn
   * @aspect eval
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Eval.jrag:5
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="eval", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Eval.jrag:5")
  public boolean checkUsing(Request request, Resource resource) {
    boolean checkUsing_Request_Resource_value = checkUsing(simpleAssignment(request, resource));
    return checkUsing_Request_Resource_value;
  }
  /**
   * @attribute syn
   * @aspect eval
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Eval.jrag:36
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="eval", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Eval.jrag:36")
  public double evalUsing(Request request, Resource target) {
    double evalUsing_Request_Resource_value = evalUsing(simpleAssignment(request, target));
    return evalUsing_Request_Resource_value;
  }
  /**
   * @attribute syn
   * @aspect eval
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Eval.jrag:40
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="eval", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Eval.jrag:40")
  public double evalUsing(Assignment assignment) {
    double evalUsing_Assignment_value = getExpression().evalUsing(assignment);
    return evalUsing_Assignment_value;
  }
  /**
   * Searches in all implementations of the required component for providing clauses.
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:359
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:359")
  public java.util.List<Tuple<Implementation, Clause>> providingClausesOfRequiredComponent() {
    {
        java.util.List<Tuple<Implementation, Clause>> result = new java.util.ArrayList<>();
        if (getDesignator().isSoftwareDesignator()) {
          SoftwareDesignator swDesignator = getDesignator().asSoftwareDesignator();
          Property prop = swDesignator.getPropertyRef().getRef();
          if (swDesignator.hasInstanceRef()) {
            Component reqComponent = getDesignator().asSoftwareDesignator().getInstanceRef().getRef().referringComponent();
            for (Implementation reqImpl : reqComponent.getImplementationList()) {
              // TODO maybe implement findFirstProvidingClause for Implementation
              Optional<Clause> providingClause = reqImpl.findFirstProvidingClause(prop);
              if (providingClause.isPresent()) { result.add(new Tuple<>(reqImpl, providingClause.get())); }
            }
          }
        }
        return result;
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
    
        if (getClauseType() == ClauseType.REQUIRING) {
          result.append("requiring ");
        } else if(getClauseType() == ClauseType.PROVIDING) {
          result.append("providing ");
        }
    
        result.append(getDesignator().print(settings, indentationLevel)).append(' ').append(getClauseComparator().symbol());
        result.append(' ').append(getExpression().print(settings, indentationLevel));
    
        return result;
      }
  }
  /**
   * @attribute inh
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:13
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:13")
  public Implementation containingImplementation() {
    Implementation containingImplementation_value = getParent().Define_containingImplementation(this, null);
    return containingImplementation_value;
  }
  /**
   * @attribute inh
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:242
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:242")
  public Designator resolveQualifiedName(QualifiedName qn) {
    Designator resolveQualifiedName_QualifiedName_value = getParent().Define_resolveQualifiedName(this, null, qn);
    return resolveQualifiedName_QualifiedName_value;
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Analysis.jrag:9
   * @apilevel internal
   */
  public boolean Define_inProvidingClause(ASTNode _callerNode, ASTNode _childNode) {
    if (getDesignatorNoTransform() != null && _callerNode == getDesignator()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Analysis.jrag:12
      return isProvidingClause();
    }
    else if (getExpressionNoTransform() != null && _callerNode == getExpression()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Analysis.jrag:11
      return isProvidingClause();
    }
    else {
      return getParent().Define_inProvidingClause(this, _callerNode);
    }
  }
  protected boolean canDefine_inProvidingClause(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Analysis.jrag:14
   * @apilevel internal
   */
  public boolean Define_inRequiringClause(ASTNode _callerNode, ASTNode _childNode) {
    if (getDesignatorNoTransform() != null && _callerNode == getDesignator()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Analysis.jrag:17
      return isRequiringClause();
    }
    else if (getExpressionNoTransform() != null && _callerNode == getExpression()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Analysis.jrag:16
      return isRequiringClause();
    }
    else {
      return getParent().Define_inRequiringClause(this, _callerNode);
    }
  }
  protected boolean canDefine_inRequiringClause(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:24
   * @apilevel internal
   */
  public Clause Define_containingClause(ASTNode _callerNode, ASTNode _childNode) {
    if (getExpressionNoTransform() != null && _callerNode == getExpression()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:28
      return this;
    }
    else if (getDesignatorNoTransform() != null && _callerNode == getDesignator()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:25
      return this;
    }
    else {
      return getParent().Define_containingClause(this, _callerNode);
    }
  }
  protected boolean canDefine_containingClause(ASTNode _callerNode, ASTNode _childNode) {
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
