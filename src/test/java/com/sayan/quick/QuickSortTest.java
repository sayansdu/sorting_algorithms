package com.sayan.quick;

import org.junit.Test;

import static com.sayan.ArrayHelper.generate;
import static com.sayan.ArrayHelper.output;

/**
 * Created by sayan on 9/14/18.
 */
public class QuickSortTest {
    @Test
    public void sortTest() throws Exception {
        int[] arr = generate(10);
        output(arr);

        new QuickSort().sort(arr);
        output(arr);
    }

}