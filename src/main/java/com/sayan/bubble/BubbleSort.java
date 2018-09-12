package com.sayan.bubble;

import java.util.Arrays;

/**
 * Created by sayan on 9/10/18.
 */
public class BubbleSort {

    public void sort(int [] arr) {
        int l = arr.length;

        for (int i = 0; i < l; i++) {
            int temp;
            for (int j = 1; j < l-i; j++) {
                if(arr[j] < arr[j-1]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
//            Arrays.stream(arr).forEach(k -> System.out.print(k+" "));
//            System.out.println();
        }
    }


}
