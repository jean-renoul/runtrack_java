package job10;

public class Somme {
    public static void main(String args[]) {
        int nombre = 1234;
        int somme = 0;

        while (nombre != 0) {
            somme += nombre % 10;
            nombre /= 10;
        }
        System.out.println("La somme des chiffres est : " + somme);
    }
}
