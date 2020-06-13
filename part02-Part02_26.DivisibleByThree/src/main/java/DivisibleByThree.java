
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter begining of range");
        int beginning = scanner.nextInt();
        System.out.println("Enter end of range");
        int end = scanner.nextInt();
        divisibleByThreeInRange(beginning, end);
    }
    
    public static void divisibleByThreeInRange(int beginning, int end){
        
        for(int i = beginning; i <= end; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }

}
