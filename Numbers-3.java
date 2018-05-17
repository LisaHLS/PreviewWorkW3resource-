import java.util.Scanner;
public class Numbers-3 {

    private int startRange;

    private int endRange;

    public void input() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the starting number of the range: ");
        startRange = scanner.nextInt();

        while (true) {

            System.out.print("Input the ending number of the range: ");
            endRange = scanner.nextInt();

            if (endRange > startRange) {
                break;

            } else {
                System.out.println("Ending number must be greater than starting number!");
            }
        }
    }

    private void pringRandomNum() {
        System.out.printf("The random integer between %d and %d is: %d\n", startRange, endRange, (int) (startRange + Math.random() * (endRange - startRange + 1)));
    }

    public static void main(String[] args) {
        Numbers-3 number = new Numbers_3();
        number.input();
        number.pringRandomNum();
    }
}