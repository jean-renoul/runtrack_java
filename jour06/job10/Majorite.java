package job10;
import java.util.Scanner;

public class Majorite {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre âge : ");
        int age = sc.nextInt();
        sc.close();
        
        if (age >= 18) {
            System.out.println("Vous êtes majeur");
        } else {
            System.out.println("Vous êtes mineur");
        }
    }
}
