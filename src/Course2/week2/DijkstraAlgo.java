package Course2.week2;
import java.util.*;

import static java.lang.Integer.min;

public class DijkstraAlgo {


     public static int[] shortestPath(int graph[][], int src){

        int v = graph.length;
        int[] dist = new int[v];

        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;

        boolean fin[] = new boolean[v];

        for(int count=0;count<v-1;count++){
            int u=-1;
            for(int i=0;i<v;i++){
                if(!fin[i] && (u== -1 || dist[i]<dist[u])){
                    u=i;
                }
            }
            fin[u]=true;
            for(int i=0;i<v;i++){
                if(!fin[i] && graph[u][i]!=0)
                    dist[i] = min(dist[i],dist[u]+graph[u][i]);
            }
        }
        return dist;
    }



    public static void main(String[] args) {

        int[][] graph = {{0, 5, 10, 0},
                {5, 0, 3, 20},
                {10, 3, 0, 2},
                {0, 20, 2, 0}};

        System.out.println("The Distance from Source Vertex to Other vertex is");
        int ans[];
        ans=shortestPath(graph,0);
        for(int i:ans){
            System.out.print(i+" ");
        }

    };

}
