package com.tw.joi.delivery.model;

public class DistanceMap {
    private String zoneTo;
    private String zoneFrom;
    private Integer distance;

    public DistanceMap() {}

    public DistanceMap(String zoneTo, String zoneFrom, Integer distance) {
        this.zoneTo = zoneTo;
        this.zoneFrom = zoneFrom;
        this.distance = distance;
    }

    public String getZoneTo() {
        return zoneTo;
    }

    public void setZoneTo(String zoneTo) {
        this.zoneTo = zoneTo;
    }

    public String getZoneFrom() {
        return zoneFrom;
    }

    public void setZoneFrom(String zoneFrom) {
        this.zoneFrom = zoneFrom;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}
