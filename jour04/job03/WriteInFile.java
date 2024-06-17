package job03;
import java.util.Scanner;

public class WriteInFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre de caractères à écrire");
        int charsNumber = sc.nextInt();
        sc.close();
        int half = charsNumber / 2;
        
        Runnable firstHalf = new WriteThread(half);
        Runnable secondHalf = new WriteThread(half);
        Thread firstHalfThread = new Thread(firstHalf);
        Thread secondHalfThread = new Thread(secondHalf);

        long startTime = System.currentTimeMillis();

        firstHalfThread.start();
        try {
            firstHalfThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        secondHalfThread.start();
        try {
            secondHalfThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Le temps d'exécution est de " + executionTime + "ms");
    }
}
