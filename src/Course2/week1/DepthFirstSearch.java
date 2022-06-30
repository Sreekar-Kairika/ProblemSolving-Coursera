package Course2.week1;

import java.util.ArrayList;

public class DepthFirstSearch {

    static void DFSRec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited){

        visited[s]=true;
        System.out.print(s+" ");

        for(int u:adj.get(s)){
            if(visited[u] == false){
                DFSRec(adj,u,visited);
            }
        }
    }

    static void DFS(ArrayList<ArrayList<Integer>> adj,int V,int s){

        boolean[] visited = new boolean[V];
        DFSRec(adj,s,visited);

    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for(int i=0;i< adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    static void addedge(ArrayList<ArrayList<Integer>> adj,int u ,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args){
        int V=5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }

        addedge(adj,0,1);
        addedge(adj,0,2);
        addedge(adj,1,2);
        addedge(adj,1,3);


        printGraph(adj);

        System.out.println("The Depth First Search of Graph is ");
        DFS(adj,V,0);
    }
}
