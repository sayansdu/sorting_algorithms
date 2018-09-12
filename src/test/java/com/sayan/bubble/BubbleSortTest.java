package com.sayan.bubble;

import org.junit.Test;

import static com.sayan.ArrayHelper.generate;
import static com.sayan.ArrayHelper.output;

/**
 * Created by sayan on 9/10/18.
 */
public class BubbleSortTest {

    @Test
    public void sort() throws Exception {
        int[] arr = generate(10);
        output(arr);

        new BubbleSort().sort(arr);
        output(arr);
    }

}