
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        double average = 0;
        
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            System.out.println("Give a number: ");

            if(userInput != 0){
                sum += userInput;
                count += 1;
                continue;
            }else {
                break;
            }
            
        }
        System.out.println("Average of the numbers: " + (sum / count));

    }
}
