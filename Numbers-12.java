import java.util.Arrays;
import java.util.Scanner;
public class Numbers-12 {

    private int inputNumber;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number : ");
        inputNumber = scanner.nextInt();

        if (inputNumber < 0) {
            System.out.println("Number should be positive!");
            input();
        }
    }

    private boolean isHarshadNumber() {
        String number = String.valueOf(inputNumber);
        return inputNumber % Arrays.stream(number.split("")).mapToInt(Integer::parseInt).sum() == 0;
    }

    private void init() {
        input();
        System.out.printf("%s is %sa Harshad Number.\n", inputNumber,isHarshadNumber() ? "" : "not ");

    }

    public static void main(String[] args) {
        new Numbers-12().init();
    }
}