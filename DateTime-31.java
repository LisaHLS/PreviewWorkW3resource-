import java.time.*;
import java.util.*;
public class DateTime-31 {

    public static void main(String[] Strings) {

        LocalDateTime dateTime = LocalDateTime.of(2017, 9, 16, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.now();
        int diffInNano = java.time.Duration.between(dateTime, dateTime2).getNano();
        long diffInSeconds = java.time.Duration.between(dateTime, dateTime2).getSeconds();
        long diffInMilli = java.time.Duration.between(dateTime, dateTime2).toMillis();
        long diffInMinutes = java.time.Duration.between(dateTime, dateTime2).toMinutes();
        long diffInHours = java.time.Duration.between(dateTime, dateTime2).toHours();
        System.out.printf("Difference is %d Hours, %d Minutes, %d Milli, %d Seconds and %d Nano",
        diffInHours, diffInMinutes, diffInMilli, diffInSeconds, diffInNano );

    }
}