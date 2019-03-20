/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmcw;

import java.util.Random;

/**
 *
 * @author uzuma
 */
public class Capacity {
    int c;
    Random rand = new Random();
    
    public Capacity(){
       c = 0;
    }
    
    public void setCapacity(int c){
        c = rand.nextInt((20 - 5) + 1) + 5;    
        this.c = c;
    }
    
    public int getCapacity(){
        return c;
    }
}
