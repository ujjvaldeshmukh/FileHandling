/*You can use Files.move in Java 7 and above.*/


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MoveFileExample {
    public static void main(String[] args) {
        File source = new File("example.txt");
        File destination = new File("moved_example.txt");

        try {
            Files.move(source.toPath(), destination.toPath());
            System.out.println("File moved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}