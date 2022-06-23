package week2_CountInversions;

public class Main {

    public static void main(String[] args){

        int arr[] = {8, 4, 2, 1};

        //User Input
//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Array Size : ");
//        n = sc.nextInt();
//        int[] arr = new int[n];
//
//        System.out.println("Enter Array Elements");
//        for(int i=0; i<n; i++)
//        {
//            arr[i]=sc.nextInt();
//        }

        CountInversion ob = new CountInversion();
        PrintArray print = new PrintArray();
        System.out.println("Before sorting the array:");
        print.printArray(arr);

       int ans = ob.mergeSort(arr, 0, arr.length-1);

        System.out.println("Sorted array:");
        print.printArray(arr);

        System.out.println("Inversions : "+ans);
        System.out.println();

    }
}
