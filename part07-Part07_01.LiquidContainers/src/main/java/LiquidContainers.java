
import java.util.Scanner;

public  class LiquidContainers {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            String[] inputBreak = input.split(" ");
            String command = inputBreak[0];
            int amount = Integer.valueOf(inputBreak[1]);
            
            if (input.equals("quit")) {
                break;
            }
            
            switch(command){
            case "add":
                if(first + amount <= 100){
                    first += amount;
                }else{
                    first = first + (100 - first);
                }
                break;
            case "move":
                int amountToBeMoved = first - amount;
                if(amountToBeMoved < 0){
                    amountToBeMoved = first;
                    second += amountToBeMoved;
                }else {
                    second += amountToBeMoved;
                }
        
                if(amountToBeMoved + second > 100 ){
                    second = second + (100 - second);
                }else {
                    second = second + amountToBeMoved;
                }
                break;
            case "remove": 
                int amountToRemove = second -amount;
                if(amountToRemove < 0){
                    second = 0;
                }else {
                    second = second - amount;
                }
                break;
            default :
                break;
            }
        }
    }

}
