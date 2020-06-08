
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println(first * first);
    }
}
