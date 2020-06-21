/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double initialBalance){
        this.balance = initialBalance;
    }
    
    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably() {
        // write code here
        if(this.balance > 2.59){
            this.balance = this.balance - 2.60;
        }else {
            this.balance = this.balance;
        }
    }

    public void eatHeartily() {
        // write code here
        if(this.balance > 4.59){
            this.balance = this.balance - 4.60;
        }else {
            this.balance = this.balance;
        }
    }
    
    public void addMoney(double amount) {
        // write code here
        if(amount > 0){
            if(this.balance + amount < 150.1){
                this.balance = this.balance + amount;
            }else{
                this.balance = this.balance + (amount -(150.0 - this.balance ));
            } 
        }
    }
    
}
