import java.io.*;
import java.util.*;
 

class Graph {
    private int V;                              
 
    private LinkedList<Integer> adj[];             
    @SuppressWarnings("uncheaked")
    public Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
	    {
          adj[i] = new LinkedList();
    	}
    } 

    void addEdge(int v, int w)
    {
        adj[v].add(w);                            
    }
    void DFS(int v)
    {
        boolean nodes[] = new boolean[V];             
        DFSUtil(v, nodes);
    }
 
    void DFSUtil(int vertex, boolean nodes[])
    {
        nodes[vertex] = true;                     
        System.out.print(vertex + " ");
        int a = 0;
 
        for (int i = 0; i < adj[vertex].size(); i++)
            {
                a = adj[vertex].get(i);
                if (!nodes[a])                    
                {
                    DFSUtil(a, nodes);
                }
            }  
    }
 
    public static void main(String args[])
    {
        Graph graph = new Graph(5);
 
        graph.addEdge(0,1);
        graph.addEdge(1,0);
        graph.addEdge(0,2);
        graph.addEdge(2,0);
        graph.addEdge(1,2);
        graph.addEdge(2,1);
        graph.addEdge(1,3);
        graph.addEdge(3,1);
        graph.addEdge(2,3);
        graph.addEdge(3,2);
 
        System.out.println("Following is Depth First Traversal: ");
 
        graph.DFS(0);
    }
}