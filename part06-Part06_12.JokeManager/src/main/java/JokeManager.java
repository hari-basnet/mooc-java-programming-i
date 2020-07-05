
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class JokeManager {
    private ArrayList<String> jokesStorage;

    public JokeManager() {
        this.jokesStorage = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokesStorage.add(joke);
    }
    
    public String drawJoke(){
        String jokeToReturn = "";
        if(this.jokesStorage.isEmpty()){
            return "Jokes are in short supply.";
        }else {
            Random random = new Random();
            int randJoke = random.nextInt(this.jokesStorage.size());
            jokeToReturn = this.jokesStorage.get(randJoke);
        }
        return jokeToReturn;
    }
    
    public void printJokes(){
        for(String joke : jokesStorage){
            System.out.println(joke);
        }
    }
    
    
    
}
