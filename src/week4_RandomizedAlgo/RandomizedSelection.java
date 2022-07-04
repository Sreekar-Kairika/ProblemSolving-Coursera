package week4_RandomizedAlgo;

import java.util.Random;

public class RandomizedSelection {


    //swap utility function
     void swapNumbers(int[] array, int i, int j) {
        if(i!=j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    //calculates the random number between low & high
    int randomPivot(int low, int high) {
        Random rand = new Random();
        int diff = high - low + 1;
        int random_number = rand.nextInt(diff);
        return random_number + low;
    }

    // places Pivot element in the correct index
    int partition(int[] array, int low, int high) {

        // swap last index number and pivot
        int pivot = randomPivot(low, high);
        swapNumbers(array, high, pivot);

        pivot = array[high];

        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {
            if (array[j] < pivot)
            {
                i++;
                swapNumbers(array, i, j);
            }
        }
        swapNumbers(array, i + 1, high);
        return (i + 1);

    }

    //recursive Random Selection is applied on one side based on condition
    int randomSelection(int[] arr,int low,int high, int index){
        if(low<=high) {
            int piv_index = partition(arr, low, high);
            if(piv_index == index) {
                return arr[piv_index];
            }
            else if(index < piv_index) {
                return randomSelection(arr, low, piv_index - 1, index);
            }
            return randomSelection(arr,piv_index+1,high, index);
        }
        return -1;
    }

}

