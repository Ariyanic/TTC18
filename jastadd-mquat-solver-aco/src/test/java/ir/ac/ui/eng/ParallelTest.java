package ir.ac.ui.eng;

/**
 * @author Samaneh Hoseindoost
 * @author Meysan Karimi
 * @author Shekoufeh Kolahdouz-Rahimi
 * @author Bahman Zamani
 */
public class ParallelTest {
  int k;

  public ParallelTest() {
    k = 0;
    Parallel.For(0, 10, new LoopBody<Integer>() {
      public void run(Integer i) {
        k += i;
        System.out.println(i);
      }
    });
    System.out.println("Sum = " + k);
  }

  public static void main(String[] argv) {
    ParallelTest test = new ParallelTest();
  }
}
