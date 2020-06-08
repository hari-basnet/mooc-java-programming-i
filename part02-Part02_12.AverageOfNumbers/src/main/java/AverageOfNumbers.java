
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
    
        while(true){
            int userInput = Integer.parseInt(scanner.nextLine());
            System.out.println("Give a number: ");
            
            if(userInput == 0){
                break;
            }else {
                sum += userInput;
                count += 1;
                continue;
            }
        }
    
        double average = 1.0 * sum / count;
        System.out.println("Average of the numbers: " + average);
    }
}
