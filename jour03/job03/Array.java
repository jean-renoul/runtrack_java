package job03;

public class Array {
    public static void main(String args[]) {
        String monTableau[] = new String[4];
        monTableau[0] = "Josette";
        monTableau[1] = "John";
        monTableau[2] = "Myrtille";
        monTableau[3] = "Marc";

        System.out.println(monTableau[1]);
        monTableau[2] = "Mireille";

        for (int i = 0; i < monTableau.length; i++) {
            System.out.println(monTableau[i]);
        }
    }

}
