
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String nameOfFile = String.valueOf(scanner.nextLine());
        
        try(Scanner fileScanner = new Scanner(Paths.get(nameOfFile))){
            
            while(fileScanner.hasNextLine()){
                
                String line = fileScanner.nextLine();
                String[] splittedLine = line.split(",");
                
                String name = splittedLine[0];
                int years = Integer.valueOf(splittedLine[1]);
                
                System.out.println(name + ", age: " + years + " " + (years == 1 ? "year" : "years"));
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
