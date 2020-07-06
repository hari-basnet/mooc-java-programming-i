
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class UserInterface {
    private Scanner scanner;
    private Statistics statistics;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.statistics = new Statistics();
    }
    
    public void start(){
        
        
        while(true){
            System.out.println("Enter points totals, -1 stops: ");
            
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            
            statistics.addPoints(input);
            
        }
        String averagePrint = statistics.passingAverage() == 0 ? "-" : String.valueOf(statistics.passingAverage());
        System.out.println("Point average (all): " + statistics.calculateAverage(statistics.getPoints()));
        System.out.println("Point average (passing): " + averagePrint);
        System.out.println("Pass percentage: " + statistics.passPercentage());
    }
    
    
}
