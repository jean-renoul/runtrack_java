package job13;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; ++i) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
