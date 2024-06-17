package job07;
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

        int[] firstHalf;
        int[] secondHalf;

        if (ArraySize % 2 == 0) {
            firstHalf = new int[ArraySize / 2];
        }
        else {
            firstHalf = new int[ArraySize / 2 + 1];
        }
        
        secondHalf = new int[ArraySize / 2];

        for (int i = 0; i < firstHalf.length; ++i) {
            firstHalf[i] = numbers[i];
        }

        for (int i = 0; i < secondHalf.length; ++i) {
            secondHalf[i] = numbers[firstHalf.length + i];
        }

        Runnable firstHalfThread = new SumThread(firstHalf);
        Thread thread = new Thread(firstHalfThread);

        Runnable secondHalfThread = new SumThread(secondHalf);
        Thread thread2 = new Thread(secondHalfThread);

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

        int result = ((SumThread) firstHalfThread).getResult() + ((SumThread) secondHalfThread).getResult();
        System.out.println("La somme des nombres est de " + result);
              
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Le temps d'exécution est de " + executionTime + "ms");
    }       

}
