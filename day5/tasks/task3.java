import java.io.FileWriter;
import java.io.IOException;

public class SimpleWrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");

            writer.write("Hello machan!\n");
            writer.write("How are you?\n");
            writer.write("This is Java file writing.\n");
            writer.write("Bye!\n");

            writer.close();
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
