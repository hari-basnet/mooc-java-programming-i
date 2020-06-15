
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> ageList = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] splittedWords = input.split(",");
            ageList.add(Integer.valueOf(splittedWords[1]));
        }
        
        int oldest = ageList.get(0);
        
        for(int i : ageList){
            if(i > oldest){
                oldest = i;
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);

    }
}
