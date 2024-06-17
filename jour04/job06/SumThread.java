package job06;

public class SumThread implements Runnable {
    private int[] numbers;
    private int result;

    public SumThread(int[] numbers) {
        this.numbers = numbers;
        this.result = 0;
    }

    @Override
    public void run() {
        for (int i = 0; i < numbers.length; ++i) {
            this.result += numbers[i];
    }
    System.out.println("La somme des nombres est de " + this.result);
    }

}