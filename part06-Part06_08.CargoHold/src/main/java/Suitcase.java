
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
public class Suitcase {
    
    private ArrayList<Item> items;
    private int maximumWeight;
    
    public Suitcase(int maximumWeight){
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public void addItem(Item item){
        
        
        
        if(getTotalWeight() + item.getWeight() <= this.maximumWeight){
            this.items.add(item);
        }
    }
    
    public String toString(){
        
        String numberOfItemSection = this.items.isEmpty() ? "no" : String.valueOf(this.items.size());
        String itemWordSection = this.items.size() == 1 ? " item " : " items ";
        String weightSection = this.items.isEmpty() ? "0" : String.valueOf(getTotalWeight());
        
        return numberOfItemSection +  itemWordSection  + "(" + weightSection + " kg)";
    }
    
    private int getTotalWeight(){
        int totalWeight = 0;
        
        for(Item i : items){
            totalWeight += i.getWeight();
        }
        
        return totalWeight;
    }
}
