package com.oto.output;

import java.util.Arrays;

/**
 * Class provides functionality to
 * format resulting array as printable string/
 */

public class OutputFormatter {

    /**
     * @param arr Sorted integer array
     * @return Space separated string
     */
    public static String formatIntArray(Integer[] arr) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(arr).forEach(x -> sb.append(x).append(' '));
        return sb.toString();
    }

    /**
     *
     * @param orderedArray Resulting ordered array as string
     * @return Text ready to print on output
     */
    public static String formatResult(String orderedArray) {
        return "Result: " + orderedArray + "\n";
    }

}
