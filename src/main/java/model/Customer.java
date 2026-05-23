package com.tw.joi.delivery.model;

public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String loyaltyPoints;
    private LoyaltyTier tier;

    public Customer() {
    }

    public Customer(String customerId, String firstName, String lastName) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setLoyaltyPoints(String loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public void setTier(LoyaltyTier tier) {
        this.tier = tier;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public LoyaltyTier getTier() {
        return tier;
    }
}
