package week1_MergeSort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

//        int arr[] = { 3, 5, 6, 1, 9, 2, 7,8};

        //User Input
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Array Elements");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        MergeSortAlgo ob = new MergeSortAlgo();
        PrintArray print = new PrintArray();
        System.out.println("Before sorting the array:");
        print.printArray(arr);

        ob.mergeSort(arr, 0, arr.length-1);

        System.out.println("Sorted array:");
        print.printArray(arr);




    }
}
