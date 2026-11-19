package tpbank;

import java.util.ArrayList;

class display {

    static void displayMenu() {
        System.out.println("========= Task program =========");
        System.out.println("    1. Add Task");
        System.out.println("    2. Delete task");
        System.out.println("    3. Display Task");
        System.out.println("    4. exit");

    }
    
    static void showTask(ArrayList<Task> listTask) {
        System.out.println("----------------------------------------- Task ---------------------------------------");//41 39
        System.out.printf("%-5s%-17s%-14s%-14s%-14s%-14s%-14s", "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");
        System.out.println("");
        for (Task x : listTask) {
            System.out.printf("%-5d%-17s%-14s%-14s%-14.1f%-14s%-14s",
                    x.getID(), x.getName(), x.getTaskType(), x.getDate(),
                    x.getTime(), x.getAssignee(), x.getReviewer());
            System.out.println("");
        }
    }

}
