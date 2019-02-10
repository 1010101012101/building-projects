package emailapp;

import java.util.Scanner;

public class Email {

    private int defaultPasswordLength = 10;

    private String firstName;

    private String lastName;

    private String department;

    private String companyDomain = "company.com";

    private String email;

    private String password;

    private int mailboxCapacity = 500;

    private String alternateEmail;

    // Constructor to receive the first and last names
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for the department
        this.department = setDepartment();

        // Call a method that returns a random password
        this.password = getRandomPassword(defaultPasswordLength);
        System.out.println("YOUR PASSWORD: " + this.password);

        // Combine elements to generate e-mail
        this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase();
        this.email += "@" + this.department.toLowerCase() + this.companyDomain.toLowerCase();

    }

    // Ask for the department
    private String setDepartment() {

        System.out.print("DEPARTMENT CODES\n 1 for Sales\n 2 for Development\n 3 for Accounting\n 0 for none\nEnter the department: ");

        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();

        if (departmentChoice == 1) { return "Sales."; }
        else if (departmentChoice == 2) { return "Development."; }
        else if (departmentChoice == 3) { return "Accounting."; }
        else { return ""; }

    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public int getMailboxCapacity() {
        return this.mailboxCapacity;
    }

    public String getAlternateEmail() {
        return this.alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    // Generate random password
    private String getRandomPassword(int length) {

        String passwordSet = "ABCDEFGHIJKLMNOPQRSWTYVXZ1234567890~!@#$%^&*()-_=+";
        char[] password = new char[length];
        int random;

        for (int i = 0; i < length; i++) {
            random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }

        return String.valueOf(password);
    }

    // Change password
    public void setPassword(String password) {
        this.password = password;
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set the alternate e-mail
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // Show information of the mailbox
    public String showInfo(){

        return  "DISPLAY NAME: " + this.firstName + " " + this.lastName +
                "\nCOMPANY E-MAIL: " + this.email +
                "\nMAILBOX CAPACITY: " + this.mailboxCapacity + " MB";


    }
}
