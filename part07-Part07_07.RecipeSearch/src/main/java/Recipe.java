
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
    public String printRecipe(){
        return this.name + ", " + "cooking time: " + this.cookingTime;
    }
    
    public void addIngredients(String item){
        if(!item.equals("")){
            this.ingredients.add(item);
        }
    }
    
    public boolean hasIngredient(String ingredient){
        return this.ingredients.contains(ingredient);
    }
    
}
