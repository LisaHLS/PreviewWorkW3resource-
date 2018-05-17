import java.util.OptionalInt;
import java.util.stream.IntStream;
public class Numbers-4 {

    private int count = 1;

    private int getKaprekarSplitIndex(int num) {

        String squareNum = String.valueOf(num * num);
        if (squareNum.length() == 1) return 0;

        OptionalInt index = IntStream.range(1, squareNum.length()).filter(i -> Integer.parseInt(squareNum.substring(0, i)) + Integer.parseInt(squareNum.substring(i)) == num && Integer.parseInt(squareNum.substring(i)) != 0).findFirst();
        return index.orElse(0);
    }

    private void printKaprekarNumber() {

        for (int i = 1; i < 1000; i++) {

            if (i == 1) {
                System.out.printf("%-8d%-10d%s + %s\n", 1, 1, "0", "1");
                continue;
            }

            int index = getKaprekarSplitIndex(i);
            if (index != 0) {
                count++;
                System.out.printf("%-8d%-10d%s + %s\n", i, i * i, String.valueOf(i * i).substring(0, index), String.valueOf(i * i).substring(index));
            }
        }
        System.out.printf("%d Kaprekar numbers.\n", count);
    }

    public static void main(String[] args) {
        new Numbers-4().printKaprekarNumber();
    }
}