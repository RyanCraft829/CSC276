/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicstoretest;

/**
 *
 * @author Tim O'Connor
 */
public class Piano extends Instrument implements Playable {   
    public Piano(String name) { 
        super(name); 
    }
    @Override
    public void Play(){ 
        System.out.println("Playing the Piano"); 
    }
}
