
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int positiveNumbers = 0;
        int breakPoint = -1;
        int number;
        int evenNumbers = 0;
        int oddNumbers = 0;
        
        
        System.out.println("Give numbers:");
        
        
        while(true){
            
            number = scanner.nextInt();
            
            if(number == breakPoint){
                System.out.println("Thx! Bye!");
                break;
            }
            
            if(number % 2 == 0){
                evenNumbers++;
            }else{
                oddNumbers++;
            }
            
            positiveNumbers++;
            sum += number;
        }
        
        
        double average = (double) sum / positiveNumbers;
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + positiveNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
        

    }
}
