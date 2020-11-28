
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumBirthYear = 0;
        String name = "";
        int nameLength = 0;
        int counter = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] split = input.split(",");
            if (nameLength < split[0].length()) {
                nameLength = split[0].length();
                name = split[0];
            }
            sumBirthYear += Integer.valueOf(split[split.length - 1]);
            counter++;
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * sumBirthYear) / counter);
    }
}
