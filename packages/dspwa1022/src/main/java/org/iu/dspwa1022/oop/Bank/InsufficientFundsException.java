package org.iu.dspwa1022.oop.Bank;

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException() {
        super("Insufficient funds");
    }

}
