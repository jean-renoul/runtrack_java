package job05;
import java.util.Scanner;

public class Saisie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int nombre = sc.nextInt();
        sc.close();
        int resultat = nombre * nombre;

        System.out.println("Le carré de " + nombre + " est " + resultat);
        

    }

}