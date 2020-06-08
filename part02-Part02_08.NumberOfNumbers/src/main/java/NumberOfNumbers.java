
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            System.out.println("Give a number: ");

            if(userInput == 0){
                break;
            }
            
            if(scanner.hasNextInt()){
                count += 1;
                continue;
            }
            
        }
        
        System.out.println("Number of numbers: " + count);

    }
}
