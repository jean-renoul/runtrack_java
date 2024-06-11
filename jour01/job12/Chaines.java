package job12;
import java.util.Scanner;

public class Chaines {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une chaîne de caractères : ");
        String chaine = sc.nextLine();
        System.out.println("Entrez une autre chaîne de caractères : ");
        String chaine2 = sc.nextLine();
        sc.close();
        
        chaine = chaine.concat(chaine2);
        chaine2 = chaine.substring(0, chaine.length() - chaine2.length());
        chaine = chaine.substring(chaine2.length());
        System.out.println("Chaine 1 : " + chaine);
        System.out.println("Chaine 2 : " + chaine2);
    }
}
