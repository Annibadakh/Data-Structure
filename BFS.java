import java.io.*;
import java.util.*;

class BFS
{
    private int V;                              
    private LinkedList<Integer> adj[];              
    private Queue<Integer> queue;                   
 
    BFS(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++)
        {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }
 
    void addEdge(int v,int w)
    {
        adj[v].add(w);                         
    }
 
    void BF(int n)
    {

        boolean nodes[] = new boolean[V];     
        int a = 0;
 
        nodes[n]=true;                  
        queue.add(n);                  
 
        while (queue.size() != 0)
        {
            n = queue.poll();             
            System.out.print(n+" ");           
            for (int i = 0; i < adj[n].size(); i++)  
            {
                a = adj[n].get(i);
                if (!nodes[a])                    
                {
                    nodes[a] = true;
                    queue.add(a);
                }
            }  
        }
    }

    public static void main(String args[])
    {
        BFS bf = new BFS(6);
 
        bf.addEdge(0,1);
        bf.addEdge(1,0);
        bf.addEdge(0,2);
        bf.addEdge(2,0);
        bf.addEdge(0,3);
        bf.addEdge(3,0);
        bf.addEdge(1,3);
        bf.addEdge(3,1);
        bf.addEdge(2,3);
        bf.addEdge(3,2);
        
 
        System.out.println("The Breadth First Traversal of the graph is as follows :");
 
        bf.BF(0);
    }
}