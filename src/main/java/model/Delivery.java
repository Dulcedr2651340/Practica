package com.tw.joi.delivery.model;

public class Delivery {
    private int id;
    private Integer timeInMinutes;
    private int  distance;

    public Integer getTimeInMinutes() {
        return timeInMinutes;
    }

    public void setTimeInMinutes(Integer timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Delivery() {}

    public Delivery(Integer timeInMinutes, int distance) {
        this.timeInMinutes = timeInMinutes;
        this.distance = distance;
    }
}
