import java.io.File;
public class InputOutputFileSystem-3 {

    public static void main(String[] args) {
        File my_file_dir = new File("D:\\IDEAworkspace02\\collection.json");
        if (my_file_dir.exists()) {
            System.out.println("The directory or file exists.\n");

        } else {
            System.out.println("The directory or file does not exist.\n");
        }
    }
}