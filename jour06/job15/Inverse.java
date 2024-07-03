package job15;
import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");

        int n = sc.nextInt();
        sc.close();
        int result = 0;
        while (n > 0) {
            result = result * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Le nombre inversé est " + result);
    }       

}
