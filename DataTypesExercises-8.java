import java.util.Scanner;
public class DataTypesExercises-8 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double val = input.nextDouble();

        System.out.printf("Square: %12.2f\n", val * val);
        System.out.printf("Cube: %14.2f\n", val * val * val);
        System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 4));
        input.close();

    }
}