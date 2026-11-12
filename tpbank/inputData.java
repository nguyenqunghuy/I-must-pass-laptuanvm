package tpbank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class inputData {

    static int inputOption(String messege) {
        Scanner sc = new Scanner(System.in);
        // loop run infinity
        while (true) {
            System.out.print(messege);
            String value = sc.nextLine();
            // check if value is Empty
            if (value.isEmpty()) {
                System.out.println("Value is empty !");
                continue;
            }
            try {
                int number = Integer.parseInt(value);
                // check if number not in range [1,4]
                if (number > 4 || number < 1) {
                    System.out.println("Please number  in range [1,4]");
                    continue;
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer number");
            }
        }
    }

    static int inputID(ArrayList<Task> listTask) {
        // check if list emty
        if (listTask.isEmpty()) {
            return 1;
        } else {
            return listTask.getLast().getID() + 1;
        }

    }

    static String inputString(String messege) {
        Scanner sc = new Scanner(System.in);
        // loop run infinity
        while (true) {
            System.out.print(messege);
            String value = sc.nextLine();
            // check if value is Empty
            if (value.isEmpty()) {
                System.out.println("Value is empty !");
                continue;
            }
            return value;
        }
    }

    static String inputDate(String messege) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
        DateFormat.setLenient(false);
        //loop run infinity
        while (true) {
            System.out.println(messege);
            String date = sc.nextLine();
            // check if date null
            if (date.isEmpty()) {
                System.out.println("value input Empty");
                continue;
            }
            // check if formart not is (dd-MM-yyyy)
            if (!checkCorrectFormat(date)) {
                System.out.println("Date must be in format dd-MM-yyyy");
            }
            try {
                DateFormat.parse(date);
                return date;
            } catch (ParseException e) {
                System.out.println("Date does not exist!");
            }
        }
    }

    private static boolean checkCorrectFormat(String date) {
        //check if length date not is 10
        if (date.length() != 10) {
            return false;
        }
        //check if date not contain '-'in index 2 and 5
        if (date.charAt(2) != '-' || date.charAt(5) != '-') {
            return false;
        }
        //loop to access each charecter of date
        for (int i = 0; i < date.length(); i++) {
            // check if index is 2 and 5
            if (i == 2 || i == 5) {
                continue;
            }
            //check if charecter not is digits
            if (!Character.isDigit(date.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static String inputTaskType(String messege) {
        Scanner sc = new Scanner(System.in);
        // loop run infinity
        while (true) {
            System.out.print(messege);
            String value = sc.nextLine();
            // check if value is Empty
            if (value.isEmpty()) {
                System.out.println("Value is empty !");
                continue;
            }
            try {
                int taskcode = Integer.parseInt(value);
                // check if number not in range [1,4]
                if (taskcode > 4 || taskcode < 1) {
                    System.out.println("Please number in range [1,4]");
                    continue;
                }
                //check if task is code 
                if (taskcode == 1) {
                    return "Code";
                } //check if task is test
                else if (taskcode == 2) {
                    return "Test";
                } //check if task is design
                else if (taskcode == 3) {
                    return "Design";
                } //check if task is review
                else {
                    return "Review";
                }
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer number");
            }
        }
    }

    static int inputInteger(String messege) {
        Scanner sc = new Scanner(System.in);
        // loop run infinity
        while (true) {
            System.out.print(messege);
            String value = sc.nextLine();
            // check if value is Empty
            if (value.isEmpty()) {
                System.out.println("Value is empty !");
                continue;
            }
            try {
                int number = Integer.parseInt(value);
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer number");
            }
        }
    }

    static float inputTime() {
        Scanner sc = new Scanner(System.in);
        // loop run infinity
        while (true) {
            System.out.print("From: ");
            String timeFrom = sc.nextLine();
            System.out.print("To: ");
            String timeTo = sc.nextLine();
            // check if value input is Empty
            if (timeFrom.isEmpty() || timeTo.isEmpty()) {
                System.out.println("Value input is empty !");
                continue;
            }
            try {
                float timeFromNumber = Float.parseFloat(timeFrom);
                float timeToNumber = Float.parseFloat(timeTo);
                //check if timeFromNumber greater than timeToNumber
                if (timeFromNumber > timeToNumber) {
                    System.out.println("dont input timeFrom greater than timeTo");
                    continue;
                }
                // check if number not in range [8,17.5]
                if (timeFromNumber < 8 || timeToNumber > 17.5) {
                    System.out.println("Please number in range [8,17.5]");
                    continue;
                }
                return timeToNumber - timeFromNumber;
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer number");
            }
        }
    }

}
