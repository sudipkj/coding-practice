package practice.code;

// Unit tests for TaskManager.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

    @Test
    void addingTaskIncreasesTaskListSize() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("New Task");
        assertEquals(1, taskManager.get.size());
    }

    @Test
    void deletingTaskDecreasesTaskListSize() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Task to delete");
        taskManager.deleteTask(0);
        assertEquals(0, taskManager.tasks.size());
    }

    @Test
    void deletingTaskWithInvalidIndexDoesNotChangeTaskList() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Task 1");
        taskManager.deleteTask(5);
        assertEquals(1, taskManager.tasks.size());
    }

    @Test
    void modifyingTaskUpdatesDescriptionAndCompletionStatus() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Old Task");
        taskManager.modifyTask(0, "Updated Task", true);
        assertEquals("Updated Task", taskManager.tasks.get(0).getDescription());
        assertTrue(taskManager.tasks.get(0).isCompleted());
    }

    @Test
    void modifyingTaskWithInvalidIndexDoesNotThrowException() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Task 1");
        assertDoesNotThrow(() -> taskManager.modifyTask(5, "New Task", true));
    }

    @Test
    void listingTasksReturnsCorrectOutput() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Task 1");
        taskManager.addTask("Task 2");
        assertEquals("0: Task{description='Task 1', completed=false}\n1: Task{description='Task 2', completed=false}\n", captureOutput(taskManager::listTasks));
    }

    // Helper method to capture console output
    private String captureOutput(Runnable action) {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        action.run();
        System.setOut(System.out);
        return out.toString();
    }
}