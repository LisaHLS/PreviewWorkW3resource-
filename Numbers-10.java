import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Numbers-10 {

    public static boolean isHappyNumber(int num){
        Set<Integer> uniqueNum = new HashSet<Integer>();

        while (uniqueNum.add(num)){
            int value = 0;
            while (num > 0){
                value += Math.pow(num % 10, 2);
                num /= 10;
            }
            num = value;
        }
        return num == 1;
    }

    public static void main(String[] args){
        System.out.print("Input a number: ");
        int num = new Scanner(System.in).nextInt();
        System.out.println(isHappyNumber(num) ? "Happy Number" : "Unhappy Number");
    }
}