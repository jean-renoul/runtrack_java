package job12;
import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {
        int result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int n = sc.nextInt();
        sc.close();

        for (int i =1; i <= n; ++i) {
            result *= i;
        }
        System.out.println("La factorielle de " + n + " est " + result);

    }

}