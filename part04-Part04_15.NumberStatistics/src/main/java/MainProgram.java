
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        int userInput;
        int sumOfEven = 0;
        int sumOfOdd = 0;
        System.out.println("Enter numbers");
        
        Statistics statistics = new Statistics();
        Statistics evenStat = new Statistics();
        Statistics oddStat = new Statistics();
        
        while(true){
            userInput = Integer.valueOf(scanner.nextLine());
            
            if(userInput == -1){
                break;
            }
            if(userInput % 2 == 0){
                evenStat.addNumber(userInput);
            }else {
                oddStat.addNumber(userInput);
            }
            statistics.addNumber(userInput);
        }
        
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evenStat.sum());
        System.out.println("Sum ofodd numbers: " + oddStat.sum());
    }
}
