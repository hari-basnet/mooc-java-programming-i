
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the gift amount: ");
        int giftAmount = scan.nextInt();
        double giftTax = 0;
        if(giftAmount >= 5000 && giftAmount < 25000){
            giftTax = 100 + ((giftAmount - 5000) * 0.08);
            System.out.println("Tax: " + giftTax);
        }else if(giftAmount >= 25000 && giftAmount < 55000){
            giftTax = 1700 +  ((giftAmount - 25000) * 0.10);
            System.out.println("Tax: " + giftTax);
        }else if(giftAmount >= 55000 && giftAmount < 200000){
            giftTax = 4700 +  ((giftAmount - 55000) * 0.12);
            System.out.println("Tax: " + giftTax);
        }else if(giftAmount >= 200000 && giftAmount < 1000000){
            giftTax = 22100 +  ((giftAmount - 200000) * 0.15);
            System.out.println("Tax: " + giftTax);
        }else if(giftAmount >= 1000000){
            giftTax = 142100 +  ((giftAmount - 1000000) * 0.17);
            System.out.println("Tax: " + giftTax);
        }else if(giftAmount < 5000){
            System.out.println("No tax");
        }else {
            System.out.println("Something went wrong");
        }
        

    }
}
