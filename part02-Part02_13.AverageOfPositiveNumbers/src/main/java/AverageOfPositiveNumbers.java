
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positive = 0;
        int counter = 0;
        while(true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number > 0) {
                positive = positive + number;
                counter = counter + 1;
                continue;
            } else if (number == 0) {
                break;
            }
        }
        double average = (1.0 * positive) / counter;
        if (positive <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }
    }
}
