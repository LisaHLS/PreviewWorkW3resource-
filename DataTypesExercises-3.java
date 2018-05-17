import java.util.Scanner;
public class DataTypesExercises-3 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();
        int sum = ((num/100)%10) + ((num/10)%10) + (num % 10);

        System.out.println("The sum of all digits in " + num + " is " + sum);
		
		input.close();

    }
}