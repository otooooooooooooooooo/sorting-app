package com.oto.impl;

public class Sort {

    /**
     *
     * @param arr Unsorted integer array to sort
     */
    public static void sort(Integer[] arr) {
        sort(arr, 0);
    }

    /**
     * Recursive implementation of sorting
     * @param arr Array to sort
     * @param startIndex Index from which to sort
     */
    public static void sort(Integer[] arr, int startIndex) {
        int len = arr.length - startIndex;
        if (len < 2)
            return;

        for(int i = startIndex + len - 1; i > startIndex; i--) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
        sort(arr, startIndex + 1);
    }
}
