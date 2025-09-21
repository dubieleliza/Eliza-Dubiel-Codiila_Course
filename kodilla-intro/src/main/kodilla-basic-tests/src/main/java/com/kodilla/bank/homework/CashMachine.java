package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void addTransaction(int value) {
        this.size++;
        int[] newTransactions = new int[this.size];
        System.arraycopy(transactions, 0, newTransactions, 0, transactions.length);
        newTransactions[this.size - 1] = value;
        this.transactions = newTransactions;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getBalance() {
        int sum = 0;
        for (int t : transactions) {
            sum += t;
        }
        return sum;
    }

    public int getNumberOfTransactions() {
        return transactions.length;
    }

    public int getNumberOfDeposits() {
        int count = 0;
        for (int t : transactions) {
            if (t > 0) count++;
        }
        return count;
    }

    public int getNumberOfWithdrawals() {
        int count = 0;
        for (int t : transactions) {
            if (t < 0) count++;
        }
        return count;
    }

    public double getAverageDeposit() {
        int sum = 0;
        int count = 0;
        for (int t : transactions) {
            if (t > 0) {
                sum += t;
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    public double getAverageWithdrawal() {
        int sum = 0;
        int count = 0;
        for (int t : transactions) {
            if (t < 0) {
                sum += t;
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }
}
