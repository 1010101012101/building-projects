package bankaccountapp;

public abstract class Account implements IBaseRate {

    // List common properties for Savings and Checking Accounts
    String name;
    String sSN;
    double balance; // TODO Turn into integer

    String accountNumber;
    double rate; // TODO turn into integer?

    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initialDeposit) {

        this.name = name;
        this.sSN = sSN;
        this.balance = initialDeposit;

        System.out.println("NAME:    " + this.name +
                           "\nSSN:     " + this.sSN +
                           "\nBALANCE: $" + this.balance);
    }

    // List common methods

}
