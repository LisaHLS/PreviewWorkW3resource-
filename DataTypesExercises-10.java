import java.util.Scanner;
public class DataTypesExercises-10 {

    public static void main(String[] Strings) {

         Scanner sc = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int input = sc.nextInt();
        for(int i = 5; i >= 0; i--) {
          if(i != 0) {
            System.out.print((int)(input/Math.pow(10,i))%10 + " ");
          } else {
            System.out.print((int)(input/Math.pow(10,i))%10 + "\n");
          }
        }
        sc.close();

    }
}