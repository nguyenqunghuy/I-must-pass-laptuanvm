package tpbank;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class dataTranfeObjectr {

    //scanner & file writer
    public static void inputToDB(ArrayList<Task> listTask) {
        try {
            File file = new File("ouput.txt");// khai bao dt file thong qua đường dẫn file
            FileWriter fw = new FileWriter(file);// khi mo neu ko co true thi ghi tu dau,cos true thi se ghi tiep tuc tu cuoi file
            //loop run each task of list
            for (Task task : listTask) {
                fw.write(task.getID() + "\n");
                fw.write(task.getName() + "\n");
                fw.write(task.getTaskType() + "\n");
                fw.write(task.getDate() + "\n");
                fw.write(task.getTime() + "\n");
                fw.write(task.getAssignee() + "\n");
                fw.write(task.getReviewer() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("File Not fount!");
        }
    }

    public static void getDataFromDB(ArrayList<Task> listTask) {
        try {
            File file = new File("ouput.txt");// khai bao doi tuong kieu file lien ket voi file muon doc ghi
            Scanner sc = new Scanner(file);
            // loop until there is no line 
            while (sc.hasNextLine()) {
                int ID = Integer.parseInt(sc.nextLine());
                String name = sc.nextLine();
                String taskType = sc.nextLine();
                String date = sc.nextLine();
                float time = Float.parseFloat(sc.nextLine());
                String assignee = sc.nextLine();
                String reviewer = sc.nextLine();
                Task task = new Task(ID, name, taskType, date, time, assignee, reviewer);
                listTask.add(task);
            }
        } catch (IOException e) {
            System.out.println("File Not exists");
        }

    }
}
