import java.util.Scanner;
public class Numbers-14 {

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

    private boolean isAutomorphicNumber() {
        return String.valueOf(inputNumber * inputNumber).endsWith(Integer.toString(inputNumber));
    }

    private void init() {
        input();
        System.out.printf("%sAutomorphic Number.\n", isAutomorphicNumber() ? "" : "Not an ");
    }

    public static void main(String[] args) {
        new Numbers=14().init();
    }
}