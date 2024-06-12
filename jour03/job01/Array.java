package job01;

public class Array {
    public static void main(String args[]) {
        int[] tab = new int[5];
        tab[0] = 10;
        tab[2] = 2;
        tab[4] = 69;

        System.out.println(tab);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        };
        System.out.println(tab[1]);
    }

}
