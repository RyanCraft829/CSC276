/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * this is the seasonal employee class; itself is a child class of part time employee, therefore it is a grandchild class of EmployeeTest2
 * 
 */ 
package com.mycompany.EmployeeTest2; 

public class SeasonalEmployee extends PartTimeEmployee {
     
    protected String Season; 
    private int SeasonalBonus = 200; 
    protected double TotalPay1; 
    //this string will store when the seasonal employee is employed 
    
    public SeasonalEmployee(String Name, String SSN, int HoursWorked, double HourlyRate,String Season){ 
        super(Name,SSN,HoursWorked,HourlyRate); 
        this.Season = Season; 
    }
    public double CalculatePay(int HoursWorked, double HourlyRate, int SeasonalBonus){ 
        TotalPay1 = HoursWorked*HourlyRate+SeasonalBonus;
        return TotalPay1; 
     
    }   
    
    @Override
    public void displayDetails(){ 
        System.out.println("Name:"+name+ "(Part time Employee)"); 
        System.out.println("Hourly Wage" + HourlyRate);
        System.out.println("Hours worked" + HoursWorked); 
        System.out.println("Pay"+ totalPay); 
        System.out.println("Season worked" + Season); 
    } 
    //basically the same method but with the added season information
}
