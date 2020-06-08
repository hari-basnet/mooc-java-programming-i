
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String userInput = scanner.nextLine();
            System.out.println("Carry on?");

            
            if(userInput.equals("no")){
                break;
            }
        }


    }
}
