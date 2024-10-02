/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank2;


 /* 

Homework 2 due october 2nd at 11:59 pm 
written by Ryan O'Connor  

This is a sub file for the main bank class, this file will contain most of the infor-
mation needed for the bank2 class
*/
public class BankAccount {
    final double INTREST_RATE = 0.03;  
   private int AccountNum, AccountBalance,Duration; 
   private double interest;  
   private int addFunds;
   //this is a constructor function in my java program
   public BankAccount(int theAccountNum, int theAccountBalance){ 
       AccountNum = theAccountNum; 
       AccountBalance = theAccountBalance;  
   } 
   
   //lets declare some methods 
   //lets start with the set and get functions 
   public int getAccountNumber(){ 
       return AccountNum; 
   } 
   public int getDuration() { 
       return Duration; 
   } 
   public double getAccountBalance() { 
       return AccountBalance; 
   }
   public double getIntrest(){ 
       return interest; 
   }
   //lets set up or setter methods 
  public void setAccountNumber(int theAccountNumber){ 
      theAccountNumber = AccountNum;
        
  } 
  public void setDuration(int theDuration){
   theDuration = Duration;  
  } 
  public void setAccountBalance(double theAccountBalance){ 
      theAccountBalance = AccountBalance; 
  }
  public void AddFunds(int AddFunds){ 
     AccountBalance+=AddFunds; 
  } 
  public void SubtractFunds(int SubFunds){ 
      AccountBalance-=SubFunds;
  }
  public void setInterest(double theIntrest){ 
      theIntrest = interest; 
  }  
  //now we need to add the method that will display our bank account information 
  public void DisplayAccount() { 
      System.out.println("The account has a balance of:\n"+ AccountBalance);
      System.out.println("The Account number is\n " + AccountNum); 
  }  
  public static double conCurrency(double rate, double amount){ 
      return rate*amount; 
  } 
  //lets implement the calcIntrest method 
  public void calcInterest(){ 
      interest = AccountBalance * INTREST_RATE*Duration;
  }
  
  
}
