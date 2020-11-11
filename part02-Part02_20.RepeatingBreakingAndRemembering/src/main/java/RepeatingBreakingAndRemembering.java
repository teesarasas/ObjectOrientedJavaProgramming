
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        int sumNumber = 0;
        int countNumber = 0;
        int even = 0;
        int odd = 0;
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give numbers:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            } else if (number % 2 == 0) {
                even++;
            } else if (number % 2 != 0) {
                odd++;
            }
            sumNumber += number;
            countNumber++;
 
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum:" + sumNumber);
        System.out.println("Numbers: " + countNumber);
        System.out.println("Average:" + (sumNumber * 1.0) / (countNumber * 1.0));
        System.out.println("Even:" + even);
        System.out.println("Odd:" + odd);
    }
}
