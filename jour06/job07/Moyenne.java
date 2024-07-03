package job07;
import java.util.Scanner;

public class Moyenne {
    public static void main(String[] args) {        
        System.out.println("Entrez un nombre : ");
        Scanner sc = new Scanner(System.in);
        int somme = 0;

        for (int i = 0; i < 5; ++i) {
            int nombre = sc.nextInt();
            somme += nombre;
        }
        sc.close();

        System.out.println("La moyenne est " + somme / 5);

    }




}
