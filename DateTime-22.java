import java.time.*;
public class DateTime-22 {

    public static void main(String[] Strings) {

        LocalDate today = LocalDate.now();
        System.out.println("Current Date: "+today);
        System.out.println("10 days before today will be "+today.plusDays(-10));
        System.out.println("10 days after today will be "+today.plusDays(10));

    }
}