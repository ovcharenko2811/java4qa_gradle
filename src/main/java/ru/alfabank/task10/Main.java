package ru.alfabank.task10;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Task Tracker - Начало работы ===\n");

        // Создаем объект TaskTracker
        TaskTracker tracker = new TaskTracker();

        // 1. Добавляем новые задачи в список
        tracker.addTask("Проверить авторизацию");
        tracker.addTask("Проверить регистрацию");
        tracker.addTask("Написать тесты");

        // 2. Выводим все задачи
        tracker.showAllTasks();

        // 3. Находим задачу по названию (успешный поиск)
        tracker.findTaskByName("Проверить авторизацию");

        // 4. Находим задачу по названию (неудачный поиск)
        tracker.findTaskByName("Несуществующая задача");

        // 5. Помечаем задачу как сделанную
        tracker.markTaskAsCompleted("Проверить регистрацию");

        // 6. Выводим все задачи после обновления
        tracker.showAllTasks();

        // 7. Выводим статистику по задачам
        tracker.showStats();

        System.out.println("=== Task Tracker - Работа завершена ===");
    }
}