import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        
        while(true){
            String bookName = String.valueOf(scanner.nextLine());
            if(bookName.isEmpty()){
                break;
            }
            
            int noPages = Integer.valueOf(scanner.nextLine());
            int pnlYear = Integer.valueOf(scanner.nextLine());
            
            library.add(new Book(bookName, noPages, pnlYear));
        }
        
        System.out.println("What information will be printed?");
        String info = String.valueOf(scanner.nextLine());
        
        for(Book b : library){
            if(info.equals("everything")){
                System.out.println(b);
            }else if(info.equals("name")){
                System.out.println(b.getTitle());
            }
        }
        
    }
}
