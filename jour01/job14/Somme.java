package job14;
import java.util.Scanner;

public class Somme {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez un nombre : ");
        int nombre1 = sc.nextInt();

        System.out.println("Entrez un autre nombre : ");
        int nombre2 = sc.nextInt();
        sc.close();

        System.out.println("La somme de " + nombre1 + " et " + nombre2 + " est " + (nombre1 + nombre2));
    }

}
