import java.io.File;

public class RenameFileExample {
    public static void main(String[] args) {
        File oldFile = new File("example.txt");
        File newFile = new File("renamed_example.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename file.");
        }
    }
}