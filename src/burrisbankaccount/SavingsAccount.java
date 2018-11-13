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
public class SavingsAccount extends Account {
    public static final double interest = 0.3;
    SavingsAccount(double iB) {
        // Setting the initial balance for our Account class
        super(iB);
    }
    
    public double calculateInterest() {
        return interest * this.getBalance();
    }
}
