import java.io.*;
import java.util.*;
public class InputOutputFileSystem-18 {

    private static final String FILE_PATH = "D:\\IDEAworkspace02\\test.txt";
    private File file;

    public InputOutputFileSystem-18() {
        file = new File(FILE_PATH);
    }

    private String findLongestWordInFile() throws FileNotFoundException {

        Scanner scanner = new Scanner(file);
        String longestWord = "", currentWord;

        while (scanner.hasNext()) {
            currentWord = scanner.next();
            if (currentWord.length() > longestWord.length()) longestWord = currentWord;
        }
        return longestWord;
    }

    private void printLongestWord() throws FileNotFoundException {
        System.out.printf("The longest word in the file \"%s\" is: %s", file.getAbsolutePath(), findLongestWordInFile());
    }

    public static void main(String[] args) throws FileNotFoundException {
        new InputOutputFileSystem-18().printLongestWord();
    }
}