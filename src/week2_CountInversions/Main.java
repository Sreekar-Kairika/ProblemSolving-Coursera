package week2_CountInversions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

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

        CountInversion ob = new CountInversion();

        System.out.println("Before sorting the array:");
        ob.printArray(arr);

       int ans = ob.mergeSort(arr, 0, arr.length-1);

        System.out.println("Sorted array:");
        ob.printArray(arr);

        System.out.println("Inversions : "+ans);
        System.out.println();

    }
}
