package org.iu.dspwa1022.oop.Bank;

public class Account {

    final String id;
    final String owner;
    final boolean allowNegativeBalance;
    private double balance = 0;

    protected static void dangerouslySetBalance(Account account, double balance) {
        account.balance = balance;
    }

    public Account(
            String id,
            String owner,
            boolean allowNegativeBalance) {
        this.id = id;
        this.owner = owner;
        this.allowNegativeBalance = allowNegativeBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public boolean allowedToWithdraw(double amount) {
        return true;
    }

}
