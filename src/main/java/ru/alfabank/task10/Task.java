package ru.alfabank.task10;

public class Task {
    private String name;
    private boolean completed;

    public Task(String name) {
        this.name = name;
        this.completed = false;
    }

    // Пометить задачу как выполненную
    public void markAsCompleted() {
        this.completed = true;
    }

    // Получить статус — выполнена задача или нет
    public boolean isCompleted() {
        return this.completed;
    }

    // Получить название задачи
    public String getName() {
        return this.name;
    }

    // Вывести информацию о задаче
    public void showInfo() {
        if (this.completed) {
            System.out.println("[x] " + this.name);
        } else {
            System.out.println("[ ] " + this.name);
        }
    }
}