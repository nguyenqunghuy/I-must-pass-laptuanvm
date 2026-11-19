package tpbank;

class Task {
    private int ID;
    private String name,taskType ,date,assignee,reviewer;
    private float time;

    public Task() {
    }

    public Task(int ID, String name, String taskType, String date, float time, String assignee, String reviewer) {
        this.ID = ID;
        this.name = name;
        this.taskType = taskType;
        this.date = date;
        this.assignee = assignee;
        this.reviewer = reviewer;
        this.time = time;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getTaskType() {
        return taskType;
    }

    public String getDate() {
        return date;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public float getTime() {
        return time;
    }
    
}