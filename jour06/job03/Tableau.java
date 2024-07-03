package job03;

public class Tableau {

    public static void main(String[] args) {
        int[] T = new int[10];
        for (int i = 0; i < T.length; i++) {
            T[i] = i;
        }
        System.out.println(T[0]);
        System.out.println(T[1]);
        System.out.println(T[5]);
        System.out.println(T[9]);
        /* Pas possible d'appeller T[10] */
    }
    
}
