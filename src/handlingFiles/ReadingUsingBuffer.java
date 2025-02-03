package handlingFiles;

import java.io.*;

public class ReadingUsingBuffer {
    public static void main(String[] args) {
        String filePath = "src/handlingFiles/file.txt";
        File myFile = new File(filePath);

        try (BufferedReader inputStream = new BufferedReader(new FileReader(myFile))) {
            int characterUnicodeRepresentation;
            while ((characterUnicodeRepresentation = inputStream.read()) != -1) {
                System.out.print((char) characterUnicodeRepresentation);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File not found");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}
