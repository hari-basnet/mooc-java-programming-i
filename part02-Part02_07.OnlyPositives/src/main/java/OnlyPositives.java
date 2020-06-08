
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            System.out.println("Give a number: ");

            if(userInput < 0){
                System.out.println("Unsuitable number");
                continue;
            }

            if(userInput == 0){
                break;
            }

            if(userInput > 0){
                System.out.println(Math.pow(userInput, 2));
            }
        }

    }
}
