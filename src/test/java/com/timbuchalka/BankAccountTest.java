package com.timbuchalka;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() throws Exception {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    private double deposit(double d, boolean b) {
        return 0;
    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    private double getBalance() {
        return 0;
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    private void withdraw(double d, boolean b) {
    }

    @org.junit.Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        assertTrue("The account is NOT a checking account", account.isChecking());

    }

    private boolean isChecking() {
        return false;
    }

}