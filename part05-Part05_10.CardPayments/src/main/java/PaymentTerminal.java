
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment >= 2.50){
            double change = payment - 2.50;
            this.money = this.money + (payment - change);
            this.affordableMeals++;
            return change;
        }else{
            return payment;
        }
    }
    
    public boolean eatAffordably(PaymentCard card){
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if(card.balance() >= 2.50){
            card.takeMoney(2.50);
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment >= 4.30){
            double change = payment - 4.30;
            this.money = this.money + (payment - change);
            this.heartyMeals++;
            return change;
        }else{
            return payment;
        }
    }
    
    public boolean eatHeartily(PaymentCard card){
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if(card.balance() >= 4.30){
            card.takeMoney(4.30);
            this.heartyMeals++;
            return true;
        }
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        // if someone doesnot have money in the card and wants to top up the card
        // the person gives cash to top up hence cash is added to register 
        // and the card is topped up
        if(sum > 0){
            card.addMoney(sum);
            this.money = this.money + sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
