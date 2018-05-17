import java.io.*;
import java.util.*;
public class InputOutputFileSystem-14 {

    private static final String filePath = "D:\\IDEAworkspace02\\test.txt";

    private File file;

    public InputOutputFileSystem-14() {
        file = new File(filePath);
    }

    private void readFileIntoArray() {

        BufferedReader bufferedReader = null;
        List<String> textList = new ArrayList<>();
        String lines;

        try {

            bufferedReader = new BufferedReader(new FileReader(file));
            while ((lines = bufferedReader.readLine()) != null) {
                textList.add(lines);
            }
            System.out.println(textList);

        } catch (FileNotFoundException e) {
            System.err.println("File not found");

        } catch (IOException e) {
            System.err.println("Unable to read the file.");

        }finally {

            try {
                assert bufferedReader != null;
                bufferedReader.close();

            } catch (IOException e) {
                System.err.println("Unable to close the file.");
            }
        }
    }

    public static void main(String[] args) {
        new InputOutputFileSystem-14().readFileIntoArray();
    }
}