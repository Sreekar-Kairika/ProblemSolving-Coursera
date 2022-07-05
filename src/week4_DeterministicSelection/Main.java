package week4_DeterministicSelection;

public class Main{

    public static void main(String[] args){

        int[] arr = {1,3,4,2,7,5,8,9};
        int index = 1;

        DeterministicSelection ob = new DeterministicSelection();
        int ans = ob.deterministicSelection(arr,0,arr.length-1,index);
        System.out.println(ans);
    }

}
