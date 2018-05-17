import java.util.Scanner;
public class Numbers-15 {

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

    private boolean isDuckNumber() {
        return inputNumber.indexOf("0") > 0;
    }

    private void init() {
        input();
        System.out.printf("%sDuck number\n", isDuckNumber() ? "" : "Not a ");
    }

    public static void main(String[] args) {
        new Numbers-15().init();
    }
}