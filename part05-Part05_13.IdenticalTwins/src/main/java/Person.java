

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    
    @Override
    public boolean equals(Object compared){
        
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Person)){
            return false;
        }
        
        Person cp = (Person) compared;
        
        
        if(this.name.equals(cp.name) 
                && this.birthday.equals(cp.birthday) 
                && this.height == cp.height 
                && this.weight == cp.weight){
            return true;
        }
        return false;
        
    }
    
    public String toString(){
        return this.name + ", " + this.birthday + ", " + this.height + ", " + this.weight;
    }
}
