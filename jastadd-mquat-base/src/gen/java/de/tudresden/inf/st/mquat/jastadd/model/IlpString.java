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
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\solvers\\ilp\\ILP.jadd:17
 */
public class IlpString extends java.lang.Object {
  protected static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(IlpString.class);

  
    StringBuilder buffer;

  

    public IlpString() {
      this.buffer = new StringBuilder();
    }

  

    public IlpString lb() {
      this.buffer.append('\n');
      return this;
    }

  

    public IlpString append(Object o) {
      buffer.append(o);
      return this;
    }

  

    public IlpString append(final IlpString s) {
      this.buffer.append(s.getBuffer());
      return this;
    }

  

    public StringBuilder getBuffer() {
      return buffer;
    }

  

    public String toString() {
      return buffer.toString();
    }


}
