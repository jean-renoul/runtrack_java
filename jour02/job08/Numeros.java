package job08;
import java.util.Scanner;

public class Numeros {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre: ");
        int numero = sc.nextInt();
        sc.close();
        int chiffres = 0;

        while (numero > 0) {
            numero /= 10;
            ++chiffres;
        }

        System.out.println("Ce nombre a " + chiffres + " chiffres.");
    }        

}
