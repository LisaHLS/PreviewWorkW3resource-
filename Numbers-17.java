import java.util.*;
import java.util.stream.Collectors;
public class Numbers-17 {

    private final static List<Integer> NON_PRIME_ENDS = Arrays.asList(0, 2, 4, 6, 8, 5);
    private int inputNumber;

    public void input() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        inputNumber = scanner.nextInt();

        if (inputNumber < 0) {
            System.out.println("Number should be positive!");
            input();
        }
    }

    private boolean isPrime(int num) {

        if (NON_PRIME_ENDS.contains(num % 10) || String.valueOf(num).length() < 2) return false;

        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) return false;
        }
        return true;
    }

    private int getRotateNumberWithGivenDistance(int distance) {
        List<String> numList = Arrays.stream(String.valueOf(inputNumber).split("")).collect(Collectors.toList());
        Collections.rotate(numList, distance);
        return Integer.parseInt(numList.stream().reduce("", String::concat));
    }

    private boolean isCircularPrime() {

        for (int i = 0; i < String.valueOf(inputNumber).length(); i++) {
            if (!isPrime(getRotateNumberWithGivenDistance(i))) return false;
        }
        return true;
    }

    private void init() {
        input();
        System.out.println("It is "+ (isCircularPrime() ? "" : "not ") + "a Circular Prime number.");
    }

    public static void main(String[] args) {
        new Numbers-17().init();
    }
}