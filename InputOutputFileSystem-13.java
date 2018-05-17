import java.io.*;
public class InputOutputFileSystem-13 {

    public static void main(String[] args){
        String strLine = "";
        String str_data = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\IDEAworkspace02\\test.txt"));
            while ((strLine = br.readLine()) != null){
                str_data += strLine;
            }
            System.out.println(str_data);
            br.close();

        } catch (FileNotFoundException e) {
            System.err.println("File not found");

        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}