package org.example;

import java.util.ArrayList;
import java.util.List;

// Менеджер управления реестром недвижимости
public class PropertyManager {
    private final ContractEngine contractEngine; // Композиция
    private final List<Property> properties;      // Агрегация

    public PropertyManager() {
        // Композиция: ContractEngine создаётся внутри и неотделим
        this.contractEngine = new ContractEngine();
        this.properties = new ArrayList<>();
        this.contractEngine.initEngine();
    }

    // Агрегация: добавление объектов, созданных снаружи
    public void addProperty(Property property) {
        properties.add(property);
        System.out.println("Объект добавлен в реестр: " + property.getAddress());
    }

    // Зависимость: Tenant передается временно в метод для генерации отчёта
    public void generateReportForTenant(Tenant tenant) {
        System.out.println("\n--- Отчёт по аренде для клиента: " + tenant.getName() + " ---");
        for (Property property : properties) {
            System.out.println(property.getDetails() + " | Итоговая плата: " + property.calculateRent() + " BYN");
        }
    }
}