package job09;
import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; ++i) {
            System.out.println(i * i * i);
        }
    }
}
