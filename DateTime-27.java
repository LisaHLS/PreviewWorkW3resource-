import java.time.*;
public class DateTime-27 {

    public static void main(String[] Strings) {

        LocalTime time = LocalTime.of(12, 24, 32);

        System.out.println("Current Local time: " + time);
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minue: " + time.getMinute());
        System.out.println("Second: " +time.getSecond());

    }
}