import java.util.*;

public class Task_Service {
    private LinkedList<Task> data;

    public Task_Service(LinkedList<Task> data) {
        this.data = data;
    }

    public Task addNewTask(Task task) {
        if (!data.contains(task)) {
            data.add(task);
            return task;
        }
        return null;
    }

    public List<Status> getAllTaskStatus() {
        List<Status> statuses = new ArrayList<>();
        for (Task task : data) {
            statuses.add(task.getStatus());
        }
        return statuses;
    }

    public String changeTaskStatus(Task taskToChange, Status newStatus) {
        for (Task task : data) {
            if (task == taskToChange) {
                task.setStatus(newStatus);
                return "Статус задачи изменен на " + newStatus;
            }
        }
        return "Задачи с указанным статусом не найдены.";
    }

    public String changeTasksPriority(Task taskToChange, Priority newPriority) {
        for (Task task : data) {
            if (task == taskToChange) {
                task.setPriority(newPriority);
                return "Приоритет задачи изменен на " + newPriority;
            }
        }
        return "Задачи с указанным приоритетом не найдены.";
    }


    public void deleteTask(Task task) {
        data.remove(task);
        System.out.println("Задача удалена.");
    }

    public void deleteAllTasksByStatus(Status status) {
        Iterator<Task> iterator = data.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getStatus() == status) {
                iterator.remove();
            }
        }
    }

    public List<Task> sortByStatus() {
        List<Task> sortedTasks = new ArrayList<>(data);
        Collections.sort(sortedTasks, new Comparator<Task>() {
            @Override
            public int compare(Task task1, Task task2) {
                return task1.getStatus().compareTo(task2.getStatus());
            }
        });
        return sortedTasks;
    }

    public List<Task> sortByPriority() {
        List<Task> sortedTasks = new ArrayList<>(data);
        Collections.sort(sortedTasks, new Comparator<Task>() {
            @Override
            public int compare(Task task1, Task task2) {
                return task1.getPriority().compareTo(task2.getPriority());
            }
        });
        return sortedTasks;
    }

    public List<Task> getAll() {
        return data;
    }
}
