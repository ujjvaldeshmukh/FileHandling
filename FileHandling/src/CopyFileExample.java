/*Java does not have a built-in method for copying files in earlier versions, but you can use Files.copy in Java 7 and above.
*/
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyFileExample {
    public static void main(String[] args) {
        File source = new File("example.txt");
        File destination = new File("copy_example.txt");

        try {
            Files.copy(source.toPath(), destination.toPath());
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}