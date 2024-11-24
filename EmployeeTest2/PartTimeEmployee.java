/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Part time employee child class 
 * 
 */ 

package com.mycompany.EmployeeTest2; 
public class PartTimeEmployee extends EmployeeTest2 {
   
    
    protected int HoursWorked; 
    protected double HourlyRate;
    protected double totalPay;
    public PartTimeEmployee(String Name, String SSN,int HoursWorked,double HourlyRate){  
        super(Name,SSN);
        this.HoursWorked = HoursWorked; 
        this.HourlyRate = HourlyRate;
                
    }  
    
    @Override
    public void displayDetails(){ 
        System.out.println("Name:"+name+ "(Part time Employee)"); 
        System.out.println("Hourly Wage" + HourlyRate);
        System.out.println("Hours worked" + HoursWorked); 
        System.out.println("Pay"+ totalPay); 
    }
     
    
    @Override
    public double CalculatePay(){ 
        
        totalPay = HoursWorked*HourlyRate;
        return totalPay;
    }  

}
