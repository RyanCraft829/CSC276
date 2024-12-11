/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.musicstoretest;

/**
 *
 * Homework 6th 
 * Demonstrating Polymorphism and the use of interfaces in Java 
 * Due December 10th at 11:59 PM 
 * Ryan O'Connor 
 * 
 */ 

//this is my driver or "main"  class  
import java.util.ArrayList; 
public class MusicStoreTest { 


public static void Showcase(Instrument instrument){ 
        if(instrument instanceof Playable){ 
            ((Playable)instrument).Play(); 
            
        } 
        else { 
            System.out.println("This is instrument is unplayable"); 
        }
        
    }

    public static void main(String[] args) {
        System.out.println("Hello World!"); 
        Instrument instrument1 = new Guitar1("Guitar");  
        Instrument instrument2 = new Piano("Piano"); 
        Instrument instrument3 = new Drums("Drums"); 
        Instrument instrument4 = new Violin("Violin"); 
        //Guitar1 guitar = new Guitar1(); 
        //Piano piano = new Piano(); 
        //Drums drums = new Drums();   
       //Showcase(instrument2);  
        ArrayList <Instrument> instruments = new ArrayList<>();  
        instruments.add(new Guitar1("Guitar"));  
        instruments.add(new Piano("Piano")); 
        instruments.add(new Drums("Drums")); 
        for(Instrument x: instruments){ 
            Showcase(x); 
        }
         
  
        
    }
}