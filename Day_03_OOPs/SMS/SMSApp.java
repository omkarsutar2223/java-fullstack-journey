package SMS;

import java.util.ArrayList;
import java.util.Scanner;

public class SMSApp {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choise = sc.nextInt();

            switch (choise) {
                case 1:
                    System.out.println(" Add option selected");
                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Roll Number: ");
                    int rollNO = sc.nextInt();

                    System.out.println("Enter course name: ");
                    String course = sc.next();

                    Student s = new Student(name, rollNO, course);
                    list.add(s);
                    System.out.println("student add successfully");
                    break;
                case 2:
                    System.out.println("view option selected ");
                    for (Student temp : list) {
                        temp.showDetails();

                    }
                    break;

                case 3:
                    System.out.println("Exiting program");
                    sc.close();
                    return;

                default:
                    System.out.println("invalid choise ! try again");
            }

        }

    }
}
