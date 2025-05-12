package practice.code;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private static class Task {
        private String description;
        private boolean completed;

        public Task(String description) {
            this.description = description;
            this.completed = false;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public boolean isCompleted() {
            return completed;
        }

        public void setCompleted(boolean completed) {
            this.completed = completed;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "description='" + description + '\'' +
                    ", completed=" + completed +
                    '}';
        }
    }

    private final List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void modifyTask(int index, String newDescription, boolean completed) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setDescription(newDescription);
            task.setCompleted(completed);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Complete project documentation");
        taskManager.addTask("Fix bugs in the code");
        taskManager.listTasks();

        taskManager.modifyTask(1, "Fix critical bugs in the code", true);
        taskManager.listTasks();

        taskManager.deleteTask(0);
        taskManager.listTasks();
    }
}