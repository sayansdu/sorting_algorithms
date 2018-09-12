package com.sayan.selection;

import org.junit.Test;

import static com.sayan.ArrayHelper.*;

/**
 * Created by sayan on 9/12/18.
 */
public class SelectionSortTest {
    @Test
    public void sortTest() throws Exception {
        int[] arr = generate(10);
        output(arr);

        new SelectionSort().sort(arr);
        output(arr);
    }

}