import java.util.List;

public interface Task_Interface {
    Task addNewTask(Task task);
    List<Status> getAllTaskStatus();
    String changeTaskStatus(Task taskToChange,Status status);
    String changeTasksPriority(Task taskToChange, Priority priority);
    void deleteTask(Task task);
    void deleteAllTasksByStatus(Status status);
    List<Task> sortByStatus();
    List<Task> sortByPriority();
    List<Task> getAll();
}
