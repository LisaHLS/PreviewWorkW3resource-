import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Numbers-19 {

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

    private int getRotateNumberWithGivenDistance(int distance) {
        List<String> numList = Arrays.stream(String.valueOf(inputNumber).split("")).collect(Collectors.toList());
        Collections.rotate(numList, distance);
        return Integer.parseInt(numList.stream().reduce("", String::concat));
    }

    private boolean isCyclicNumber() {
        for (int i = 0; i < String.valueOf(inputNumber).length(); i++) {
            if (getRotateNumberWithGivenDistance(i) % inputNumber != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        new Numbers-19().input();
        System.out.println((isCyclicNumber() ? "It is" : "Not") + " a cyclic number.");
    }
}