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
public class FlowNetwork {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
            Random rand = new Random();
        Nodes n = new Nodes();
        Capacity c = new Capacity();
        int cap = 0;
      
        Graph g = new Graph();
        c.setCapacity(c.c);
        cap = c.getCapacity();
        g.addEdge(g.s, 2, cap);
        c.setCapacity(c.c);
        cap = c.getCapacity();
        g.addEdge(g.s, 1, cap);

       // System.out.println(g);//
      
       int u = 3;
        for(int i = 1; i < g.G.length; i++){
             int ranNum = rand.nextInt((g.G.length - 1) + 1)+1;      //so far adds random connections plus the source
            c.setCapacity(c.c);
            cap = c.getCapacity();
            int j = i+1;
            g.addEdge(i, ranNum , cap);
        }
        System.out.println(g);
    }
    

}
