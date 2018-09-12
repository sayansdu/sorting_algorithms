package com.sayan;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by sayan on 9/12/18.
 */
public class ArrayHelper {

    public static int[] generate(int length) {
        return IntStream.generate(() -> new Random().nextInt(100)).limit(length).toArray();
    }

    public static void output(int[] arr) {
        System.out.println();
        Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
    }


}
