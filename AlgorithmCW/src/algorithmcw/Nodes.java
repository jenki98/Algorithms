/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmcw;
import java.util.Random;


public class Nodes {
    int numN;
     Random rand = new Random();
    public Nodes(){
        this. numN = numN;
    }
    
    public void setNodes(int numN){
        numN = rand.nextInt((10 - 4) + 1) + 4;
       this.numN = numN;
    }
    
    public int getNodes(){
     return numN;
    }

  

    
}
