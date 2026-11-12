package tpbank;

import java.util.ArrayList;

public class Tpbank {

    public static void main(String[] args) {
        ArrayList<Task> listTask = new ArrayList();
        do {
            //display menu
            display.displayMenu();
            //select an option
            int choise = inputData.inputOption("Input choise:");
            //Perform function based on the selected option.
            switch (choise) {
                //Option  1: 
                case 1:
                    //add Task
                    management.addTask(listTask);
                    break;
                //Option  2:
                case 2:
                    // Delete Task
                    management.deleteTask(listTask);
                    break;
                //Option 3: 
                case 3:
                    //Show task
                    display.showTask(listTask);
                    break;
                //Option 4:
                case 4:
                    return;
            }
            //loop run infinity
        } while (true);
    }

}
