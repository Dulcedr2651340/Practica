package com.tw.joi.delivery.model;

public class Item {
    private String id;
    private String name;
    private String description;
    private float price;
    private Category category;

    public Item() {}

    public Item(String id, String name, String description, float price, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public Item(String id, String name, String description, float price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = Category.DEFAULT;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }
}
