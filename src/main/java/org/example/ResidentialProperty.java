package org.example;

// Жилая недвижимость (Наследование)
public class ResidentialProperty extends Property {
    private final int bedrooms;

    public ResidentialProperty(String address, double baseRate, int bedrooms) {
        super(address, baseRate);
        this.bedrooms = bedrooms;
    }

    @Override
    public double calculateRent() {
        return getBaseRate() + (bedrooms * 100);
    }

    @Override
    public String getDetails() {
        return "Жилая недвижимость по адресу: " + getAddress() + " (спален: " + bedrooms + ")";
    }
}