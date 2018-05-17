import java.util.*;
import java.time.*;
import java.text.*;
public class DateTime-10 {

    public static void main(String[] Strings) {

        YearMonth ym = YearMonth.of(2018, 5);

        String firstDay = ym.atDay(1).getDayOfWeek().name();
        String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
        System.out.println(firstDay);
        System.out.println(lastDay);
    }
}