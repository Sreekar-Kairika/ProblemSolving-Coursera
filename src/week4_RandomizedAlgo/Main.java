package week4_RandomizedAlgo;

public class Main {
    public static void main(String[] args){

        int[] arr = {1,3,5,6,7,9};
        int order = 4;

        RandomizedSelection ob = new RandomizedSelection();

        System.out.print("Element which is at " + order + " index is ");
        System.out.println(ob.randomSelection(arr,0,arr.length-1,order));

    }

}
