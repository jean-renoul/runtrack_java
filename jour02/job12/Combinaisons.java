package job12;

public class Combinaisons {
    public static void main(String args[]) {
        int combinaisons = 0;
        for (int i = 1; i <= 6; ++i) {
            for (int j = 1; j <= 6; ++j) {
                for (int k = 1; k <= 6; ++k) {
                    combinaisons += 1;
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
        System.out.println("Il y a " + combinaisons + " combinaisons possibles.");
    }                    

}
