/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Full time employee 
 */
package com.mycompany.EmployeeTest2; 

public class FullTimeEmployee extends EmployeeTest2 {
    
    //lets suppose the full time employee is salaried and recieves $3,000 
    private double FixedMonthlySalary = 3000.00; 
    
    public FullTimeEmployee(String Name, String SSN){ 
        super(Name,SSN); 
    }  
    
    @Override
    public double CalculatePay(){ 
 
        return FixedMonthlySalary; 
    }  
    
    @Override
    public void displayDetails(){  
        System.out.println("Name:" + name);
        System.out.println("Social Security Number"+ SSN); 
        System.out.println("Monthly Salary" + FixedMonthlySalary); 
    }
    
}
