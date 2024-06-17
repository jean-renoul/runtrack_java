package job03;
import java.io.FileWriter;

public class WriteThread implements Runnable {
    private int charsNumber;

    public WriteThread(int charsNumber) {
        this.charsNumber = charsNumber;
    }

    @Override
    public void run() {
        try {
            FileWriter file = new FileWriter("job03/output.txt", true);
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
