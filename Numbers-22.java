
import java.util.Scanner;
public class Numbers-22 {

    private int inputNumber;

    public void input() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        inputNumber = scanner.nextInt();

        if (inputNumber < 0) {
            System.out.println("Number should be positive!");
            input();
        }

        if (!validateInputIsPrime()) {
            System.out.println("Input should be prime number!");
            input();
        }
    }

    private boolean validateInputIsPrime() {

        for (int j = 2; j <= Math.sqrt(inputNumber); j++) {

            if (inputNumber % j == 0) return false;
        }
        return true;
    }

    private boolean isMersenneNumber() {

        for (int i = 0; ; i++) {
            int power = (int) Math.pow(2, i);

            if (power > inputNumber + 1) return false;

            if (power == inputNumber + 1) return true;
        }
    }

    public static void main(String[] args) {
        new Numbers-22().input();
        System.out.printf("%s is %sa Mersenne number.", inputNumber, isMersenneNumber() ? "" : "not ");
    }
}