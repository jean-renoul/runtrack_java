package job04;

public class Occurences {
    public static void main(String args[]) {
        int monTableau[] = new int[5];
        monTableau[0] = 3;
        monTableau[1] = 7;
        monTableau[2] = 3;
        monTableau[3] = 9;
        monTableau[4] = 8;

        int occurences3 = 0;
        int occurences7 = 0;
        int occurences9 = 0;
        int occurences8 = 0;

        for (int i = 0; i < monTableau.length; i++) {
            if (monTableau[i] == 3) {
                occurences3++;
            } else if (monTableau[i] == 7) {
                occurences7++;
            } else if (monTableau[i] == 9) {
                occurences9++;
            } else if (monTableau[i] == 8) {
                occurences8++;
            }
        }
        System.out.println("Il y a " + occurences3 + " occurences de 3");
        System.out.println("Il y a " + occurences7 + " occurences de 7");
        System.out.println("Il y a " + occurences9 + " occurences de 9");
        System.out.println("Il y a " + occurences8 + " occurences de 8");
    }

}
