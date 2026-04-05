package com.thealgorithms.arrays;

/**
 * Finds the maximum element in an array.
 */
public final class MaximumElement {

    private MaximumElement() {
        // utility class
    }

    /**
     * Returns the maximum element in the array.
     *
     * @param arr input array
     * @return maximum value
     */
    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}
