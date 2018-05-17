import java.time.*;
public class DateTime-15 {

    public static void main(String[] Strings) {

        LocalTime time = LocalTime.now();
        System.out.println("Time after 2 hours : " + time);

        LocalTime newTime = time.plusHours(4);
        System.out.println("Time after 2 hours : " + newTime);

    }
}