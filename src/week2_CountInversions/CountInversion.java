package week2_CountInversions;

class CountInversion {

    int mergeSort(int arr[], int low, int high) {

        int count = 0;
        if (low < high) {

            int mid = (low + high)  / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += merge(arr, low, mid,high);
        }
        return count;
    }

    int  merge(int arr[], int low, int mid,int high) {

        int[] ans = new int[high-low+1];
        int count = 0;

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
                count =+ mid-i+1;
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

        return count;
    }
}