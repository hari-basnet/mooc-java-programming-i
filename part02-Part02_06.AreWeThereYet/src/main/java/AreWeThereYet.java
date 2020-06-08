
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            System.out.println("Give a number: ");

            
            if(userInput == 4){
                break;
            }
        }

    }
}
