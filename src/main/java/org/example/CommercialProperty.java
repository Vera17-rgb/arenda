package org.example;

// Коммерческая недвижимость (Наследование)
public class CommercialProperty extends Property {
    private final double taxRate;

    public CommercialProperty(String address, double baseRate, double taxRate) {
        super(address, baseRate);
        this.taxRate = taxRate;
    }

    @Override
    public double calculateRent() {
        return getBaseRate() * (1 + taxRate);
    }

    @Override
    public String getDetails() {
        return "Коммерческая недвижимость по адресу: " + getAddress() + " (налог: " + (taxRate * 100) + "%)";
    }
}