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
 * @ast enum
 * @aspect Enums
 * @declaredat C:\\Users\\imenrayan\\Desktop\\EMFeRTTC18-master\\jastadd-mquat-base\\src\\main\\jastadd\\Enums.jadd:12
 */
public enum ClauseComparator {
    LT { public String symbol() { return "<";  } },
    LE { public String symbol() { return "<="; } },
    EQ { public String symbol() { return "=";  } },
    NE { public String symbol() { return "!="; } },
    GE { public String symbol() { return ">="; } },
    GT { public String symbol() { return ">";  } };

    public String symbol() { throw new AbstractMethodError(); }
	}
