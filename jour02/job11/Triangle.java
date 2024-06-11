package job11;
import java.util.Scanner;

public class Triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la hauteur du triangle: ");
        int hauteur = sc.nextInt();
        sc.close();

        for (int i = 1; i <= hauteur; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
