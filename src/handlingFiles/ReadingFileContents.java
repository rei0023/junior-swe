package handlingFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFileContents {
    public static void main (String[] args) {
        String filePath = "src/handlingFiles/file.txt";
        File myTestFile = new File(filePath);

        try (FileInputStream inputStream = new FileInputStream(myTestFile)) {
            byte[] fileContentAsBytes = inputStream.readAllBytes();
            for (int i = 0; i < fileContentAsBytes.length; i++) {
                System.out.print((char) fileContentAsBytes[i]);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File not found!");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
