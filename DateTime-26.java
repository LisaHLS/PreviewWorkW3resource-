import java.time.*;
public class DateTime-26 {

    public static void main(String[] Strings) {

        LocalDate ldt = LocalDate.of(2018, Month.FEBRUARY, 10);
        Month mn = ldt.getMonth();

        System.out.println("Integer value of the current month: " + mn.getValue());
        System.out.println("Length of the month: " + mn.minLength());
        System.out.println("Maximum length of the month: " + mn.maxLength());
        System.out.println("First month of the Quarter: " +  mn.firstMonthOfQuarter());

    }
}