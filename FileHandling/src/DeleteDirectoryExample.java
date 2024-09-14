/*You can delete an empty directory using the delete method of the File class. To delete a directory with contents, you need to delete all files inside it first.
*/

import java.io.File;

public class DeleteDirectoryExample {
    public static void main(String[] args) {
        File directory = new File("newDirectory");

        if (directory.delete()) {
            System.out.println("Directory deleted successfully.");
        } else {
            System.out.println("Failed to delete directory.");
        }
    }
}