public class Task {
    private String descriotion;
    private Priority priority;
    private Status status;

    public Task(String descriotion, Priority priority, Status status) {
        this.descriotion = descriotion;
        this.priority = priority;
        this.status = status;
    }

    public String getDescriotion() {
        return descriotion;
    }

    public void setDescriotion(String descriotion) {
        this.descriotion = descriotion;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task \n" +
                "descriotion " + descriotion +"\n"+
                "priority " + priority + "\n"+
                "status " + status +"\n";
    }
}
