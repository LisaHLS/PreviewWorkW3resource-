import java.io.File;
public class InputOutputFileSystem-2 {

    private static final String filePath = "D:\\IDEAworkspace02";
    private static final String PREFIX = ".zip";

    private File file;

    public InputOutputFileSystem-2() {
        file = new File(filePath);
    }

    private void printFileNamwWithGivenSuffix() {

        String[] fileList = file.list((dir, name) -> name.toLowerCase().endsWith(PREFIX));

        for (String fileName : fileList) {
            System.out.println(fileName);
        }
    }

    public static void main(String[] args) {
        new InputOutputFileSystem-2().printFileNamwWithGivenSuffix();
    }
}