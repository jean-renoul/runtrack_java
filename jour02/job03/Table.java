package job03;
import java.util.Scanner;

public class Table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre: ");
        int nombre = sc.nextInt();
        sc.close();
        
        for (int i = 1; i <= 10; ++i) {
            System.out.println(nombre + " x " + i + " = " + (nombre * i));
        }
    }
}
