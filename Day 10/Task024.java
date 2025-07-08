import java.io.FileReader;
import java.io.IOException;

public class Task024 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("MergedFile.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}