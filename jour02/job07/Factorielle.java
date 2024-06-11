package job07;
import java.util.Scanner;

public class Factorielle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre : ");
        int nombre = sc.nextInt();
        int resultat = nombre;
        sc.close();

        for (int i = 1; i < nombre; ++i) {
            resultat *= i;
        }
        System.out.println("La factorielle de " + nombre + " est : " + resultat);
    }
}
