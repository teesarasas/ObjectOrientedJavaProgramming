
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        while (!word.isEmpty()) {
            String[] splited = word.split(" ");
            for (int i = 0; i < splited.length; i++) {
                System.out.println(splited[i]);
            } word = scanner.nextLine(); 
        } 
    }
}
