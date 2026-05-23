package com.tw.joi.delivery.model;

import java.util.List;

public class DeliveryPartner {
    private String id;
    private String name;
    private List<Delivery> deliveries;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    public DeliveryPartner() {
    }

    public DeliveryPartner(String id, String name, List<Delivery> deliveries) {
        this.id = id;
        this.name = name;
        this.deliveries = deliveries;
    }
}
