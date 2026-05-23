package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.tw.joi.delivery.problems.SampleProblem;




public class SampleProblemTest {

    @Test
    public void shouldReturnTheBaseCostOfTheDelivery() {
        double cost = SampleProblem.calculateCost(3.0);
        assertEquals(10.0, cost, 0.001);
    }
}