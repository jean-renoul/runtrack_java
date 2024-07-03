package job11;

public class Factorielle {
    public static void main(String[] args) {
        int result = 1;
        int n = 8;

        for (int i =1; i <= n; ++i) {
            result *= i;
        }
        System.out.println("La factorielle de " + n + " est " + result);

    }

}
