package handlingFiles;

import java.io.*;
import java.util.Scanner;

public class WriteToFileExample02 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String fileName = keyboard.next();
        keyboard.close();

        File file = new File("src/" + fileName + ".txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("I am the content of the file");
            System.out.println("Data was written successfully");
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File not found");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}
