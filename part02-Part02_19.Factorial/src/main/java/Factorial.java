
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 1;
        int counter = 1;
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        
        while(counter <= number) {
            start = start * counter;
            counter++;
        }
        System.out.println("Factorial:" + start);
    }
}
