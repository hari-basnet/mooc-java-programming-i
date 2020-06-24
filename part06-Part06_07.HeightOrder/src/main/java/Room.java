
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
public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        if(this.persons.isEmpty()){
            return true;
        }
        
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        
        if(this.persons.isEmpty()){
            return null;
        }
        
        Person shortestPerson = this.persons.get(0);
        
        for(int i = 0; i < this.persons.size(); i++){
            if(this.persons.get(i).getHeight() < shortestPerson.getHeight()){
                shortestPerson = this.persons.get(i);
            }
        }
        
        return shortestPerson;
    }
    
    public Person take(){
         if(this.persons.isEmpty()){
            return null;
        }
        
        Person shortestPerson = this.persons.get(0);
        int flaggedPersonIndex = 0;
        
        for(int i = 0; i < this.persons.size(); i++){
            if(this.persons.get(i).getHeight() < shortestPerson.getHeight()){
                shortestPerson = this.persons.get(i);
                flaggedPersonIndex = i;
            }
        }
        
        Person removedPerson = this.persons.remove(flaggedPersonIndex);
        System.out.println(removedPerson);
        
        return removedPerson;
    }
}
