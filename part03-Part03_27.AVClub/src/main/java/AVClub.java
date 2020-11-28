
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            String[] splited = input.split(" ");
            for (int i = 0; i < splited.length; i++) {
                if (splited[i].contains("av")) {
                    System.out.println(splited[i]);
                }
            }
            input = scanner.nextLine();
        }

    }
}
