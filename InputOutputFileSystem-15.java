import java.io.*;
public class InputOutputFileSystem-15 {

    private static final String FILE_PATH = "D:\\IDEAworkspace02\\test.txt";

    private static String APPEND_TEXT = "This is a new line!";

    private File file;

    public InputOutputFileSystem-15() {
        file = new File(FILE_PATH);
    }

    private void write() {
        try {

            FileWriter fileWriter = new FileWriter(file,true);
            fileWriter.write(APPEND_TEXT);
            fileWriter.close();

        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    private void read() {

        BufferedReader bufferedReader = null;
        String lines;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((lines = bufferedReader.readLine()) != null) {
                System.out.println(lines);
            }

        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());

        }finally {

            try {
                assert bufferedReader != null;
                bufferedReader.close();

            } catch (IOException e) {
                System.err.println("IOException: " + e.getMessage());
            }
        }
    }

    private void init() {
        write();
        read();
    }

    public static void main(String[] args) {
        new InputOutputFileSystem-15().init();
    }
}