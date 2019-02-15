package studentsdatabseapp;

import java.util.Scanner;

public class StudentsDatabaseApp {

    public static void main(String[] args) {

        Student[] studentsToEnroll = null;

        String startMenu =  "Choose an operation:" +
                            "\n(1) Enroll students" +
                            "\n(2) View status" +
                            "\n(q) Quit" +
                            "\n: ";

        System.out.print(startMenu);
        Scanner in = new Scanner(System.in);

        String option;
        int numberOfStudents = 0;

        while (!(option = in.nextLine()).equals("q")) {
            if (option.equals("1")) {
                // Ask how many users should be added
                System.out.print("Enter number of students to enroll: ");

                // Create n number of new students
                numberOfStudents = in.nextInt();
                studentsToEnroll = new Student[numberOfStudents];

                for (int i = 0; i < numberOfStudents; i++) {
                    studentsToEnroll[i] = new Student();
                    studentsToEnroll[i].payTuition();
                }

                in.nextLine();

            } else if (option.equals("2")) {

                if (studentsToEnroll != null) {
                    for (int i = 0; i < numberOfStudents; i++) {
                        System.out.println(studentsToEnroll[i].toString());
                    }
                } else {
                    System.out.println("There are no students currently enrolled.");
                }

            } else {
                System.out.println("\nPlease choose one of the options bellow.");
            }
            System.out.print(startMenu);
        }
        System.out.println("Good bye!");
    }
}
