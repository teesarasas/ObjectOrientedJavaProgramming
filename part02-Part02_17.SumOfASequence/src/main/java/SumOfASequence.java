
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        
        System.out.print("Last number? ");
        int number = Integer.valueOf(scanner.nextLine());
        
        while (counter < number) {
            sum = sum + (counter + 1);
            counter++;
        }
        System.out.println("The sum is " + sum);
    }
}
