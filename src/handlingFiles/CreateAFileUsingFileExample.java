package handlingFiles;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class CreateAFileUsingFileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name of the file: " );
        String fileName = sc.next();
        sc.close();

        File file = new File("src/" + fileName + ".txt");

        try {
            boolean isCreated = file.createNewFile();
            if (isCreated) {
                System.out.println("File \"" + fileName + ".txt\" was created");
            }
        } catch (IOException e) {
            System.err.println("IO exception occurred!");
            System.err.println(e.getMessage());
        }
    }
}
