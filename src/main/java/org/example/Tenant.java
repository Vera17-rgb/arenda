package org.example;

// Арендатор
public class Tenant {
    private final String name;

    public Tenant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}