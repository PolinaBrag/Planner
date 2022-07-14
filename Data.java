package Planner;

public class Data {
    
    enum Priority {
        LOW,
        MIDDLE,
        HIGH,
    }

    private String titles;
    private String id;
    private String creationDate;
    private String creationTime;
    private String dedlineDate;
    private String dedlineTime;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String task;
    private Priority priority;

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public void setDedlineDate(String dedlineDate) {
        this.dedlineDate = dedlineDate;
    }

    public void setDedlineTime(String dedlineTime) {
        this.dedlineTime = dedlineTime;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getId() {
        return id;
    }
   
    public String getCreationDate() {
        return creationDate;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public String getDedlineDate() {
        return dedlineDate;
    }

    public String getDedlineTime() {
        return dedlineTime;
    }


    public Priority getPriority() {
        return priority;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void PrintData(Data dt){
        System.out.print(
        dt.getId() + "," + dt.getCreationDate() + "," + dt.getCreationTime() + "," + dt.getDedlineDate() + "," + dt.getDedlineTime()
        + "," + dt.getLastName() + "," + dt.getFirstName() + "," + dt.getPatronymic() + "," + dt.getTask() + ",");
        switch (dt.getPriority()) {
            case HIGH:
                System.out.println(Priority.HIGH);
                break;
            case MIDDLE:
                System.out.println(Priority.MIDDLE);
                break;   
            case LOW:
                System.out.println(Priority.LOW);
                break; 
        
        }
    }


}
