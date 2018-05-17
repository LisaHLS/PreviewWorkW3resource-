import java.util.stream.Stream;
public class Numbers-7 {

    private int getLucasNumber(int num) {

        if (num == 0) return 2;

        if (num == 1) return 1;

        return getLucasNumber(num - 1) + getLucasNumber(num - 2);
    }

    private void printFirst10LucasNumbers() {
        System.out.println("First ten Lucas a numbers:");
        Stream.iterate(0, n -> n + 1).map(item -> getLucasNumber(item)).limit(10).forEach(System.out::println);
    }

    public static void main(String[] args) {
        new Numbers-7().printFirst10LucasNumbers();
    }
}