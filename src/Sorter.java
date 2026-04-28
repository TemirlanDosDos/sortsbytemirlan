import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sorter {
    public int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }

    public void basicSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public void advancedSort(int[] array) {
        int length = array.length;

        if (length <= 1) return; // base case

        int middle = length / 2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0;
        int j = 0;

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }

        advancedSort(leftArray);
        advancedSort(rightArray);

        mergeSort(leftArray, rightArray, array);
    }
    private void mergeSort(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0; // main array index
        int l = 0; // left array index
        int r = 0; // right array index

        // compare elements
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        // remaining elements (left)
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        // remaining elements (right)
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

