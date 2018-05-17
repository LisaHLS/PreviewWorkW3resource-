import java.io.*;
public class InputOutputFileSystem-11 {

    private static final String filePath = "D:\\IDEAworkspace02\\test.txt";

    private File file;

    public InputOutputFileSystem-11() {
        file = new File(filePath);
    }

    private void readFileByLines() {

        BufferedReader bufferedReader = null;

        String lines;

        try {

            bufferedReader = new BufferedReader(new FileReader(file));
            while ((lines = bufferedReader.readLine()) != null) {
                System.out.println(lines);
            }

        } catch (IOException e) {
             e.printStackTrace();

        } finally {

            try {
                assert bufferedReader != null;
                bufferedReader.close();

            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }

    public static void main(String[] args) {
        new InputOutputFileSystem-11().readFileByLines();
    }
}