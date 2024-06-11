package job09;

public class Numeros {
    public static void main(String args[]) {
        int nombre = 1234;
        int premierChiffre;
        int dernierChiffre;

        // Convertir le nombre en chaine de caractères
        String nombreStr = Integer.toString(nombre);

        for (int i = 0; i < nombreStr.length(); ++i) {
            if (i == 0) {
                premierChiffre = Character.getNumericValue(nombreStr.charAt(i));
                System.out.println("Le premier chiffre est: " + premierChiffre);
            } else if (i == nombreStr.length() - 1) {
                dernierChiffre = Character.getNumericValue(nombreStr.charAt(i));
                System.out.println("Le dernier chiffre est: " + dernierChiffre);
            }
            else {
                continue;
            }
        }
    }
}
