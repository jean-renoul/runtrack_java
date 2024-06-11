package job13;
import java.util.Scanner;

public class NombresPrecedents {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int nombre = sc.nextInt();
        sc.close();
        for (int i = 1; i <= nombre; i++){
            System.out.println(i);
        }
    }

}
