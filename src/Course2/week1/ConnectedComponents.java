package Course2.week1;

import java.util.ArrayList;

public class ConnectedComponents {
     static void connectedComponentUtil(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited){

            visited[s]=true;
            for(int u:adj.get(s)){
                if(visited[u] == false){
                    connectedComponentUtil(adj,u,visited);
                }
            }
        }

        static int connectedComponents(ArrayList<ArrayList<Integer>> adj,int V,int s){
            int countComponents = 0;
            boolean[] visited = new boolean[V];

            for(int i=0;i<V;i++)
                visited[i]=false;

            for(int i=0;i<V;i++){
                if(visited[i]==false){
                    connectedComponentUtil(adj,i,visited);
                    countComponents++;
                }
            }
            return countComponents;
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

            int V=7;
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

            for(int i=0;i<V;i++){
                adj.add(new ArrayList<Integer>());
            }

            addedge(adj,0,1);
            addedge(adj,1,2);
            addedge(adj,3,4);
            addedge(adj,5,6);

            System.out.println("The Graph is : ");
            printGraph(adj);

            int components =  connectedComponents(adj,V,0);
            System.out.println("The no of components "+ components);
        }
}
