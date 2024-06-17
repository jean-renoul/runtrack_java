package job05;

public class CountThread implements Runnable {
    private int start;
    private int end;

    public CountThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; ++i) {
            System.out.println(i);
        }
    }

}
