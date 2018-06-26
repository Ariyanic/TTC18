package ir.ac.ui.eng;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Samaneh Hoseindoost
 * @author Meysan Karimi
 * @author Shekoufeh Kolahdouz-Rahimi
 * @author Bahman Zamani
 */
public class Parallel {
  static final int iCPU = Runtime.getRuntime().availableProcessors();

  public static <T> void ForEach(Iterable<T> parameters, final LoopBody<T> loopBody) {
    ExecutorService executor = Executors.newFixedThreadPool(iCPU);
    List<Future<?>> futures = new LinkedList<Future<?>>();

    for (final T param : parameters) {
      Future<?> future = executor.submit(new Runnable() {
        public void run() {
          loopBody.run(param);
        }
      });

      futures.add(future);
    }

    for (Future<?> f : futures) {
      try {
        f.get();
      } catch (InterruptedException e) {
      } catch (ExecutionException e) {
      }
    }

    executor.shutdown();
  }

  public static void For(int start, int stop, final LoopBody<Integer> loopBody) {
    ExecutorService executor = Executors.newFixedThreadPool(iCPU);
    List<Future<?>> futures = new LinkedList<Future<?>>();

    for (int i = start; i < stop; i++) {
      final Integer k = i;
      Future<?> future = executor.submit(new Runnable() {
        public void run() {
          loopBody.run(k);
        }
      });
      futures.add(future);
    }

    for (Future<?> f : futures) {
      try {
        f.get();
      } catch (InterruptedException e) {
      } catch (ExecutionException e) {
      }
    }

    executor.shutdown();
  }
}
