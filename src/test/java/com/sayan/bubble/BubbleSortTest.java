package com.sayan.bubble;

import com.sayan.merge.MergeSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by sayan on 9/10/18.
 */
public class BubbleSortTest {

    @Test
    public void sort() throws Exception {
        int[] temp = {1, 2, 5, 3, 8, 0, 1, 10, 20, 11, 9};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(temp);

        Arrays.stream(temp).forEach(i -> System.out.print(i+" "));
    }

}