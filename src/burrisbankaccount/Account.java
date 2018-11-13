/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burrisbankaccount;

/**
 *
 * @author gavinburris
 */
public class Account {
    private double accountBalance;
    
    Account(double iB) {
        if (iB >= 0.00) {
            this.accountBalance = iB;
        } else {
            System.out.println("You cannot set an initial balance of $" + iB);
        }
    }
    
    public boolean debit(double debitAmount) {
        if (this.accountBalance - debitAmount <= 0) {
            System.out.println("Insuffcient Funds");
            return false;
        } else {
            this.accountBalance -= debitAmount;
            return true;
        }
    }
    
    public void credit(double creditAmount) {
        if (creditAmount <= 0) {
            System.out.println("You cannot credit a balance of $" + creditAmount);
        } else {
            this.accountBalance += creditAmount;
        }
    }
    
    public double getBalance() {
        return this.accountBalance;
    }
    
    public void setBalance(double balance) {
        this.accountBalance = balance;
    }
}
