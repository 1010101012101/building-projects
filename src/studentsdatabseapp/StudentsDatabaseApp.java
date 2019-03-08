package studentsdatabseapp;
codec.ask.termius deep exreme diff learning https://search.yahoo.com/search?p=deep+diff+learning+https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Ddeep%2Bdeef%2Blearning%2Bhttps%253A%252F%252Fmemberportal.lifelock.com%252Fsupport%252Fsearch%252Fhttps%253A%252F%252Fwww.youtube.com%252Fwatch%253Fv%253DKS--mwfCz_4%2526list%253DRDKS--mwfCz_4%2526start_radio%253D1%26oq%3Ddeep%2Bdeef%2Blearning%2Bhttps%253A%252F%252Fmemberportal.lifelock.com%252Fsupport%252Fsearch%252Fhttps%253A%252F%252Fwww.youtube.com%252Fwatch%253Fv%253DKS--mwfCz_4%2526list%253DRDKS--mwfCz_4%2526start_radio%253D1%26aqs%3Dchrome..69i57.10175j1j4%26client%3Dms-android-att-aio-us%26sourceid%3Dchrome-mobile%26ie%3DUTF-8&fr=yfp-t&fp=1&toggle=1&cop=mss&ei=UTF-8
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
