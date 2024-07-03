package job06;
import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNum = 0;

        System.out.println("Entrez un nombre : ");
        for (int i = 0; i < 3; ++i) {
            int nombre = sc.nextInt();
            if (nombre > maxNum) {
                maxNum = nombre;
            }
            
        }
        sc.close();
        System.out.println("Le plus grand nombre est " + maxNum);
    }
        

}
