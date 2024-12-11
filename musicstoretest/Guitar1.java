/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicstoretest;

/**
 *
 * @author Tim O'Connor
 */
public class Guitar1 extends Instrument implements Playable {  
    public Guitar1(String name){ 
        super(name); 
    }
    @Override
    public void Play() { 
        System.out.println("Strumming the Guitar");
    }
}
