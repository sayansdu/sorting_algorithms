package com.sayan.merge;

import org.junit.Test;

import static com.sayan.ArrayHelper.generate;
import static com.sayan.ArrayHelper.output;

/**
 * Created by sayan on 9/10/18.
 */
public class MergeSortTest {

    @Test
    public void sort() throws Exception {
        int[] arr = generate(15);
        output(arr);

        new MergeSort().sort(arr);
        output(arr);
    }

}