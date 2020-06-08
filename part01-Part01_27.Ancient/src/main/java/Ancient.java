
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Enter a number");
        
        int number = scan.nextInt();
        
        if(number < 2015 && number > 0){
            System.out.println("Ancient history!");
        }else {
            System.out.println("Try again!!!");
        }
    }
}
