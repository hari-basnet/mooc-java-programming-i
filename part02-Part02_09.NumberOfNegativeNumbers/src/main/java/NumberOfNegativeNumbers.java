
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            System.out.println("Give a number: ");

            if(userInput == 0){
                break;
            }
            
            if(userInput < 0){
                count += 1;
                continue;
            }
            
            if(userInput > 0){
                continue;
            }
            
        }
        
        System.out.println("Number of negative numbers: " + count);


    }
}
