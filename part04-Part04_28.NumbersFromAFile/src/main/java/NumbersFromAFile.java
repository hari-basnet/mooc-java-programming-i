
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        ArrayList<Integer> numList = new ArrayList<>();
        
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            
            while(fileScanner.hasNextLine()){
                int number = Integer.valueOf(fileScanner.nextLine());
                if(number >= lowerBound && number <= upperBound){
                    numList.add(number);
                }
            }
            
            System.out.println("Numbers: " + numList.size());
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        

    }

}
