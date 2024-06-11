package job10;
import java.util.Scanner;

public class Programme {
    public static void main(String args[]){
        String prenom; String nom;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre prénom : ");
        prenom = sc.nextLine();
        System.out.println("Entrez votre nom : ");
        nom = sc.nextLine();
        sc.close();

        System.out.println(prenom.concat(nom));
    }
}
