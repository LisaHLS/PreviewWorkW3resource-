import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Numbers-21 {

    private int inputNumber;

    public void input() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the maximum boundary value of Ramanujan numbers: ");
        inputNumber = scanner.nextInt();

        if (inputNumber < 0) {
            System.out.println("Value should be positive!");
            input();
        }

    }

    private List<Integer> getCubesOfRamanujanNumbers(int num) {

        int count = 0;

        List<Integer> cubeArrList = new ArrayList<>();

        for (int i = 1; i < Math.floor(Math.pow(num, 1.0 / 3.0)); i++) {

            double b = Math.round(Math.pow(num - Math.pow(i, 3), 1.0 / 3.0));

            if (i * i * i + b * b * b == num && !cubeArrList.contains(i)) {

                count++;
                cubeArrList.add(i);
                cubeArrList.add((int) b);
            }
        }
        return count > 1 ? cubeArrList : null;
    }

    private void print() {

        List<Integer> cubeArrList;
        for (int i = 1; i <= inputNumber; i++) {

            cubeArrList = getCubesOfRamanujanNumbers(i);
            if (cubeArrList != null) {
                System.out.printf("%d = %d^3 + %d^3 = %d^3 + %d^3%n", i, cubeArrList.get(0), cubeArrList.get(1), cubeArrList.get(2), cubeArrList.get(3));
            }
        }
    }

    private void init() {
        input();
        print();
    }

    public static void main(String[] args) {
        new Numbers-21().init();
    }
}