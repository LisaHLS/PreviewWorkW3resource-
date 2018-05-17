import java.io.File;
public class InputOutputFileSystem-1 {

    public static void main(String[] args) {
        File file = new File("D:\\IDEAworkspace02");
        String[] fileList = file.list();

        for(String name:fileList){
            System.out.println(name);
        }
    }
}