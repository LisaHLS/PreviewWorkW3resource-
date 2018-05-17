import java.util.Scanner;
public class Numbers-13 {

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

    private boolean isPronicNumber() {
        for (int i = 1; i < (inputNumber + 1) / 2; i++) {
            if (i * (i+1) == inputNumber) return true;
        }
        return false;
    }

    private void init() {
        input();
        System.out.printf("%sPronic Number.\n", isPronicNumber() ? "" : "Not a ");
    }

    public static void main(String[] args) {
        new Numbers-13().init();
    }
}