import java.io.File;
public class InputOutputFileSystem-4 {

    public static void main(String[] args) {

        File my_file_dir = new File("D:\\IDEAworkspace02\\collection.json");

        if (my_file_dir.canWrite()) {
        System.out.println(my_file_dir.getAbsolutePath() + " can write.\n");
        } else {
            System.out.println(my_file_dir.getAbsolutePath() + " cannot write.\n");
        }

        if (my_file_dir.canRead()) {
            System.out.println(my_file_dir.getAbsolutePath() + " can read.\n");
        } else {
            System.out.println(my_file_dir.getAbsolutePath() + " cannot read.\n");
        }
    }
}