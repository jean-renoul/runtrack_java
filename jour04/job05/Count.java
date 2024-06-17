package job05;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre maximum à compter");
        int maxNumber = sc.nextInt();
        sc.close();

        Runnable firstHalf = new CountThread(0, maxNumber / 2);
        Thread thread = new Thread(firstHalf);

        Runnable secondHalf = new CountThread(maxNumber / 2 + 1, maxNumber);
        Thread thread2 = new Thread(secondHalf);


        

        long startTime = System.currentTimeMillis();

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Le temps d'exécution est de " + executionTime + "ms");
    }

}
