
public class HealthStation {

    private int noOfWeightTaken;

    public HealthStation() {
        this.noOfWeightTaken = 0;
    }
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.noOfWeightTaken = this.noOfWeightTaken + 1;
        return person.getWeight();
    }
    
    public void feed(Person person){
        if(person.getWeight() > 0){
            person.setWeight(person.getWeight() + 1);
        }
    }
    
    public int weighings(){
        return this.noOfWeightTaken;
    }

}
