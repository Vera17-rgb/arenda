package org.example;

// Абстрактный базовый класс
public abstract class Property implements Leasable {
    private final String address;
    private final double baseRate;

    public Property(String address, double baseRate) {
        this.address = address;
        this.baseRate = baseRate;
    }

    public String getAddress() {
        return address;
    }

    public double getBaseRate() {
        return baseRate;
    }
}