
import java.util.ArrayList;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<>();
        while(true){
            String input = String.valueOf(scanner.nextLine());
            if(input.equals("")){
                break;
            }
            list.add(input);
        }
        
        for(int i = 0; i < list.size(); i++){
            String temp = list.get(i);
            for(String s : temp.split(" ")){
                System.out.println(s);
            }
        }
    }
}
