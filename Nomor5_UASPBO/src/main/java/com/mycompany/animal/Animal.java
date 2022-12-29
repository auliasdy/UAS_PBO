/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.animal;

/**
 *
 * @author aulia
 */
public abstract  class Animal {
    
    protected int legs;
    protected Animal(int legs){
        this.legs = legs;
    }
    public void walk(){
        System.out.println("This Animal walk by "+legs+"legs." );
    }
    public abstract void eat();
}