package Course2.week1;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    static void BFS(ArrayList<ArrayList<Integer>> adj,int v , int s){

        boolean[] visited = new boolean[v+1];

        Queue<Integer> q = new LinkedList<Integer>();

        visited[s] = true;
        q.add(s);

        while(q.isEmpty() == false){
            int u = q.poll();
            System.out.print(u+" ");
            for(int x:adj.get(u)){
                if(visited[x] == false){
                    visited[x]=true;
                    q.add(x);
                }
            }
        }
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

        System.out.println("The Breadth First Search of Graph is ");
        BFS(adj,V,3);
    }



}
