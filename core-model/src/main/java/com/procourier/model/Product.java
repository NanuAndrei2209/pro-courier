package com.procourier.model;

import java.util.Objects;

public final class Product {
    private Long price;
    private String name;
    private String description;
    private Long weight; // kg

    public Product(Long price, String name, String description, Long weight) {
        this.price = Objects.requireNonNull(price);
        this.name = Objects.requireNonNull(name);
        this.description = Objects.requireNonNull(description);
        this.weight = Objects.requireNonNull(weight);
    }

    private static Long checkWeight (Long weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        }
        return Objects.requireNonNull(weight);
    }

    public Long getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Long getWeight() {
        return weight;
    }
}
