/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmcw;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author uzuma
 */
public class Graph {

    List<Edge> G[];
    Nodes nodes = new Nodes();
    int s = 0;
    int t;
    

    public Graph() {
        int num;
        nodes.setNodes(nodes.numN);
        num = nodes.numN;
        t = nodes.getNodes() + 1;
        G = new LinkedList[num];
        for (int i = 0; i < G.length; i++) {
            G[i] = new LinkedList<Edge>();
        }
    }

    void addEdge(int u, int n, int c) {
        G[u].add(0, new Edge(n, c));
    }

    boolean isConnected(int u, int n, int num){
        for(int i = 1; i < num; i++){
            
        }
        return false;
    }

    public String toString() {
        String result = " ";
        for (int i = 0; i < G.length; i++) {
            result += i + "=>" + G[i] + "\n";
        }
        return result;

    }

}
