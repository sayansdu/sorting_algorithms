package com.sayan.insertion;

import org.junit.Test;

import static com.sayan.ArrayHelper.generate;
import static com.sayan.ArrayHelper.output;

/**
 * Created by sayan on 9/12/18.
 */
public class InsertionSortTest {
    @Test
    public void sort() throws Exception {
        int[] arr = generate(20);
        output(arr);

        new InsertionSort().sort(arr);
        output(arr);
    }

}