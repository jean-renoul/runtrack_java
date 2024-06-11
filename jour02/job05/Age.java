package job05;
import java.util.Scanner;

public class Age {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre age: ");
        int age = sc.nextInt();
        sc.close();
        
        if (age < 16) {
            System.out.println("Vous n'avez pas l'âge de travailler.");
        }
        else if (age >= 67) {
            System.out.println("Vous êtes à la retraite.");
        }
        else if (age > 55) {
            System.out.println("Vous êtes un senior.");
        }
        else {
            System.out.println("Vous êtes un actif.");
        }
    }
        
}
