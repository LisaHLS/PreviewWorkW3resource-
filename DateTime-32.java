import java.time.*;
import java.util.*;
public class DateTime-32 {

    public static void main(String[] Strings) {

        LocalDate pdate = LocalDate.of(1991, 11, 10);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(pdate, now);

        System.out.printf("I am  %d years, %d months and %d days old.",
        diff.getYears(), diff.getMonths(), diff.getDays());

    }
}