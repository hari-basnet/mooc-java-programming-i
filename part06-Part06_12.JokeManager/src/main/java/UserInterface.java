
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
    private JokeManager jokemanager;

    public UserInterface(JokeManager jokemanager, Scanner scanner) {
        this.scanner = scanner;
        this.jokemanager = jokemanager;
    }

    public void start(){
        
        while(true){
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X -stop");
            
            String command = String.valueOf(scanner.nextLine());
            
            if(command.equals("X")){
                break;
            }
            
            processCommand(command);
        }
    }

    private void processCommand(String command) {
        switch (command) {
            case "1":
                add();
                break;
            case "2":
                draw();
                break;
            case "3":
                listJokes();
                break;
            default:
                System.out.println("Unknown command");
                break;
        }
        
    }

    private void add() {
        System.out.println("Write the joke to be added: ");
        String jokeToAdd = String.valueOf(this.scanner.nextLine());
        
        this.jokemanager.addJoke(jokeToAdd);
    }

    private void draw() {
        System.out.println(this.jokemanager.drawJoke());
    }

    private void listJokes() {
        this.jokemanager.printJokes();
    }
    
    
    
}
