
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Item> items = new ArrayList<>();

        
        while(true){
            
            System.out.println("Identifier? (empty will stop)");
            String identifier = String.valueOf(scanner.nextLine());
            
            if(identifier.equals("")){
                break;
            }
            
            System.out.println("name? (empty will stop)");
            String name = String.valueOf(scanner.nextLine());
            
            if(name.equals("")){
                break;
            }
            Item item = new Item(identifier, name);
            
            if(!items.contains(item)){
                items.add(item);
            }
        }
        System.out.println("");
        System.out.println("==Items==");
        for(Item a : items){
            System.out.println(a.toString());
        }

        
    }
}
