package job04;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre maximum à compter");
        int maxNumber = sc.nextInt();
        sc.close();

        Runnable countThread = new CountThread(maxNumber);
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
