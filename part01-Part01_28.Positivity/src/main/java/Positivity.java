
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Enter a number");
        
        int number = scan.nextInt();
        
        if(number <= 0){
            System.out.println("The number is not positive.");
        }else {
            System.out.println("The number is positive.");
        }
    }
}
