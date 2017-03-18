package ru.spbstu.icc.kspt.algorithms;


public class MaxSubarraySumFinder {

    public static double findMaxSubarraySum(double [] array) {
        double maxSum = array[0];
        double lastSum = 0;
        for (int i = 0; i < array.length; i++) {

            lastSum += array[i];

            if (lastSum > maxSum) {
                maxSum = lastSum;
            }

            if (lastSum < 0) {
                lastSum = 0;
            }
        }
        return maxSum;
    }
}
