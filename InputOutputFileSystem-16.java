import java.io.*;
public class InputOutputFileSystem-16 {

    private static final String FILE_PATH = "D:\\IDEAworkspace02\\test.txt";
    private static String inputText;
    private File file;

    public InputOutputFileSystem-16() {
        file = new File(FILE_PATH);
    }

    private void readInput(){

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input a line of text to be appended in the file: ");

        try {
            inputText = bufferedReader.readLine();

        } catch (IOException e) {
            e.printStackTrace();

        }finally {
            try {
                 bufferedReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void writeAndReadFile() {

        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        String lines;

        try {

            fileWriter = new FileWriter(file,true);
            fileWriter.write(System.lineSeparator());
            fileWriter.write(inputText);

            fileWriter.close();
            bufferedReader = new BufferedReader(new FileReader(file));
            System.out.println("After appending, the file content is:");

            while ((lines = bufferedReader.readLine()) != null) {
                 System.out.println(lines);
            }
            bufferedReader.close();

        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    private void init() {
        readInput();
        writeAndReadFile();
    }

    public static void main(String[] args) {
        new InputOutputFileSystem-16().init();
    }
}