package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем главный менеджер
        PropertyManager manager = new PropertyManager();

        // Создаем объекты недвижимости
        Property apt = new ResidentialProperty("ул. Гурского, 37", 800, 2);
        Property office = new CommercialProperty("ул. Победителей, 20", 1500, 0.20);

        // Передаем недвижимость в менеджер
        manager.addProperty(apt);
        manager.addProperty(office);

        // Создаем арендатора и формируем отчёт
        Tenant tenant = new Tenant("ИП Иванов А. В.");
        manager.generateReportForTenant(tenant);
    }
}