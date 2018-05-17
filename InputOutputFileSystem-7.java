import java.io.File;
public class InputOutputFileSystem-7 {

    public static void main(String[] args) {
        File file = new File("D:\\IDEAworkspace02\\collection.json");
        if (file.exists()) {
            Date date = new Date(file.lastModified());
            System.out.println("The file was last modified on: " + date);

        } else {
            System.out.println("The file does not exist!");
        }
    }
}