package job08;

public class Sort {
    public static void main(String args[]) {

        int[][] tableau = { {5, 9, 3}, {7, 2, 8}, {1, 6, 4} };
        int[] tableau1D = new int[tableau.length * tableau[0].length];
        int index = 0;

        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                tableau1D[index] = tableau[i][j];
                index++;
            }
        }

        index = 0;
        tableau1D = java.util.Arrays.stream(tableau1D).sorted().toArray();

        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                tableau[i][j] = tableau1D[index];
                index++;
            }
        }

        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print(tableau[i][j]);
            }
            System.out.println();
        }
    }

}
