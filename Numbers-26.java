
import java.util.*;
import java.util.stream.Collectors;
public class Numbers-26 {

    private int inputNumber;

    private List<Integer> repfigitList = new ArrayList<>();

    public void input() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        inputNumber = scanner.nextInt();

        if (inputNumber < 0) {
            System.out.println("Number should be positive!");
            input();
        }
    }

    private boolean isKeithNumber() {

        int len = String.valueOf(inputNumber).length(), sum = 0;

        addDigitsOfNumIntoList();

        while (sum < inputNumber) {

            sum = repfigitList.stream().skip(repfigitList.size() - len).limit(len).reduce(0, Integer::sum);
            repfigitList.add(sum);
            if (sum == inputNumber) return true;
        }
        return false;
    }

    private void addDigitsOfNumIntoList() {

        Arrays.stream(String.valueOf(inputNumber).split("")).mapToInt(Integer::parseInt).forEach(num -> {

        repfigitList.add(num);

        });
    }

    public static void main(String[] args) {
        new Numbers-26().input();
        System.out.printf("%sKeith Number", isKeithNumber() ? "" : "Not a ");
    }
}