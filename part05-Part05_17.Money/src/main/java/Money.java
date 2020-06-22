
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
    Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
    
    // return the new Money object
    return newMoney;
    }
    
    public boolean lessThan(Money compared){
        
        if(this.euros == compared.euros()){
            if(this.cents < compared.cents()){
                return true;
            }else{
                return false;
            }
            
        }
        
        if(this.euros < compared.euros()){
            return true;
        }
        
        return false;
    }
    
    public Money minus(Money decreaser){
        if(this.lessThan(decreaser)){
            return new Money(0,0);
        }
        
        int totalCents = this.euros * 100 + this.cents;
        int decreaserTotalCents = decreaser.euros() * 100 + decreaser.cents();
        
        
        return new Money(0, totalCents - decreaserTotalCents);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
