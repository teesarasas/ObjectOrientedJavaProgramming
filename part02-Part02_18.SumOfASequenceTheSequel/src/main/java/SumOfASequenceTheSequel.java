
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("First number?");
        int first = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        
        while (first <= last) {
            sum = sum + first;
            first++;
            
        }
        System.out.println("The sum is " + sum);
        
        
    }
}
