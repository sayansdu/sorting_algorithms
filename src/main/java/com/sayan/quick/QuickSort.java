package com.sayan.quick;

/**
 * Created by sayan on 9/14/18.
 */
public class QuickSort {

    public void sort(int[] arr) {
        int length = arr.length;
        quickSort(arr, 0, length-1);
    }

    private void quickSort(int[] arr, int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;

        int pivot = arr[lowerIndex+(higherIndex-lowerIndex)/2];

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }

            if(i <= j) {
                swap(i, j, arr);
                i++;
                j--;
            }
        }

        if(lowerIndex < j) {
            quickSort(arr, lowerIndex, j);
        }
        if(higherIndex > i) {
            quickSort(arr, i, higherIndex);
        }
    }

    private void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
