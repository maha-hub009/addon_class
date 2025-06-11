import java.io.*;

public class ResultProcessor {
    public static void main(String[] args) {
        String inputFile = "marks.txt";
        String outputFile = "result.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];

                int total = 0;
                for (int i = 1; i < parts.length; i++) {
                    total += Integer.parseInt(parts[i]);
                }

                writer.write(name + " Total: " + total);
                writer.newLine();
            }

            System.out.println("Result processing completed. Check " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
