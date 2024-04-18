package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // Статические функции
    public static void main(String[] args) {
        System.out.println("Пример использования статических функций:");
        int productionCapacity = 1000;
        int demand = 800;
        int excess = calculateExcess(productionCapacity, demand);
        System.out.println("Избыток производства: " + excess);
    }

    public static int calculateExcess(int productionCapacity, int demand) {
        return productionCapacity - demand;
    }

    public static void scheduleMaintenance() {
        System.out.println("Запланировано техническое обслуживание.");
    }

    public static void manageInventory() {
        System.out.println("Управление запасами на складе.");
    }

    // Динамические функции, относящиеся к программному обеспечению (ПО)
    public void automateProduction() {
        System.out.println("Автоматизация производственных процессов.");
    }

    public void analyzeData() {
        System.out.println("Анализ данных для оптимизации производства.");
    }

    public void monitorEquipment() {
        System.out.println("Мониторинг состояния оборудования.");
    }

    // Функции, относящиеся к ответвлению от стандартных функций
    public void prioritizeOrders(List<String> orders) {
        System.out.println("Определение приоритета заказов: " + orders);
    }

    public void customizeProduct() {
        System.out.println("Персонализация продукции в соответствии с требованиями клиентов.");
    }

    public static void handleEmergency() {
        System.out.println("Обработка аварийных ситуаций.");
    }

    public static void manageEmployees() {
        System.out.println("Управление персоналом.");
    }
}