package org.java.POO.herance;

public class SavingAccount extends Account{
    private Double interestRate;

    public SavingAccount(){}
    public SavingAccount(Double balance, String holder, Integer number, Double interestRate) {
        super(balance, holder, number);
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(Double amount){
        balance -= amount;
    }
}
