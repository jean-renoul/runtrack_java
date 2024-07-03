package job08;

public class Somme {
    public static void main(String[] args) {
        int somme = 0;

        for (int i = 0; i <= 100; ++i) {
            somme += i;
        }
        System.out.println("La somme est " + somme);
    }

}
