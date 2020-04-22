package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuit {

    @Test
    public void totalBalance() {
         Bank bank = new Bank();
         int result = bank.getTotalBalance();
         assertEquals(-750, result);
    }

    @Test
    public void negativeTransactions() {
        Bank bank = new Bank();
        int result = bank.getBalanceOfAllNegativeTransactions();
        assertEquals(-1900,result);
    }

    @Test
    public void positiveTransactions() {
        Bank bank = new Bank();
        int result = bank.getBalanceOfAllPositiveTransactions();
        assertEquals(1150,result);
    }

    @Test
    public void averageNegativeTransactions() {
        Bank bank = new Bank();
        double result = bank.getAverageOfAllNegativeTransactions();
        assertEquals(-158.0, result);
    }

    @Test
    public void averagePositiveTransactions() {
        Bank bank = new Bank();
        double result = bank.getAverageOfAllPositiveTransactions();
        assertEquals(143.0, result);
    }
}
