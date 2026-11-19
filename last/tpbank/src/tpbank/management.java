package tpbank;

import java.util.ArrayList;

class management {

    static void addTask(ArrayList<Task> listTask) {
        System.out.println("------------Add Task---------------");//12 15
        int ID = inputData.inputID(listTask);
        String name = inputData.inputString("Requirement Name: ");
        String taskType = inputData.inputTaskType("Task Type: ");
        String date = inputData.inputDate("Date: ");
        float time = inputData.inputTime();
        String assignee = inputData.inputString("Assignee: ");
        String reviewer = inputData.inputString("Reviewer: ");
        Task task = new Task(ID, name, taskType, date, time, assignee, reviewer);
        listTask.add(task);
    }

    static void deleteTask(ArrayList<Task> listTask) {
        System.out.println("========= Task program =========");//9 9
        // check if list null
        if (listTask.isEmpty()) {
            System.out.println("list Task null");
        }
        int IDFind = inputData.inputInteger("ID: ");
        //loop throug each task in list
        for (Task x : listTask) {
            //check if IDFind equal with ID of task
            if (IDFind == x.getID()) {
                listTask.remove(x);
                return;
            }
        }
        System.out.println("dont find ID: " + IDFind);
    }

}
