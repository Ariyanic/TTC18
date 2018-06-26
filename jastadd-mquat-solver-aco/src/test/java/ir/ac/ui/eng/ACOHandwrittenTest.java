package ir.ac.ui.eng;

import de.tudresden.inf.st.mquat.solving.HandwrittenTestSuite;
import de.tudresden.inf.st.mquat.solving.Solver;

/**
 * Simple test case for ACOSolver.
 *
 * @author rschoene - Initial contribution
 */
public class ACOHandwrittenTest extends HandwrittenTestSuite {
  @Override
  protected Solver getSolver() {
    return new ACOSolver().setPopulation_size(100);
  }
}
