import java.io.File;
public class InputOutputFileSystem-6 {

    private static final String filePath1 = "D:\\IDEAworkspace02\\employees.zip";

    private static final String filePath2 = "D:\\IDEAworkspace02\\helloTWU.zip";

    private File file1;

    private File file2;

    public InputOutputFileSystem-6() {

        file1 = new File(filePath1);

        file2 = new File(filePath2);
    }

    private void printComparisonResult() {
        System.out.printf("'%s'  %s  '%s'%n",file1.getAbsolutePath(),getCompareResult(file1, file2),file2.getAbsolutePath());
    }

    private String getCompareResult(File file1, File file2) {

        if (file1.compareTo(file2) == 0) return "=";

        if (file1.compareTo(file2) > 0) return "<";

        return ">";
    }

    public static void main(String[] args) {
        new InputOutputFileSystem-6().printComparisonResult();
    }
}