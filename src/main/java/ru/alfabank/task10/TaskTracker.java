package ru.alfabank.task10;

import java.util.ArrayList;

public class TaskTracker{
    private ArrayList<Task> tasks;

    public TaskTracker() {
        this.tasks = new ArrayList<>();
    }
    // Добавить новую задачу в список
    public void addTask(String name) {
        Task newTask = new Task(name);
        tasks.add(newTask);
        System.out.println("Задача добавлена: " + name);
    }

    // Вывести все задачи
    public void showAllTasks() {
        System.out.println("\n=== Все задачи ===");
        if (tasks.isEmpty()) {
            System.out.println("Задач нет.");
        } else {
            for (Task task : tasks) {
                task.showInfo();
            }
        }
        System.out.println();
    }

    // Найти задачу по названию
    public void findTaskByName(String name) {
        for (Task task : tasks) {
            if (task.getName().equals(name)) {
                System.out.println("\nЗадача найдена:");
                task.showInfo();
                return;
            }
        }
        System.out.println("Задача не найдена");
    }

    // Пометить задачу как сделанную (на базе переданного имени задачи)
    public void markTaskAsCompleted(String name) {
        for (Task task : tasks) {
            if (task.getName().equals(name)) {
                task.markAsCompleted();
                System.out.println("Задача \"" + name + "\" выполнена!");
                return;
            }
        }
        System.out.println("Задача не найдена");
    }

    // Вывести статистику по задачам
    public void showStats() {
        int total = tasks.size();
        int completed = 0;
        int open = 0;

        for (Task task : tasks) {
            if (task.isCompleted()) {
                completed++;
            } else {
                open++;
            }
        }

        System.out.println("\n=== Статистика задач ===");
        System.out.println("Всего задач: " + total);
        System.out.println("Выполнено: " + completed);
        System.out.println("Открыто: " + open);
        System.out.println();
    }
}