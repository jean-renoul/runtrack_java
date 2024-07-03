package job14;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre inférieur ou égale à 9 : ");
        int n = sc.nextInt();

        if (n > 9) {
            System.out.println("Le nombre doit être inférieur ou égale à 9");
        }
        else {
            for (int i = 1; i <= 10; ++i) {
                System.out.println(n + " x " + i + " = " + n * i);
                
            }
        }
        sc.close();
    }

}
