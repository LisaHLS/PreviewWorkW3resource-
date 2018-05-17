import java.time.*;
public class DateTime-28 {

    public static void main(String[] Strings) {

        LocalDateTime dateTime = LocalDateTime.now().minusHours(5).minusMinutes(30);
        System.out.println("Current Date and Time:  " + LocalDateTime.now());
        System.out.println("Before 7 houres and 30 minutes: " + dateTime);

    }
}