/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * this is where we test our code 
 * Homework 5 
 * Due November 23rd at 11:59 pm 
 * Written By Ryan O'Connor 
 * CSC-276-01 
 */  
package com.mycompany.EmployeeTest2;

import java.util.ArrayList; 
public abstract class EmployeeTest2 {
    
    protected String name; 
    protected String SSN;  
    
    //creating the ArrayList 
    //SSN is the social security number 
    
    public EmployeeTest2(String name, String SSN){ 
        this.name = name; 
        this.SSN = SSN; 
    }
    
    public  void displayDetails(){ 
        System.out.println("Name:"+name); 
        System.out.println("Social Security Number"+SSN);  
        
    }
    public abstract double CalculatePay();  
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //creating the ArrayList down here 
          ArrayList<EmployeeTest2> employees = new ArrayList<>();    
        //create my objects here
         //FullTimeEmployee Darius = new FullTimeEmployee("Darius McDonald","323456"); 
         employees.add(new FullTimeEmployee("Darius McDonald","32-87-5981"));  
         employees.add(new PartTimeEmployee("Robert Murphy","75-69-9496",25,12.75)); 
         employees.add(new  SeasonalEmployee("Cortez McIntyre","23-31-1315",25,11.00,"Christmas")); 
         employees.add(new Contractor("Steve Jiminez","40-44-8880",1200.75));
         //PartTimeEmployee Robert = new PartTimeEmployee("Robert Murphy","335732",25,12.75);
         //SeasonalEmployee Cortez = new SeasonalEmployee("Cortez McIntyre","222559",20,11.00,"Christmas");
         //Contractor Steve = new Contractor("Steve Jiminez","4000364",1200.75);  
         
         //using an enhanced for loop to iterate over the ArrayList objects 
         for(EmployeeTest2 x: employees){  
             x.displayDetails();
             System.out.println("\n\n\n");  
         } 
         
         
         //I gave cortez the season of christmas, I know that christmas isn't a season but a lot of retail stores include a christmas season 
         //that runs from early november to just after new years  day. I am going to assume he is working courtesy clerk(Bagger, cleaner,  cart pusher) during the busy holiday shopping season
    }
}
