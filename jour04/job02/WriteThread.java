package job02;
import java.io.FileWriter;

public class WriteThread implements Runnable{
    private int charsNumber;

    public WriteThread(int charsNumber) {
        this.charsNumber = charsNumber;
    }

    @Override
    public void run() {
        try {
            FileWriter file = new FileWriter("job02/output.txt", false);
        for (int i = 0; i < charsNumber; ++i) {
            file.write((char) (Math.random() * 26 + 97));
        }
        file.close();
        }
        catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();     
        }
    }
}
