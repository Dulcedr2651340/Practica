package com.tw.joi.delivery.problems;

public class SampleProblem {
    public static void main(String[] args) {
        SampleProblem sample = new SampleProblem();
        double cost = sample.calculateCost(8.0); // Example distance
        System.out.println("Delivery cost for 8 km: ₹" + cost);
    }

    // Write your methods here.
    public static Double calculateCost(double distanceKm) {
        if (distanceKm <= 0) {
            throw new IllegalArgumentException("Distance must be positive");
        }

        double baseCost = 50.0;
        if (distanceKm <= 5) {
            return baseCost;
        } else {
            double extraDistance = distanceKm - 5;
            return baseCost + (extraDistance * 10);
        }
    }
}
