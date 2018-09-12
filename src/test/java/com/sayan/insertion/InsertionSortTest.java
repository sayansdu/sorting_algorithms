package com.sayan.insertion;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by sayan on 9/12/18.
 */
public class InsertionSortTest {
    @Test
    public void sort() throws Exception {
        int[] arr = {9, 7, 6 ,5 ,4 ,2 , 1};
        new InsertionSort().sort(arr);
        Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
    }

}