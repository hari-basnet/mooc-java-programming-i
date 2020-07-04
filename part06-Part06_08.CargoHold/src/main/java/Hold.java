
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
public class Hold {
   
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(getTotalWeight() + suitcase.totalWeight() <= this.maximumWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    private int getTotalWeight(){
        int holdTotalWeight = 0;
        
        for(Suitcase s : suitcases){
            holdTotalWeight += s.totalWeight();
        }
        
        return holdTotalWeight;
    }
    
    public String toString(){
        
        String numberOfSuitcaseSection = this.suitcases.isEmpty() ? "no" : String.valueOf(this.suitcases.size());
        String suitcaseWordSec = this.suitcases.size() == 1 ? " suitcase " : " suitcases ";
        String weightSection = this.suitcases.isEmpty() ? "0" : String.valueOf(getTotalWeight());
        
        return numberOfSuitcaseSection + suitcaseWordSec + "(" + weightSection + "kg)";
    }
    
      public void printItems(){
        
        for(int i = 0; i < this.suitcases.size(); i++){
            Suitcase s = this.suitcases.get(i);
            s.printItems();
        }
        
    }
}
