
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    
    public void addMeal(String meal){
        if(!meal.isEmpty() && !meals.contains(meal)){
            this.meals.add(meal);
        }
    }
    
    public void printMeals(){
        if(this.meals.size() > 0){
            for(int i = 0; i < meals.size(); i++){
                System.out.println(meals.get(i));
            }
        }
    }
    
    public void clearMenu(){
        if(this.meals.size() > 0){
            this.meals.clear();
        }
    }
}
