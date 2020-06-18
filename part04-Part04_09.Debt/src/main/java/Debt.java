/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class Debt {
    
    private double balance;
    private double interestRate;
    
    
    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    
    public void printBalance(){
        System.out.println(String.format("%.2f", this.balance));
    }
    public void waitOneYear(){
        
        double currentBalance = this.balance * this.interestRate;
        this.balance = currentBalance;
    }
}
