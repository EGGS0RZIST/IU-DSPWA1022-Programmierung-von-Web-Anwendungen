package org.iu.dspwa1022.oop.Bank;

import java.util.HashSet;
import java.util.Set;

public final class Bank {

    private final Set<Account> accounts = new HashSet<Account>();

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(Account account) {
        accounts.remove(account);
    }

    public double totalManagedMoney() {
        return -1;
    }

    public void transfer(Account from, Account to, double amount) {
        System.out.println("Will do that later");
    }

}
