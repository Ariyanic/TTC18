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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Mquat.ast:1
 * @production Root : {@link ASTNode} ::= <span class="component">{@link HardwareModel}</span> <span class="component">{@link SoftwareModel}</span> <span class="component">{@link Request}*</span> <span class="component">{@link Objective}</span> <span class="component">{@link ILP}</span>;

 */
public class Root extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Logging
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Logging.jadd:48
   */
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(Root.class);
  /**
   * @aspect ILP
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jadd:3
   */
  public static String ILP_TIMEOUT_VALUE = "de.tudresden.inf.st.mquat.solving.ilp.timeoutValue";
  /**
   * @aspect ILP
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jadd:4
   */
  public static String ILP_TIMEOUT_UNIT = "de.tudresden.inf.st.mquat.solving.ilp.timeoutUnit";
  /**
   * @aspect ILP
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jadd:91
   */
  private static double makeNegative(double value) {
    return value == 0.0 || value == -0.0 ? 0.0 : -1.0 * value;
  }
  /**
   * create a simple haredware model
   * @aspect SimpleHardwareModel
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\SimpleHardwareModel.jrag:9
   */
  public static HardwareModel createSimpleHardwareModel() {
    HardwareModel hardwareModel = new HardwareModel();

    // common properties of several hardware resources
    Property total = new Property(new Name("total"), "MB");
    hardwareModel.addProperty(total);

    Property free = new Property(new Name("free"), "MB");
    hardwareModel.addProperty(free);

    // the top-level resource type
    ResourceType type = new ResourceType();
    type.setName(new Name("ComputeNode"));
    type.setContainer(true);

    // subtype CPU
    ResourceType cpu = new ResourceType();
    cpu.setContainer(false);
    cpu.setName(new Name("CPU"));
    Property frequency = new Property(new Name("frequency"), "Hz");
    Property load = new Property(new Name("load"), "%");
    cpu.addProperty(frequency);
    cpu.addProperty(load);
    type.addSubType(cpu);


    // subtype memory
    ResourceType ram = new ResourceType();
    ram.setName(new Name("RAM"));
    ram.setContainer(false);
    ram.addPropertyRef(total.createRef());
    ram.addPropertyRef(free.createRef());
    type.addSubType(ram);

    // subtype disk
    ResourceType disk = new ResourceType();
    disk.setName(new Name("DISK"));
    disk.setContainer(false);
    disk.addPropertyRef(total.createRef());
    disk.addPropertyRef(free.createRef());
    type.addSubType(disk);

    // subtype network
    ResourceType network = new ResourceType();
    network.setName(new Name("NETWORK"));
    network.setContainer(false);
    Property latency = new Property(new Name("latency"), "ms");
    Property throughput = new Property(new Name("throughput"), "kB/s");
    network.addProperty(latency);
    network.addProperty(throughput);
    type.addSubType(network);

    hardwareModel.addResourceType(type);

    return hardwareModel;
  }
  /**
   * @declaredat ASTNode:1
   */
  public Root() {
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
    children = new ASTNode[5];
    setChild(new List(), 2);
  }
  /**
   * @declaredat ASTNode:14
   */
  public Root(HardwareModel p0, SoftwareModel p1, List<Request> p2, Objective p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 4;
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
  public Root clone() throws CloneNotSupportedException {
    Root node = (Root) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public Root copy() {
    try {
      Root node = (Root) clone();
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
  public Root fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:73
   */
  public Root treeCopyNoTransform() {
    Root tree = (Root) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        switch (i) {
        case 4:
          tree.children[i] = null;
          continue;
        }
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
   * @declaredat ASTNode:98
   */
  public Root treeCopy() {
    Root tree = (Root) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        switch (i) {
        case 4:
          tree.children[i] = null;
          continue;
        }
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
   * @declaredat ASTNode:117
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the HardwareModel child.
   * @param node The new node to replace the HardwareModel child.
   * @apilevel high-level
   */
  public void setHardwareModel(HardwareModel node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the HardwareModel child.
   * @return The current node used as the HardwareModel child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="HardwareModel")
  public HardwareModel getHardwareModel() {
    return (HardwareModel) getChild(0);
  }
  /**
   * Retrieves the HardwareModel child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the HardwareModel child.
   * @apilevel low-level
   */
  public HardwareModel getHardwareModelNoTransform() {
    return (HardwareModel) getChildNoTransform(0);
  }
  /**
   * Replaces the SoftwareModel child.
   * @param node The new node to replace the SoftwareModel child.
   * @apilevel high-level
   */
  public void setSoftwareModel(SoftwareModel node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the SoftwareModel child.
   * @return The current node used as the SoftwareModel child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="SoftwareModel")
  public SoftwareModel getSoftwareModel() {
    return (SoftwareModel) getChild(1);
  }
  /**
   * Retrieves the SoftwareModel child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the SoftwareModel child.
   * @apilevel low-level
   */
  public SoftwareModel getSoftwareModelNoTransform() {
    return (SoftwareModel) getChildNoTransform(1);
  }
  /**
   * Replaces the Request list.
   * @param list The new list node to be used as the Request list.
   * @apilevel high-level
   */
  public void setRequestList(List<Request> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the Request list.
   * @return Number of children in the Request list.
   * @apilevel high-level
   */
  public int getNumRequest() {
    return getRequestList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Request list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Request list.
   * @apilevel low-level
   */
  public int getNumRequestNoTransform() {
    return getRequestListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Request list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Request list.
   * @apilevel high-level
   */
  public Request getRequest(int i) {
    return (Request) getRequestList().getChild(i);
  }
  /**
   * Check whether the Request list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasRequest() {
    return getRequestList().getNumChild() != 0;
  }
  /**
   * Append an element to the Request list.
   * @param node The element to append to the Request list.
   * @apilevel high-level
   */
  public void addRequest(Request node) {
    List<Request> list = (parent == null) ? getRequestListNoTransform() : getRequestList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addRequestNoTransform(Request node) {
    List<Request> list = getRequestListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Request list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setRequest(Request node, int i) {
    List<Request> list = getRequestList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Request list.
   * @return The node representing the Request list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Request")
  public List<Request> getRequestList() {
    List<Request> list = (List<Request>) getChild(2);
    return list;
  }
  /**
   * Retrieves the Request list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Request list.
   * @apilevel low-level
   */
  public List<Request> getRequestListNoTransform() {
    return (List<Request>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the Request list without
   * triggering rewrites.
   */
  public Request getRequestNoTransform(int i) {
    return (Request) getRequestListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Request list.
   * @return The node representing the Request list.
   * @apilevel high-level
   */
  public List<Request> getRequests() {
    return getRequestList();
  }
  /**
   * Retrieves the Request list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Request list.
   * @apilevel low-level
   */
  public List<Request> getRequestsNoTransform() {
    return getRequestListNoTransform();
  }
  /**
   * Replaces the Objective child.
   * @param node The new node to replace the Objective child.
   * @apilevel high-level
   */
  public void setObjective(Objective node) {
    setChild(node, 3);
  }
  /**
   * Retrieves the Objective child.
   * @return The current node used as the Objective child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Objective")
  public Objective getObjective() {
    return (Objective) getChild(3);
  }
  /**
   * Retrieves the Objective child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Objective child.
   * @apilevel low-level
   */
  public Objective getObjectiveNoTransform() {
    return (Objective) getChildNoTransform(3);
  }
  /**
   * Retrieves the ILP child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the ILP child.
   * @apilevel low-level
   */
  public ILP getILPNoTransform() {
    return (ILP) getChildNoTransform(4);
  }
  /**
   * Retrieves the child position of the optional child ILP.
   * @return The the child position of the optional child ILP.
   * @apilevel low-level
   */
  protected int getILPChildPosition() {
    return 4;
  }
  /**
   * @attribute syn
   * @aspect ModelStatistics
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\ModelStatistics.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ModelStatistics", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\ModelStatistics.jrag:3")
  public int numComponents() {
    {
        return getSoftwareModel().getNumComponent();
      }
  }
  /**
   * @attribute syn
   * @aspect ModelStatistics
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\ModelStatistics.jrag:7
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ModelStatistics", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\ModelStatistics.jrag:7")
  public int numImplementations() {
    {
        int result = 0;
        for (Component component : getSoftwareModel().getComponentList()) {
          result += component.getNumImplementation();
        }
        return result;
      }
  }
  /**
   * @attribute syn
   * @aspect ModelStatistics
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\ModelStatistics.jrag:15
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ModelStatistics", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\ModelStatistics.jrag:15")
  public int numResources() {
    {
        int result = 0;
        for (Resource resource : getHardwareModel().getResourceList()) {
          result += resource.numResources();
        }
        return result;
      }
  }
  /**
   * @attribute syn
   * @aspect ModelStatistics
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\ModelStatistics.jrag:27
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ModelStatistics", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\ModelStatistics.jrag:27")
  public int numContainers() {
    {
        int result = 0;
        for (Resource resource : getHardwareModel().getResourceList()) {
          result += resource.numContainers();
        }
        return result;
      }
  }
  /**
   * @attribute syn
   * @aspect ModelStatistics
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\ModelStatistics.jrag:43
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ModelStatistics", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\ModelStatistics.jrag:43")
  public String description() {
    String description_value = " ["
        + numComponents() + " component(s), "
        + numImplementations() + " implementation(s), "
        + getNumRequest() + " request(s), "
        + numContainers() + " container(s)]";
    return description_value;
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:7
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:7")
  public Root root() {
    Root root_value = this;
    return root_value;
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:61
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:61")
  public Optional<Request> resolveRequest(String name) {
    {
        for (Request request : getRequestList()) {
          if (request.name().equals(name)) {
            return Optional.of(request);
          }
        }
        return Optional.empty();
      }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:123
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:123")
  public Optional<Implementation> resolveImplementation(String name) {
    {
        for (Component component : getSoftwareModel().getComponentList()) {
          for (Implementation impl : component.getImplementationList()) {
            if (impl.name().equals(name)) {
              return Optional.of(impl);
            }
          }
        }
        return Optional.empty();
      }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:136
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:136")
  public Optional<Resource> resolveResource(String name) {
    {
        for (Resource resource : getHardwareModel().getResourceList()) {
          if (resource.resolveResource(name).isPresent()) {
            return resource.resolveResource(name);
          }
        }
        return Optional.empty();
      }
  }
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:346
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Navigation", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:346")
  public java.util.List<Implementation> allImplementations() {
    {
        java.util.List<Implementation> result = new java.util.ArrayList<>();
        for (Component component : this.getSoftwareModel().getComponents()) {
          for (Implementation implementation : component.getImplementations()) {
            result.add(implementation);
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
        result.append(getHardwareModel().print(settings, indentationLevel))
              .lb().lb()
              .append(getSoftwareModel().print(settings, indentationLevel))
              .lb().lb();
        for (Request r : getRequestList()) {
          result.append(r.print(settings, indentationLevel));
        }
        result.append(getObjective().print(settings, indentationLevel));
        return result;
      }
  }
  /**
   * @attribute syn
   * @aspect Printing
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Printing.jrag:453
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Printing", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Printing.jrag:453")
  public String info() {
    {
        SoftwareModel sw = getSoftwareModel();
        return  "Top-Level Components: " + sw.getNumComponent() + "\n" +
                "Impls of first comp: " + sw.getComponent(0).getNumImplementation() + "\n" +
                "Resources: " + getHardwareModel().getNumResource() + "\n" +
                "Requests: " + getNumRequest();
      }
  }
  /**
   * @attribute syn
   * @aspect ILP
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jrag:24
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ILP", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jrag:24")
  public TimedOutILP ilpTimeout(String reason) {
    {
        TimedOutILP result = new TimedOutILP();
        result.setReason(reason);
        return result;
      }
  }
  /**
   * the non-terminal attribute to compute the ILP subtree
   * @attribute syn nta
   * @aspect ILP
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jrag:44
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isNTA=true)
  @ASTNodeAnnotation.Source(aspect="ILP", declaredAt="C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jrag:44")
  public ILP getILP() {
    ILP getILP_value = getILP_compute();
    setChild(getILP_value, getILPChildPosition());
    ILP node = (ILP) this.getChild(getILPChildPosition());
    return node;
  }
  /** @apilevel internal */
  private ILP getILP_compute() {
      de.tudresden.inf.st.mquat.utils.StopWatch stopWatch = de.tudresden.inf.st.mquat.utils.StopWatch.start();
  //    StopWatch stopWatch = StopWatch.start();
      long timeoutValue = (long) de.tudresden.inf.st.mquat.utils.StaticSettings.get(ILP_TIMEOUT_VALUE);
      java.util.concurrent.TimeUnit timeoutUnit = (java.util.concurrent.TimeUnit) de.tudresden.inf.st.mquat.utils.StaticSettings.get(ILP_TIMEOUT_UNIT);
      long timeoutNanos = timeoutUnit.toNanos(timeoutValue);
  
      ILP result = new ILP();
      IlpVarInfo info = new IlpVarInfo();
  
      IlpObjective objective = new IlpObjective();
      objective.setKind(IlpObjectiveKind.MINIMIZE);
      IlpLeftHandSide olhs = new IlpLeftHandSide();
      objective.setIlpLeftHandSide(olhs);
      result.setIlpObjective(objective);
      for (Request request : this.getRequestList()) {
        for (Component comp : request.relevantComponents()) {
          IlpLeftHandSide oneCompLhs = new IlpLeftHandSide();
          for (Implementation impl : comp.getImplementationList()) {
            if (stopWatch.time() > timeoutNanos) {
              return ilpTimeout("Timeout in implementation " + impl.name());
            }
            oneCompLhs.addIlpTerm(new IlpTerm(1, info.getIlpVariable(request, impl)));
            IlpLeftHandSide oneImplLhs = new IlpLeftHandSide();
  
            // #1 Objective function
            for (Resource resource : this.getHardwareModel().getResourceList()) {
              // r1#c2#i3#hw4
              IlpTerm term = new IlpTerm();
              IlpVariable var = info.getIlpVariable(request, impl, resource);
              term.setRef(var);
              Optional<Clause> providingObjectiveClause = impl.findFirstProvidingClause(getObjective().getPropertyRef().getRef());
              if (providingObjectiveClause.isPresent()) {
                term.setValue(providingObjectiveClause.get().evalUsing(request, resource));
              } else {
                term.setValue(0);
              }
              olhs.addIlpTerm(term);
              oneImplLhs.addIlpTerm(new IlpTerm(1, var));
            }
            // 2.3 NFP-Negotiation: Requirements to other components
            for (Clause reqClause : impl.requirementClauses()) {
              if (stopWatch.time() > timeoutNanos) {
                return ilpTimeout("Timeout in NFP-Negotiation");
              }
              Designator designator = reqClause.getDesignator();
              IlpLeftHandSide reqLhs = new IlpLeftHandSide();
              if (designator.isSoftwareDesignator()) {
                for (Tuple<Implementation, Clause> tuple : reqClause.providingClausesOfRequiredComponent()) {
                  Implementation providingImpl = tuple.getKey();
                  Clause providingClause = tuple.getValue();
                  for (Resource resource : this.getHardwareModel().getResourceList()) {
                    reqLhs.addIlpTerm(new IlpTerm(providingClause.evalUsing(request, resource),
                        info.getIlpVariable(request, providingImpl, resource)));
                  }
                }
                for (Resource resource : this.getHardwareModel().getResourceList()) {
                  // we always use negative eval-value to get the required value on the right side (literally)
                  reqLhs.addIlpTerm(new IlpTerm(makeNegative(reqClause.evalUsing(request, resource)),
                      info.getIlpVariable(request, impl, resource)));
                }
                result.addIlpConstraint(new IlpConstraint(
                    request.getIlpName() + "_" + impl.getIlpName() + "_reqs_" +
                        designator.asSoftwareDesignator().getPropertyRef().getRef().getIlpName() + "_from_" +
                        designator.asSoftwareDesignator().getInstanceRef().getRef().referringComponent().getIlpName(),
                    reqLhs, reqClause.getClauseComparator(), 0));
              } else {
                for (Resource resource : this.getHardwareModel().getResourceList()) {
                  // check if constraint is fulfilled, otherwise remember this illegal combination
                  if (!reqClause.checkUsing(request, resource)) {
                    info.setIllegal(request, impl, resource);
                  }
                }
              }
            }
  
            // 2.2 Architecture constraints: One impl/resource and request
            oneImplLhs.addIlpTerm(new IlpTerm(-1, info.getIlpVariable(request, impl)));
            result.addIlpConstraint(new IlpConstraint(request.getIlpName() + "_single_" + impl.getIlpName(),
                oneImplLhs, ClauseComparator.EQ, 0));
            // 2.3 NFP-Negotiation: Use implementations of required components
            for (ComponentRequirement req : impl.getComponentRequirementList()) {
              IlpLeftHandSide reqImplLhs = new IlpLeftHandSide();
              for (Implementation reqImpl : req.getComponentRef().getRef().getImplementationList()) {
                reqImplLhs.addIlpTerm(new IlpTerm(1, info.getIlpVariable(request, reqImpl)));
              }
              reqImplLhs.addIlpTerm(new IlpTerm(-1, info.getIlpVariable(request, impl)));
              result.addIlpConstraint(new IlpConstraint(request.getIlpName() + "_" + impl.getIlpName() +
                  "_req_" + req.getComponentRef().getRef().getIlpName(),
                  reqImplLhs, ClauseComparator.GE, 0));
            }
          }
          // 2.2 Architecture constraints: One impl per component and request
          result.addIlpConstraint(new IlpConstraint(request.getIlpName() + "_opc_" + comp.getIlpName(),
              oneCompLhs, ClauseComparator.LE, 1));
        }
        // 2.1.a Request constraints: Target component (i.e., use one of its implementations)
        IlpLeftHandSide targetLhs = new IlpLeftHandSide();
        for (Implementation impl : request.getTarget().getRef().getImplementationList()) {
          IlpVariable var = info.getIlpVariable(request, impl);
          targetLhs.addIlpTerm(new IlpTerm(1, var));
        }
        result.addIlpConstraint(new IlpConstraint(request.getIlpName() + "_target", targetLhs, ClauseComparator.EQ, 1));
        // 2.1.b Request constraints: Required NFPs of target component
        for (Clause requiredClause : request.getConstraintList()) {
          IlpLeftHandSide reqLhs = new IlpLeftHandSide();
          Property requiredProperty = requiredClause.getDesignator().asSoftwareDesignator().getPropertyRef().getRef();
          for(Implementation impl : request.getTarget().getRef().getImplementationList()) {
            for (Resource resource : this.getHardwareModel().getResources()) {
              Optional<Clause> providingClause = impl.findFirstProvidingClause(requiredProperty);
              if (providingClause.isPresent()) {
                IlpVariable var = info.getIlpVariable(request, impl, resource);
                reqLhs.addIlpTerm(new IlpTerm(providingClause.get().evalUsing(request, resource), var));
              }
            }
          }
          result.addIlpConstraint(new IlpConstraint(request.getIlpName() + "_req_" + requiredProperty.getIlpName(),
              reqLhs, requiredClause.getClauseComparator(),
              requiredClause.evalUsing(request, null)));
        }
      }
      if (stopWatch.time() > timeoutNanos) {
        return ilpTimeout("Timeout after constraint creation");
      }
      /*
      #2 Constraints
      #2.1 Request constraints (requiredNFPs)
      #2.2 Architecture constraints (One SW on one HW, Only one mode/configuration per impl and per SW)
      #2.3 NFP-negotiation (Satisfy requirements from SW to both SW and HW)
      */
  
      // 2.2 Architecture constraints: Only one config per hardware resource
      for (IlpConstraint constraint : info.resourceConstraints.values()) {
        result.addIlpConstraint(constraint);
      }
  
      // Generals
      for (IlpVariable var : info.vars.values()) {
        result.addIlpVariable(var);
      }
  
      // Bounds (all binary except illegal which are zero)
      info.vars.values().removeAll(info.illegal);
      for (IlpVariable var : info.vars.values()) {
        // TODO uncomment addIlpBound line. Comment out to not clutter output for the moment.
        result.addIlpBound(new IlpBound(var, IlpBoundType.BINARY));
      }
      for (IlpVariable var : info.illegal) {
        result.addIlpBound(new IlpBound(var, IlpBoundType.ZERO));
      }
      result.setInfo(info);
      return result;
    }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Analysis.jrag:9
   * @apilevel internal
   */
  public boolean Define_inProvidingClause(ASTNode _callerNode, ASTNode _childNode) {
    if (getSoftwareModelNoTransform() != null && _callerNode == getSoftwareModel()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Analysis.jrag:10
      return false;
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
    if (getSoftwareModelNoTransform() != null && _callerNode == getSoftwareModel()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Analysis.jrag:15
      return false;
    }
    else {
      return getParent().Define_inRequiringClause(this, _callerNode);
    }
  }
  protected boolean canDefine_inRequiringClause(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:327
   * @apilevel internal
   */
  public Optional<MetaParameter> Define_resolveMetaParameter(ASTNode _callerNode, ASTNode _childNode, String name) {
    if (_callerNode == getRequestListNoTransform()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Navigation.jrag:328
      int childIndex = _callerNode.getIndexOfChild(_childNode);
      return getSoftwareModel().resolveMetaParameter(name);
    }
    else {
      return getParent().Define_resolveMetaParameter(this, _callerNode, name);
    }
  }
  protected boolean canDefine_resolveMetaParameter(ASTNode _callerNode, ASTNode _childNode, String name) {
    return true;
  }
  /**
   * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Requests.jrag:5
   * @apilevel internal
   */
  public Name Define_getName(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getRequestListNoTransform()) {
      // @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Requests.jrag:6
      int i = _callerNode.getIndexOfChild(_childNode);
      {
          return new Name("request" + String.valueOf(i));
        }
    }
    else {
      return getParent().Define_getName(this, _callerNode);
    }
  }
  protected boolean canDefine_getName(ASTNode _callerNode, ASTNode _childNode) {
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
