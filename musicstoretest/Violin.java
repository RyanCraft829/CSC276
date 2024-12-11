/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicstoretest;

/**
 *
 * this is the violin class. 
 * It will not implement the interface playable
 */
public class Violin extends Instrument{ 
    public Violin(String name){ 
        super(name); 
    }
    
    public void Message(){ 
        System.out.println("This is a violin and does not implement the interface playable"); 
        
    }
}
