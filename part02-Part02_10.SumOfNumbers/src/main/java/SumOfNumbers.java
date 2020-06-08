
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            System.out.println("Give a number: ");

            if(userInput != 0){
                sum += userInput;
                continue;
            }else {
                break;
            }
            
        }
        
        System.out.println("Sum of the numbers: " + sum);

    }
}
