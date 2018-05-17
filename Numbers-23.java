
import java.util.Arrays;
import java.util.stream.Stream;
public class Numbers-23 {

    private boolean isNarcissisticDecimalNumbers(int num) {

        String number = String.valueOf(num);
        return num == Arrays.stream(number.split("")).map(item -> Math.pow(Integer.parseInt(item), number.length())).reduce((x, y) -> x + y).get();
    }

    private void printNarcissistic() {

        for (int i = 1; i <= 1000; i++) {
            if (isNarcissisticDecimalNumbers(i)) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new Numbers-23().printNarcissistic();
    }
}