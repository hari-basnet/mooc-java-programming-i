
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Enter a number");
        int number = scan.nextInt();
        
        if(number == 1984){
            System.out.println("Orwell");
        }else {
            System.out.println("Try again!!!");
        }
    }
}
