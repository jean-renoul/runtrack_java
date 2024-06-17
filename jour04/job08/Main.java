package job08;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Main {

    static class SumTask implements Callable<Long> {
        private final int start;
        private final int end;

        public SumTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Long call() {
            long sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        int maxNumber = 10000000;
        int numberOfThreads = 10;
        int rangeSize = maxNumber / numberOfThreads;

        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        List<Future<Long>> results = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * rangeSize + 1;
            int end = (i == numberOfThreads - 1) ? maxNumber : (i + 1) * rangeSize;
            SumTask task = new SumTask(start, end);
            Future<Long> result = executor.submit(task);
            results.add(result);
        }

        long totalSum = 0;
        for (Future<Long> result : results) {
            try {
                totalSum += result.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();

        long endTime = System.currentTimeMillis();

        System.out.println("La somme des nombres est de " + totalSum);
        System.out.println("Le temps d'exécution est de " + (endTime - startTime) + "ms");
    }
}