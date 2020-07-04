
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
public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start(){
        
        while(true){
            System.out.println("Command");
            
            String command = String.valueOf(this.scanner.nextLine());
            
            if(command.contains("end")){
                break;
            }
            
            processCommand(command);
        }
        
        System.out.println("Bye bye!");
    }
    
    public void processCommand(String command){
        if(command.equals("add")){
            add();
        }else if(command.equals("search")){
            search();
        }else{
            System.out.println("Unknown command");
        }
    }

    private void add() {
        System.out.println("Word: ");
        String word = String.valueOf(this.scanner.nextLine());

        System.out.println("Translation: ");
        String translation = String.valueOf(this.scanner.nextLine());

        this.simpleDictionary.add(word, translation);
    }

    private void search() {
        System.out.println("To be translated: ");
        String word = String.valueOf(this.scanner.nextLine());
        
        // I created a method isFound in simpleDictionary class but 
        // alternatively this can be done by checking 
        // this.simpleDictionary.translate(word) == null 
        if(this.simpleDictionary.isFound(word)){
            System.out.println("Translation: " + this.simpleDictionary.translate(word));
        }else{
            System.out.println("Word " + word + " was not found");
        }
    }
}
