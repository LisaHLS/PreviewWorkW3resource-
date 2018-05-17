import java.time.*;
import java.util.*;
import java.time.temporal.TemporalAdjusters;
public class DateTime-33 {

    public static void main(String[] Strings) {

        LocalDate dt = LocalDate.now();
        System.out.println("Next Friday: "+dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        System.out.println("Previous Friday: "+dt.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));
    }
}