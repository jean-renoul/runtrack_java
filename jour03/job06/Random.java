package job06;

public class Random {
    public static void main(String args[]) {

        int[] monTableau = new int[10];

        for (int i = 0; i < monTableau.length; i++) {
            monTableau[i] = (int)(Math.random() * 100);
            System.out.println(monTableau[i]);
        }

    }
}
