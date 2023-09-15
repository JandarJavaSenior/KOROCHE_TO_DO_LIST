import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Заучивание Корана",Priority.Высокий,Status.В_процессе);
        Task task2 = new Task("Чтение Книги", Priority.Низкий,Status.Выполнено);
        Task task3 = new Task("Учеба программированию",Priority.Криический,Status.В_процессе);
        Task task4 = new Task("Учеба Ислам",Priority.Средний,Status.НаКонтроле);
        LinkedList<Task> tasks = new LinkedList<>(List.of(task1,task2,task3,task4));
        Task_Service ta = new Task_Service(tasks);
        ta.addNewTask(new Task("Англиский язык",Priority.Низкий,Status.Отменена));
        System.out.println(ta.changeTaskStatus(task1,Status.Запланирована));
        System.out.println(ta.changeTasksPriority(task2, Priority.Криический));
        System.out.println(ta.sortByStatus());
        System.out.println(ta.sortByPriority());
        System.out.println(ta.getAll());
        ta.deleteTask(task4);
        System.out.println(ta.getAll());
        ta.deleteAllTasksByStatus(Status.В_процессе);
        System.out.println(ta.getAll());
        System.out.println(ta.getAllTaskStatus());


    }
}