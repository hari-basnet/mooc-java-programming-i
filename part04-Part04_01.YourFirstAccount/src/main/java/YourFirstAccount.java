
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account hariAccount = new Account("Hari's account", 100.0);
        hariAccount.deposit(20.0);
        
        System.out.println("The balance of Hari's account is " + hariAccount.toString());
    }
}
