/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicstoretest;

/**
 *
 * the Super class Instrument 
 * 
 */
public class Instrument {
    protected String name; 
    public Instrument(String name){ 
        this.name = name; 
    }  
    @Override
    public String toString() { 
        return "This musical instrument is" + name; 
        
    } 
    
    public void Play(){ 
        
    }
}
