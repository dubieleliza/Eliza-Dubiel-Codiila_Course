package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public int getTotalBalance() {
        int total = 0;
        for (CashMachine cm : cashMachines) {
            total += cm.getBalance();
        }
        return total;
    }

    public int getTotalDepositsCount() {
        int count = 0;
        for (CashMachine cm : cashMachines) {
            count += cm.getNumberOfDeposits();
        }
        return count;
    }

    public int getTotalWithdrawalsCount() {
        int count = 0;
        for (CashMachine cm : cashMachines) {
            count += cm.getNumberOfWithdrawals();
        }
        return count;
    }

    public double getAverageDeposit() {
        int sum = 0;
        int count = 0;
        for (CashMachine cm : cashMachines) {
            for (int t : cm.getTransactions()) {
                if (t > 0) {
                    sum += t;
                    count++;
                }
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    public double getAverageWithdrawal() {
        int sum = 0;
        int count = 0;
        for (CashMachine cm : cashMachines) {
            for (int t : cm.getTransactions()) {
                if (t < 0) {
                    sum += t;
                    count++;
                }
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }
}
