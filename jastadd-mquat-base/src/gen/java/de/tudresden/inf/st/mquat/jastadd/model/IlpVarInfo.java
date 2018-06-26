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
 * @ast class
 * @aspect ILP
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jadd:48
 */
public class IlpVarInfo extends java.lang.Object {
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(IlpVarInfo.class);

  
    public java.util.Map<String, IlpVariable> vars;

  
    public java.util.Map<Resource, IlpConstraint> resourceConstraints;

  
    public java.util.Set<IlpVariable> illegal;

  

    public IlpVarInfo() {
      vars = new java.util.TreeMap<>();
      resourceConstraints = new java.util.HashMap<>();
      illegal = new java.util.HashSet<>();
    }

  

    public IlpVariable getIlpVariable(Request request, Implementation impl, Resource resource) {
      String varName = request.getIlpName() + "#" + impl.getIlpName() + "#" + resource.getIlpName();
      IlpVariable result = vars.get(varName);
      IlpConstraint resourceConstraint = resourceConstraints.get(resource);
      if (resourceConstraint == null) {
        resourceConstraint = new IlpConstraint("one_on_" + resource.getIlpName(), new IlpLeftHandSide(),
            ClauseComparator.LE, 1);
        resourceConstraints.put(resource, resourceConstraint);
      }
      if (result == null) {
        result = new IlpMappingVariable(varName, request, impl, resource);
        vars.put(varName, result);
        resourceConstraint.getIlpLeftHandSide().addIlpTerm(new IlpTerm(1, result));
      }
      return result;
    }

  

    public void setIllegal(Request request, Implementation impl, Resource resource) {
      illegal.add(getIlpVariable(request, impl, resource));
    }

  

    public IlpVariable getIlpVariable(Request request, Implementation impl) {
      String varName = request.getIlpName() + "#" + impl.getIlpName();
      IlpVariable result = vars.get(varName);
      if (result == null) {
        result = new IlpAllResourcesVariable(varName, request, impl);
        vars.put(varName, result);
      }
      return result;
    }


}
