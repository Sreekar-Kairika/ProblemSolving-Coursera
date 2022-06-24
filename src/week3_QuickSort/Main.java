package week3_QuickSort;



public class Main {
    public static void main(String[] args)
    {
        int[] arr = { 6, 7, 2, 9, 1, 5 };
        int n = arr.length;

        QuickSort sort = new QuickSort();

        System.out.println("Before Sorting ");
        sort.printArray(arr, n);

        sort.quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        sort.printArray(arr, n);
    }
}

