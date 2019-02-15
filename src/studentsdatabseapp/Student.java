package studentsdatabseapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

    private String firstName;

    private String lastName;

    private short gradeYear;

    private int studentId;

    private String[] courses = {"History 101", "Mathematics 101", "English 101", "Chemistry 101", "Computer Science 101"};

    private List<Integer> enrolledCourses = new ArrayList<>();

    private int tuitionBalance = 0;

    private static short COST_OF_EACH_COURSE = 600;

    private static int id = 1000;

    // Constructor: Add new student (prompt for name and year)
    public Student() {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.print("Enter student's class level: " +
                         "\n(1) Freshman" +
                         "\n(2) Sophmore" +
                         "\n(3) Junior"+
                         "\n(4) Senior" +
                         "\n: ");

        this.gradeYear = in.nextShort();
        this.setStudentId();
        this.enrollInCourses();

    }

    // Generate id
    private void setStudentId() {
        id++;
        // Grade Level + id
        this.studentId = gradeYear * 10000 + id;
    }

    // Enroll in courses
    private void enrollInCourses() {

        System.out.println("Enter course to enroll: ");
        for (int i = 0; i < this.courses.length; i++) {
            System.out.println("(" + i + ") "  + this.courses[i]);
        }
        System.out.println("(q) Move on");
        System.out.print(": ");

        Scanner in = new Scanner(System.in);
        int courseId;
        String option;

        while (!(option = in.nextLine()).equals("q")) {
            courseId = Integer.valueOf(option);
            this.enrolledCourses.add(courseId);
            this.tuitionBalance += COST_OF_EACH_COURSE;
            System.out.println("The student's tuition balance now is: $" + this.getTuitionBalance());
            System.out.print("Enter next course to enroll or (q) to quit: ");
        }
    }

    // View balance
    public int getTuitionBalance() {
        return tuitionBalance;
    }

    // Pay tuition
    public void payTuition() {

        short amount;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter amount to be paid: $");
        amount = in.nextShort();
        this.tuitionBalance -= amount;

        System.out.println("The new tuition balance is: $" + this.getTuitionBalance());
    }

    // Show status
    public String toString() {

        String listEnrolledCourses = "";
        int counter = 1;

        for (int courseId : this.enrolledCourses) {
            listEnrolledCourses += this.courses[courseId];
            // Add a space only if it's not the last element
            if(counter < this.enrolledCourses.size()) {
                listEnrolledCourses += ", ";
            }
            counter++;
        }

        return "Student ID: " + studentId +
                "\nFirst name: " + firstName +
                "\nLast name: " + lastName +
                "\nEnrolled courses: " + listEnrolledCourses +
                "\nTuition balance: $" + tuitionBalance;
    }


}
