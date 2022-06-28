package week4_RandomizedAlgo;

public class Main {
    public static void main(String[] args){

        int[] arr = {1,3,5,6,7,9};
        int order = 2;
        RandomizedSelection ob = new RandomizedSelection();

        System.out.println(ob.randomSelection(arr,0,arr.length-1,order));

    }

}
