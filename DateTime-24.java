import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateTime-24 {

    public static void main(String[] Strings) {

        LocalDate date = LocalDate.now();
        System.out.println("Default format of LocalDate="+date);
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Default format of LocalDateTime="+dateTime);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));

        Instant timestamp = Instant.now();
        System.out.println("Default format of Instant="+timestamp);

        LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",
        DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
        System.out.println("Default format after parsing = "+dt);

    }
}