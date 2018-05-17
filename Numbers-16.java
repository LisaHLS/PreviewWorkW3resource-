import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Numbers-16 {

    private int firstNumber;

    private int secondNumber;

    public void input() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        firstNumber = scanner.nextInt();

        System.out.print("Input the second number: ");
        secondNumber = scanner.nextInt();
    }

    private int getSumOfProperDivisors(int num) {

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    private void init() {
        input();
        boolean isAmicableNumber = getSumOfProperDivisors(firstNumber) == getSumOfProperDivisors(secondNumber);
        System.out.println("These numbers are"+ (isAmicableNumber ? "" : " not") + " amicable.");
    }

    public static void main(String[] args) {
        new Numbers-16().init();
    }
}