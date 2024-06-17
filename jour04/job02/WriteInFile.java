package job02;
import java.util.Scanner;

public class WriteInFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre de caractères à écrire");
        int charsNumber = sc.nextInt();
        sc.close();
        
        Runnable writeThread = new WriteThread(charsNumber);
        Thread thread = new Thread(writeThread);

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
