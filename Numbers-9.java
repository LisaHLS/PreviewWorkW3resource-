import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Numbers-9 {

    private Set<Long> cycle = new HashSet<Long>();

    private Double getSumOfDigits(int num) {

        String number = String.valueOf(num);
        return Arrays.stream(number.split("")).map(item -> Math.pow(Integer.parseInt(item), 2)).reduce((x, y) -> x + y).get();
    }

    private boolean isHappyNumber(int num) {

        if (num == 1) return true;
        if (num == 4) return false;

        return isHappyNumber(getSumOfDigits(num).intValue());
    }

    private void printFirst10HappyNumbers() {
        System.out.println("First 10 Happy numbers:");
        Stream.iterate(1, n -> n + 1).filter(this::isHappyNumber).limit(10).forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Numbers-9().printFirst10HappyNumbers();
    }
}