/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * the contractor child class
 */ 
package com.mycompany.EmployeeTest2;  

public class Contractor extends EmployeeTest2 {
     
    private double WeeklyPay; 
    public Contractor(String name, String SSN, double WeeklyPay){
        super(name,SSN); 
        this.WeeklyPay = WeeklyPay; 
    }  
    
    
    @Override
    public double CalculatePay(){ 
        return WeeklyPay;
    }
    @Override 
    public void displayDetails(){ 
        System.out.println("Name:" + name); 
        System.out.println("Social Security Number" + SSN); 
        System.out.println("Weekly pay" + WeeklyPay); 
    }
}
