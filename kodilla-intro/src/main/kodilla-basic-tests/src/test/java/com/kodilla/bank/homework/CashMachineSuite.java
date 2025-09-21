package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineSuite {

    @Test
    public void shouldAddTransactionsAndCalculateBalance() {
        CashMachine cm = new CashMachine();
        cm.addTransaction(100);
        cm.addTransaction(-50);
        cm.addTransaction(200);

        assertEquals(3, cm.getNumberOfTransactions());
        assertEquals(250, cm.getBalance());
        assertEquals(2, cm.getNumberOfDeposits());
        assertEquals(1, cm.getNumberOfWithdrawals());
        assertEquals(150.0, cm.getAverageDeposit(), 0.01);
        assertEquals(-50.0, cm.getAverageWithdrawal(), 0.01);
    }

    @Test
    public void averagesShouldBeZeroIfNoTransactions() {
        CashMachine cm = new CashMachine();
        assertEquals(0, cm.getAverageDeposit(), 0.01);
        assertEquals(0, cm.getAverageWithdrawal(), 0.01);
    }
}