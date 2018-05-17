
import java.util.stream.Stream;
public class Numbers-28 {

    private final static int MAX_BODUNDARY = 20;

    private boolean isHammingNumber(int num) {

        if (num == 1) return true;

        if (num % 2 == 0) return isHammingNumber(num / 2);

        if (num % 3 == 0) return isHammingNumber(num / 3);

        if (num % 5 == 0) return isHammingNumber(num / 5);

        return false;
    }

    private void printammingNumbers() {

        System.out.print("First Twenty Hamming numbers: ");

        Stream.iterate(1, n -> n + 1).filter(item -> isHammingNumber(item)).limit(MAX_BODUNDARY).forEach(item -> {

        System.out.print(item + " ");

        });
    }

    public static void main(String[] args) {
        new Numbers-28().printammingNumbers();
    }
}