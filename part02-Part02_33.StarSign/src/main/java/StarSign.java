
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        for(int i = 0; i < size; i++){
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        for(int i = 0; i < height; i++){
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int star = 1;
        
        for(int i = size; i >= 1; i--){
            for(int space = i -1; space >= 1; space--){
                System.out.print(" ");
            }
            
            for(int j = 1; j <= star; j++){
                System.out.print("*");
                
            }
            System.out.println();
            star+=1;
        }
        
    }
}
