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
 * @aspect Printing
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Printing.jadd:7
 */
public class MquatString extends java.lang.Object {
  
    boolean newline;

  
    StringBuilder buffer;

  
    MquatWriteSettings settings;

  
    int indentationLevel;

  

    public MquatString(MquatWriteSettings settings, int indentationLevel) {
      this.buffer = new java.lang.StringBuilder();
      this.settings = settings;
      this.indentationLevel = indentationLevel;
      this.newline = false;
    }

  

    public int getIndentationLevel() {
      return this.indentationLevel;
    }

  

    public MquatString ind() {
      this.indentationLevel += 1;
      return this;
    }

  

    public MquatString und() {
      if (this.indentationLevel > 0) this.indentationLevel -= 1;
      return this;
    }

  

    private void flushNewline() {
      if (newline) {
        this.buffer.append("\n");
        for (int i = 0; i < indentationLevel; i++) {
          this.buffer.append(settings.getIndentString());
        }
        newline = false;
      }
    }

  

    public MquatString lb() {
      this.newline = true;
      return this;
    }

  

    public MquatString append(Object o) {
      flushNewline();
      buffer.append(o);
      return this;
    }

  


    public MquatString append(final MquatString s) {
      flushNewline();

      buffer.append(s.getBuffer());
      if (s.newlinePending()) {
        newline = true;
      }
      return this;
    }

  

    protected boolean newlinePending() {
      return newline;
    }

  

    public StringBuilder getBuffer() {
      return buffer;
    }

  

    public String toString() {
      flushNewline();
      return buffer.toString();
    }


}
