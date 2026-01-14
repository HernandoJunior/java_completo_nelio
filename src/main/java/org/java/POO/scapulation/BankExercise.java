package org.java.POO.scapulation;

import java.util.Scanner;

public class BankExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AccountBank accountBank = new AccountBank();
        double initialDepositValue, withdrawValue;

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();
        accountBank.setNumberAccount(accountNumber);

        System.out.print("Enter account holder: ");
        String accountName = sc.nextLine();
        accountBank.setHolder(accountName);

        System.out.print("Is there an initial deposit? (y / n)");
        String initialDeposit = sc.nextLine();


        if (initialDeposit.toLowerCase().contains("y")){
            System.out.println("Enter initial deposit value: ");
            initialDepositValue = sc.nextDouble();
            accountBank.setValueInitialAccount(initialDepositValue);
        }

        System.out.println(accountBank);

        System.out.print("Enter deposit value: ");
        initialDepositValue = sc.nextDouble();
        accountBank.deposit(initialDepositValue);

        System.out.println(accountBank);

        System.out.print("Enter withdraw value: ");
        withdrawValue = sc.nextDouble();
        accountBank.withdraw(withdrawValue);

        System.out.println(accountBank);
    }
}
