package handlingFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class CreateAndWriteFileExample {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String fileName = keyboard.next();
        keyboard.close();

        File file = new File("src/" + fileName + ".txt");

        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            String content = "Hello \n I am the content the file";
            byte[] fileContentBytes = content.getBytes();
            outputStream.write(fileContentBytes);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File not found");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}
