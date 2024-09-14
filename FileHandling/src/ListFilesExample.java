import java.io.File;

public class ListFilesExample {
    public static void main(String[] args) {
        File directory = new File("newDirectory");

        String[] fileList = directory.list();
        if (fileList != null) {
            for (String fileName : fileList) {
                System.out.println(fileName);
            }
        } else {
            System.out.println("Directory is empty or does not exist.");
        }
    }
}