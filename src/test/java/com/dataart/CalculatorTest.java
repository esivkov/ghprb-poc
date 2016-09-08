package com.dataart;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void add() throws Exception {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void subtract() throws Exception {
        assertEquals(1, Calculator.subtract(3,2));
    }

}