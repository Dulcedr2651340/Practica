package com.tw.joi.delivery.model;

import java.util.List;

public class Store {
    private String storeId;
    private String zone;
    private List<String> items;

    public Store() {}

    public Store(String storeId, String zone, List<String> items) {
        this.storeId = storeId;
        this.zone = zone;
        this.items = items;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
