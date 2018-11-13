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
public class CheckingAccount extends Account {
    public final static double fee = 2;
    
    CheckingAccount(double iB) {
        super(iB);
    }
    
    @Override public boolean debit(double debitAmount) {
        if (super.debit(debitAmount) == true) {
            double newVal = super.getBalance() - fee;
            super.setBalance(newVal);
            return true;
        }
        return false;
    }
}
