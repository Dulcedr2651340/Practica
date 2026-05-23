package com.tw.joi.delivery.model;

public enum LoyaltyTier {

    DIAMOND(10), GOLD(5), SILVER(3);

    private int discount;

    LoyaltyTier(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return this.discount;
    }

}
