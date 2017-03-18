package ru.spbstu.icc.kspt.algorithms;


import static org.junit.Assert.*;
import org.junit.Test;

public class MaxSubarraySumFinderTest {
    @Test
    public void testFindMaxSubarraySum() {

        double[] array;

        array = new double[] {-1.23, 1.56, 0.13, 2.00, -3.96, -1.20, -2.01, 3.07, -1.67, 1.12};
        assertEquals(3.69, MaxSubarraySumFinder.findMaxSubarraySum(array), 1e-3);

        array = new double[] {-32.32, -10.84, -0.13, -95.32, -17.21, -0.20, -77.77, -1.07, -52.67, -49.97};
        assertEquals(-0.13, MaxSubarraySumFinder.findMaxSubarraySum(array), 1e-3);

        array = new double[] {-100.88, 86.91, 91.58, -22.71, 44.55, 74.68, 28.07, 64.93};
        assertEquals(368.01, MaxSubarraySumFinder.findMaxSubarraySum(array), 1e-3);
    }
}
