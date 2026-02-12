package org.java.POO.herance;

public class Account {

    private Integer number;
    private String holder;
    protected Double balance;

    public Account(){}

    public Account(Double balance, String holder, Integer number) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount){
        balance -= amount - 5.0;
    }

}
