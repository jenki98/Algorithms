/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmcw;

/**
 *
 * @author uzuma
 */
public class Edge {
    Capacity cap = new Capacity();
    int n;
    int c;
    

            
    public Edge(int n, int c){
      
        this.n = n;
        this.c = c;     
       
    }
  
    public String toString(){
        return"("+n+", "+c+")";
    }
    

}
