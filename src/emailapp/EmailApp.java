package emailapp;

public class EmailApp {

    public static void main(String[] args) {

        String header = "E-MAIL ADMINISTRATION" +
                "\nCreate new account";

        System.out.println(header);

        Email email1 = new Email("Michael", "Jordan");

        System.out.println(email1.showInfo());
    }

}
