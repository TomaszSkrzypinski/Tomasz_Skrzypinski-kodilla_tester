package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuit {

    @Test
    public void totalBalance() {
         Bank bank = new Bank();
         int result = bank.getTotalBalance();
         assertEquals(0, result);
    }

    @Test
    public void numberOfAllNegativeTransactions() {
        Bank bank = new Bank();
        int result = bank.getNumberOfAllNegativeTransactions();
        assertEquals(5, result);
    }

    @Test
    public void zeroNegativeTransactions() {
        Bank bank = new Bank();
        int result = bank.zeroNegativeTransactions();
        assertEquals(0, result);
    }

    @Test
    public void zeroNegativeTransactions2() {
        Bank bank = new Bank();
        int result = bank.zeroNegativeTransactions2();
        assertEquals(0, result);
    }

    @Test
    public void oneNegativeTransactions() {
        Bank bank = new Bank();
        int result = bank.oneNegativeTransactions();
        assertEquals(1, result);
    }

    @Test
    public void numberOfAllPositiveTransactions() {
        Bank bank = new Bank();
        int result = bank.getNumberOfAllPositiveTransactions();
        assertEquals(5, result);
    }

    @Test
    public void zeroPositiveTransactions() {
        Bank bank = new Bank();
        int result = bank.zeroPositiveTransactions();
        assertEquals(0, result);
    }

    @Test
    public void zeroPositiveTransactions2() {
        Bank bank = new Bank();
        int result = bank.zeroPositiveTransactions2();
        assertEquals(0, result);
    }

    @Test
    public void onePositiveTransactions() {
        Bank bank = new Bank();
        int result = bank.onePositiveTransactions();
        assertEquals(1, result);
    }

    @Test
    public void averageNegativeTransactions() {
        Bank bank = new Bank();
        double result = bank.getAverageOfAllNegativeTransactions();
        assertEquals(-100.0, result);
    }

    @Test
    public void averageOfZeroNegativeTransactions() {
        Bank bank = new Bank();
        double result = bank.zeroNegativeTransactions();
        assertEquals(0, result);
    }

    @Test
    public void averageOfZeroNegativeTransactions2() {
        Bank bank = new Bank();
        double result = bank.zeroNegativeTransactions2();
        assertEquals(0.0, result);
    }

    @Test
    public void averagePositiveTransactions() {
        Bank bank = new Bank();
        double result = bank.getAverageOfAllPositiveTransactions();
        assertEquals(100.0, result);
    }

    @Test
    public void averageOfZeroPositiveTransactions() {
        Bank bank = new Bank();
        double result = bank.zeroPositiveTransactions();
        assertEquals(0, result);
    }

    @Test
    public void averageOfZeroPositiveTransactions2() {
        Bank bank = new Bank();
        double result = bank.zeroPositiveTransactions2();
        assertEquals(0.0, result);
    }

//    @Test
//    public void negativeTransactions() {
//        Bank bank = new Bank();
//        int result = bank.getBalanceOfAllNegativeTransactions();
//        assertEquals(-500,result);
//    }
//
//    @Test
//    public void positiveTransactions() {
//        Bank bank = new Bank();
//        int result = bank.getBalanceOfAllPositiveTransactions();
//        assertEquals(500,result);
//    }
}