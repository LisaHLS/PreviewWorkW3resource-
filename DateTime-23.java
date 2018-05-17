import java.time.*;
import java.time.temporal.TemporalAdjusters;
public class DateTime-23 {

    public static void main(String[] Strings) {

        LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        Period period = today.until(lastDayOfYear);
        System.out.println("Months remaining in the year: "+period.getMonths());

    }
}