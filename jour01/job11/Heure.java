package job11;
import java.util.Scanner;

public class Heure {
    public static void main(String args[]){
        int minutes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre de minutes : ");
        minutes = sc.nextInt();
        sc.close();

        int heures = minutes / 60;
        minutes %= 60;
        System.out.println(heures + " heures et " + minutes + " minutes");
    }
}
