
public class MainProgram {

    public static int smallest(int[] array){
        int smallest = array[0];
        
        for(int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int smallestIndex = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }
    
    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
    }

}
