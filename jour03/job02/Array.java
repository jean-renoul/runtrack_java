package job02;

public class Array {
    public static void main(String args[]) {
        int monTableau[] = new int[4];
        monTableau[0] = 12;
        monTableau[1] = 6;
        monTableau[2] = 76;
        monTableau[3] = 89;

        for (int i = 0; i < monTableau.length; i++) {
            System.out.println(monTableau[i]);
        }

        monTableau[0] = 1;
        monTableau[1] = 2;
        monTableau[2] = 3;
        monTableau[3] = 4;

        for (int i = 0; i < monTableau.length; i++) {
            System.out.println(monTableau[i]);
        }
    }

}
