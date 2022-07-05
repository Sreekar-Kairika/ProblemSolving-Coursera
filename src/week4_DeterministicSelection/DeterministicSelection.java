package week4_DeterministicSelection;

public class DeterministicSelection {
    void swapNumbers(int[] array, int i, int j) {
        if(i!=j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    int partition(int[] array, int low, int high) {
        int pivot = findPivot(array, low, high);
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

    int MedianIndex(int[] array, int[] indices) {
        int[] values = new int[indices.length];

        for(int i=0; i<indices.length; i++) {
            values[i] = array[indices[i]];
        }

        for(int i=0; i<values.length; i++) {
            for(int j=0; j<values.length-i-1; j++) {
                if(values[j] > values[j+1]) {
                    swapNumbers(values, j , j+1);
                    swapNumbers(indices, j, j+1);
                }
            }
        }
        return indices[values.length/2];
    }

    int findPivot(int array[], int low, int high) {

        if(high - low + 1 < 5) {
            return low;
        }

        int medians_count = array.length/5;
        int[] medians = new int[medians_count];
        int ind = 0;

        for(int i=low; i<=high; i+=5) {
            int[] groupOfFive = new int[5];
            if(i+4 <= high) {
                for (int j = 0; j < 5; j++) {
                    groupOfFive[j] = i + j;
                }
                medians[ind++] = MedianIndex(array, groupOfFive);
            }
        }
        return MedianIndex(array, medians);
    }

    int deterministicSelection(int[] array, int low, int high, int index) {
        if(low<=high) {
            int piv_pos = partition(array, low, high);
            if(piv_pos == index) {
                return array[piv_pos];
            }
            else if(index < piv_pos) {
                return deterministicSelection(array, low, piv_pos - 1, index);
            }
            return deterministicSelection(array,piv_pos+1,high, index);
        }
        return 0;
    }
}
