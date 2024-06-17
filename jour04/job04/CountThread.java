package job04;

public class CountThread implements Runnable {
    private int maxNumber;

    public CountThread(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= maxNumber; ++i) {
            System.out.println(i);
        }
    }

}
