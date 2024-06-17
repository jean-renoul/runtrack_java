package job06;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre de numéros à compter");
        int ArraySize = sc.nextInt();
        int[] numbers = new int[ArraySize];

        for (int i = 0; i < ArraySize; ++i) {
            System.out.println("Entrez un nombre");
            numbers[i] = sc.nextInt();
        }
        sc.close();

        Runnable countThread = new SumThread(numbers);
        Thread thread = new Thread(countThread);

        long startTime = System.currentTimeMillis();

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Le temps d'exécution est de " + executionTime + "ms");
    }       

}
