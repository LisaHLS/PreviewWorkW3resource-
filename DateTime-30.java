import java.time.*;
import java.util.*;
public class DateTime-30 {

    public static void main(String[] Strings) {

        LocalDate pdate = LocalDate.of(2017, 01, 01);
        LocalDate now = LocalDate.now();

        Period diff = Period.between(pdate, now);

        System.out.printf("Difference is %d years, %d months and %d days old",
        diff.getYears(), diff.getMonths(), diff.getDays());

    }
}