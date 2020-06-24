
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        
        
        String element = "";
        String printout = "";
        
        if(this.elements.isEmpty()){
            return "The collection " + this.name +  " is empty.";
        }else{
        
        printout =  "The collection " + this.name + " has " + this.elements.size() + (this.elements.size() == 1 ? " element:" : " elements:") + "\n";
        
        for(int i = 0; i < this.elements.size(); i++){
            
            if(i == this.elements.size() -1){
                element = element + this.elements.get(i);
            }else{
                element = element + this.elements.get(i) + "\n";
            }
        }
        }
        return printout + element;
    }
}
