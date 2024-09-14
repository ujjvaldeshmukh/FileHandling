import java.io.File;

public class CreateDirectoryExample {
    public static void main(String[] args) {
        File directory = new File("newDirectory");

        if (directory.mkdir()) {
            System.out.println("Directory created successfully.");
        } else {
            System.out.println("Failed to create directory.");
        }
    }
}