package week1_MergeSort;

class MergeSortAlgo {


    PrintArray print = new PrintArray();
    void mergeSort(int arr[], int low, int high) {

        if (low < high) {
            int mid = (low + high)  / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid,high);
        }

    }

    void  merge(int arr[], int low, int mid,int high) {

        int[] ans = new int[high-low+1];


        int i = low;
        int j = mid+1;

        //used for traversing
        int k=0;

        while (i <= mid && j <= high) {
            if(arr[i] < arr[j]) {
                ans[k] = arr[i];
                i++;
                k++;
            } else {
                ans[k] = arr[j];
                j++;
                k++;
            }

        }

        while (i <= mid) {
            ans[k] = arr[i];
            i++;
            k++;
        }

        while (j <= high) {
            ans[k] = arr[j];
            j++;
            k++;
        }

        int q=0;
        for(int p=low;p<=high;p++)
                arr[p]=ans[q++];

    }

}