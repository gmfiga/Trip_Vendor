package com.example.tripvendor.main.model;

import java.math.BigDecimal;

public class Package {

    private final String city;
    private final String image;
    private final int days;
    private final BigDecimal price;

    public Package(String city, String image, int days, BigDecimal price) {
        this.city = city;
        this.image = image;
        this.days = days;
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public String getImage() {
        return image;
    }

    public int getDays() {
        return days;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
