package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldCalculateTotalBalanceAndAverages() {
        CashMachine cm1 = new CashMachine();
        cm1.addTransaction(100);
        cm1.addTransaction(-50);

        CashMachine cm2 = new CashMachine();
        cm2.addTransaction(200);
        cm2.addTransaction(-30);

        Bank bank = new Bank(new CashMachine[]{cm1, cm2});

        assertEquals(220, bank.getTotalBalance());
        assertEquals(2, bank.getTotalDepositsCount());
        assertEquals(2, bank.getTotalWithdrawalsCount());
        assertEquals(150.0, bank.getAverageDeposit(), 0.01);
        assertEquals(-40.0, bank.getAverageWithdrawal(), 0.01);
    }

    @Test
    public void shouldHandleEmptyBank() {
        Bank bank = new Bank(new CashMachine[]{});
        assertEquals(0, bank.getTotalBalance());
        assertEquals(0, bank.getTotalDepositsCount());
        assertEquals(0, bank.getTotalWithdrawalsCount());
        assertEquals(0, bank.getAverageDeposit(), 0.01);
        assertEquals(0, bank.getAverageWithdrawal(), 0.01);
    }
}
