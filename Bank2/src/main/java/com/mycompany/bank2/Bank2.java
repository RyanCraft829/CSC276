/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bank2;

/**
 *
 * this is where the bankAccount class will be initialized 
 * set account numbers to be 100 and 200 and the balance to be 1000, 1500
 */ 
import java.util.Scanner; 
public class Bank2 {
//this is the bank driver class 
    public static void main(String[] args) { 
        final int duration1 = 2; 
        final double interest1 = 0.03; 
        Scanner nx = new Scanner(System.in); 
        System.out.println("Hello World!"); 
        //this scanner object will take in the balance of the user's bank account 
        
        //lets ask the user to input information pertaining to their bank account 
        System.out.println("Please enter in your Bank Account number"); 
        int UserAccountNum = nx.nextInt(); 
        //now for their balance
        System.out.println("Please enter in your balance in your bank account"); 
        int UserAmount = nx.nextInt();
        //now we are going to get the users duration 
 
        //initializing the object via a constructor located in the BankAccount Class
        BankAccount User1Account = new BankAccount(UserAccountNum,UserAmount); 
        
        //now its time to inquire about user 2's account information 
        System.out.println("Please enter in user 2's account number"); 
        int User2AccountNum = nx.nextInt(); 
        System.out.println("Pleaseenter in user 2's account balance ");
        int User2Amount = nx.nextInt(); 
        
        //creating another user object using the constructor created in the BankAccount Class
        BankAccount User2Account = new BankAccount(User2AccountNum,User2Amount); 
        
        
        User1Account.AddFunds(300); 
        User2Account.SubtractFunds(400);
        User1Account.DisplayAccount();  
        User2Account.DisplayAccount(); 
        
        //call the conversion method
        System.out.println("Please enter in the amount of currency needed to be exchanged"); 
        double Amount1 = nx.nextDouble(); 
        System.out.println("Please enter in the rate of currency exchange"); //the rate of exchange between 
        //franks is 1.18 
        double Rate1 = nx.nextDouble(); 
        
        System.out.println("Please enter in another amount of currency need to be exchanged"); 
        double Amount2 = nx.nextDouble(); 
        System.out.println("Please enter in the currency's exchange rate"); 
        double rate2 = nx.nextDouble(); 
        //call the convertCurrency Method 
       System.out.println("The exchange of" + Amount1 + " is:" + User1Account.conCurrency(Amount1,Rate1));
       System.out.println(" the exchange of " + Amount2 + "is: " + User2Account.conCurrency(Amount2,rate2)); 
        
        
        //lets call User1Account to display their information  
        
        
                
        
        
        
    }
} 
