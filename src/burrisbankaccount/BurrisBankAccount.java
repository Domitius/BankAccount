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
public class BurrisBankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Account
        Account account = new Account(500);
        System.out.println(account.getBalance());
        account.credit(200);
        System.out.println(account.getBalance());
        account.debit(300);
        System.out.println(account.getBalance());
        
         System.out.println("");
        
        // Savings Account
        SavingsAccount savings = new SavingsAccount(500);
        System.out.println(savings.getBalance());
        savings.credit(300);
        System.out.println(savings.getBalance());
        savings.credit(savings.calculateInterest());
        System.out.println(savings.getBalance());
        savings.debit(300);
        System.out.println(savings.getBalance());

        System.out.println("");
        
        // Checking Account
        CheckingAccount checking = new CheckingAccount(900);
        System.out.println(checking.getBalance());
        checking.credit(300);
        System.out.println(checking.getBalance());
        checking.debit(100);
        System.out.println(checking.getBalance());



    }
    
}
