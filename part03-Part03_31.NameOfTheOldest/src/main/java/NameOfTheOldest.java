
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = -1;
        String oldestName = "";
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);
            String oooo = parts[0];
            if (age > oldest) {
                oldest = age;
                oldestName = oooo;
            }

        }
        
        System.out.println("Name of the oldest: " + oldestName);
    }
}
