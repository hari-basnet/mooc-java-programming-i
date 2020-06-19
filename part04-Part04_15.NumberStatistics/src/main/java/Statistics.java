
public class Statistics {
    
    private int count;
    private int sum;
    
    public Statistics(){
        this.count = 0;
        this.sum = 0;
    }
    
    public void addNumber(int number) {
        // write code here
        this.sum = this.sum + number;
        this.count += 1;
    }

    public int getCount() {
        // write code here
        return this.count;
    }
    
    public int sum(){
        return this.sum;
    }
    
    public double average(){
        double average;
        if(this.count > 0){
             average = (1.0 * this.sum) / this.count;    
        }else {
            average = 0.0;
        }
        return average;
    }
    
}
