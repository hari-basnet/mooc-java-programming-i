
import java.nio.file.Paths;
import java.util.ArrayList;
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
    private ArrayList<Recipe> recipes;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.recipes = new ArrayList<>();
        this.scanner = scanner;
    }
    
    public void start(){
        System.out.println("File to read: ");
        String filename = String.valueOf(scanner.nextLine());
        
        readFile(filename);
        
        printCommands();
        
        while(true){
            System.out.println("Enter Command: ");
            String command = scanner.nextLine();
            if(command.equals("")){
                break;
            }
            processCommand(command);
        }

    }
    
    public void readFile(String filename) {
        
        try(Scanner fileScanner = new Scanner(Paths.get(filename))){
            
            String name = "";
            int time = -1;
            ArrayList<String> ingredients = new ArrayList<>();

            while(true){

                if(!fileScanner.hasNextLine()){
                        break;
                }
                
                String line = fileScanner.nextLine();

                if(line.equals("")){
                    continue;
                }else {
                        for(int i = 0; fileScanner.hasNextLine(); i++){
                                System.out.print(i);
                                if(line.equals("")){
                                        break;
                                }
                                if(i == 0){
                                        name = String.valueOf(line);
                                        line = fileScanner.nextLine();
                                }else if(i == 1){
                                        time = Integer.valueOf(line);
                                        line = fileScanner.nextLine();
                                }else{
                                        ingredients.add(line);
                                        line = fileScanner.nextLine();
                                }
                        }
                    this.recipes.add(new Recipe(name, time, ingredients));

                }
            }


        }catch(Exception e){
                System.out.println(e.getMessage());
        }
    }
    
    

    private void processCommand(String command) {
        switch(command){
            case "list":
                listRecipes();
                break;
            case "find name":
                System.out.println("Searched word: ");
                String word = scanner.nextLine();
                findReceipeByName(word);               
                break;
            case "find cooking time":
                System.out.println("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                findReceipeByCookingTime(time);
                break;
            case "find ingredient":
                System.out.println("Ingredient: ");
                String ingredient = String.valueOf(scanner.nextLine());
                findRecipeByIngredient(ingredient);
                break;
            case "stop":
                break;
            default:
                System.out.println("Unknown command!!!");
        }
    }

    private void listRecipes() {
        
        System.out.println("Recipes: ");
        for(Recipe r : recipes){
            System.out.println(r.printRecipe());
        }
        System.out.println("");
    }
    
    private void findReceipeByName(String name){
        for(Recipe r : recipes){
            if(r.getName().contains(name)){
                System.out.println(r.printRecipe());
            }
        }
    }

    private void findReceipeByCookingTime(int maxTime) {
        for(Recipe r : recipes){
            if(r.getCookingTime() <= maxTime){
                System.out.println(r.printRecipe());
            }
        }
    }
    
    private void findRecipeByIngredient(String ingredient){
        for(Recipe r : recipes){
            if(r.hasIngredient(ingredient)){
                System.out.println(r.printRecipe());
            }
        }
    }
    
    public static void printCommands(){
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }

}

