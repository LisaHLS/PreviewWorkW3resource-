import java.util.Arrays;
import java.util.stream.Stream;
public class Numbers-6 {

    private boolean isNarcissisticDecimalNumbers(int num) {
        String number = String.valueOf(num);
        return num == Arrays.stream(number.split("")).map(item -> Math.pow(Integer.parseInt(item), number.length())).reduce((x, y) -> x + y).get();
    }

    private void printFirst15Narcissistic() {
        Stream.iterate(0, n -> n + 1).filter(item -> isNarcissisticDecimalNumbers(item)).limit(15).forEach(item -> {
        System.out.print(item + " ");});
    }

    public static void main(String[] args) {
        new Numbers-6().printFirst15Narcissistic();
    }
}