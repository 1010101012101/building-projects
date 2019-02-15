package bankaccountapp;

public class Savings extends Account {

    // List properties specific to a savings account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to initialize savings account properties
    public Savings(String name, String sSN, double initialDeposit) {
        super(name, sSN, initialDeposit);
        System.out.println("NEW SAVINGS ACCOUNT");
    }

    // List any methods specific to the savings account

}
