
public class Smallest {

    public static int smallest(int number1, int number2) {
        // Write some code here
        // don't print anything inside this method
        // there must be a return in the end of the method
        int smallNumber;
        
        if(number1 < number2){
            smallNumber = number1;
        }else {
            smallNumber = number2;
        }
        return smallNumber;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
