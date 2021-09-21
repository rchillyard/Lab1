package edu.neu.coe.info6205;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {

    @Test
    public void testToString() {

        final TwoSum target = new TwoSum(10);
        final String s = target.toString();
        assertEquals("TwoSum{n=10}", s);
    }
}