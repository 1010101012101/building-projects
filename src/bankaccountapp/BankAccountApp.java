package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<>();
//        Checking checkingAccount1 = new Checking("Tom Wilson", "123456789", 1500);
//        Savings  savingsAccount1  = new Savings ("Jack Jones", "987654321", 2500);
//
//        savingsAccount1.compound();
//
//        savingsAccount1.showInfo();
//        System.out.println("*******");
//        checkingAccount1.showInfo();

        // Read CSV file and create new accounts based on that data
        String file = "/Users/guilherme.pinheiro/IdeaProjects/building-projects/bank_accounts.csv";
        List<String[]> newAccountHolders = utilities.CSV.read(file);

        String name;
        String sSN;
        String accountType;
        String initialDeposit;

        for (String[] accountHolder : newAccountHolders) {
            name = accountHolder[0];
            sSN = accountHolder[1];
            accountType = accountHolder[2];
            initialDeposit = accountHolder[3];

            if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, sSN, Double.parseDouble(initialDeposit)));
            }
            else if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, sSN, Double.parseDouble(initialDeposit)));
            }
            else {
                System.out.println("ERROR DETERMINING ACCOUNT TYPE");
            }

        }

        for (Account account : accounts) {
            System.out.println("************");
            account.showInfo();
        }

    }

}
