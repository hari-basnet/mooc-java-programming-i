
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment verrattava){
        if(this.squares > verrattava.squares){
            return true;
        }
        
        return false;
    }
    
    public int priceDifference(Apartment verrattava){
        return Math.abs(this.pricePerSquare * this.squares -verrattava.pricePerSquare * verrattava.squares);            
    }
    
    public boolean moreExpensiveThan(Apartment verrattava){
        if(this.pricePerSquare > verrattava.pricePerSquare){
            return true;
        }
        return false;
    }
}
