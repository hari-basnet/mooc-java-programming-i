
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        
        int greatestNumber = 0;
        
        if(number1 > number2 && number1 > number2 && number1 > number3){
            greatestNumber = number1;
        }else if(number2 > number3 && number2 > number1){
            greatestNumber = number2;
        }else if(number3 > number1 && number3 > number2){
            greatestNumber = number3;
        }else {
            greatestNumber = number3;
        }

        return greatestNumber;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
