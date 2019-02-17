package bankaccountapp;

public abstract class Account implements IBaseRate {

    // List common properties for Savings and Checking Accounts
    private String name;
    private String sSN;
    private double balance; // TODO Turn into integer

    private static int index = 10000;
    protected String accountNumber;
    protected double rate; // TODO turn into integer?

    // Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initialDeposit) {

        this.name = name;
        this.sSN = sSN;
        this.balance = initialDeposit;

        // Set account number
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String last2ofSSN = sSN.substring(sSN.length()-2);
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return last2ofSSN + uniqueID + randomNumber;
    }

    public void compound() {
        double accruedInterest  = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }

    // List common methods - Transactions
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transfering $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is now $" + balance);
    }

    public void showInfo() {
        System.out.println(
                "NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: $" + balance +
                "\nRATE: " + rate + "%"
        );
    }

}
