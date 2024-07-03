package job01;
import java.util.Scanner;

public class Saisie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre nom : ");
        String nom = sc.nextLine();
        sc.close();
        
        System.out.println("Bonjour " + nom);
    }

}
