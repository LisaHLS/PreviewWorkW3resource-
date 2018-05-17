import java.util.Arrays;
import java.util.Scanner;
public class Numbers-11 {

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

    private boolean isDisariumNumber(int num) {
        String number = String.valueOf(num);
        return num == Arrays.stream(number.split("")).map(item -> Math.pow(Integer.parseInt(item), number.indexOf(item) + 1)).reduce((x, y) -> x + y).get();
    }

    private void init() {
        input();
        System.out.printf("%sDisarium Number\n", isDisariumNumber(inputNumber) ? "" : "Not a ");
    }

    public static void main(String[] args) {
        new Numbers-11().init();
    }
}