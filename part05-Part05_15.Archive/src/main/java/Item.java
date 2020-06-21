/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class Item {
    
    private String name;
    private String identifier;

    public Item(String identifier, String name) {
        this.name = name;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }
    
    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Item)){
            return false;
        }
        
        Item cpArchive = (Item) compared;
        
        return this.identifier.equals(cpArchive.identifier);
    }
    
    
    @Override
    public String toString(){
        return this.identifier + ": " + this.name;
    }
}
