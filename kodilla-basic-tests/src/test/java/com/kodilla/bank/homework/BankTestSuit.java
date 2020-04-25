package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuit {

    Bank bank = new Bank();

    @Test
    public void checkTotalBalance() {
         int result = bank.getTotalBalance();
         assertEquals(0, result);
    }

    @Test
    public void checkHowManyNegativeTransactionsAreForAllCashMachines() {
        int result = bank.getNumberOfAllNegativeTransactions();
        assertEquals(5, result);
    }

    @Test
    public void checkIfThereIsNoNegativeTransactionsForSingleCashMachine() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[0].getNumberOfNegativeTransactions();
        assertEquals(0, result);
    }

    @Test
    public void checkIfThereIsNoNegativeTransactionsForSingleCashMachine2() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[2].getNumberOfNegativeTransactions();
        assertEquals(0, result);
    }

    @Test
    public void checkIfThereIsOneNegativeTransactionsForSingleCashMachine() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[4].getNumberOfNegativeTransactions();
        assertEquals(1, result);
    }

    @Test
    public void checkHowManyPositiveTransactionsAreForAllCashMachines() {
        Bank bank = new Bank();
        int result = bank.getNumberOfAllPositiveTransactions();
        assertEquals(5, result);
    }

    @Test
    public void checkIfThereIsNoPositiveTransactionsForSingleCashMachine() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[1].getNumberOfPositiveTransactions();
        assertEquals(0, result);
    }

    @Test
    public void checkIfThereIsNoPositiveTransactionsForSingleCashMachine2() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[2].getNumberOfPositiveTransactions();
        assertEquals(0, result);
    }

    @Test
    public void checkIfThereIsOnePositiveTransactionsForSingleCashMachine() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[3].getNumberOfPositiveTransactions();
        assertEquals(1, result);
    }

    @Test
    public void checkAverageNegativeTransactionsForAllCashMachines() {
        Bank bank = new Bank();
        double result = bank.getAverageOfAllNegativeTransactions();
        assertEquals(-100.0, result);
    }

    @Test
    public void checkBalanceOfZeroNegativeTransactionsForSingleCashMachine() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[0].getBalanceOfNegativeTransactions();
        assertEquals(0, result);
    }

    @Test
    public void checkBalanceOfZeroNegativeTransactionsForSingleCashMachine2() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[2].getBalanceOfNegativeTransactions();
        assertEquals(0, result);
    }

    @Test
    public void checkAveragePositiveTransactionsForAllCashMachines() {
        Bank bank = new Bank();
        double result = bank.getAverageOfAllPositiveTransactions();
        assertEquals(100.0, result);
    }

    @Test
    public void checkBalanceOfZeroPositiveTransactionsForSingleCashMachine() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[1].getBalanceOfPositiveTransactions();
        assertEquals(0, result);
    }

    @Test
    public void checkBalanceOfZeroPositiveTransactionsForSingleCashMachine2() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[2].getBalanceOfPositiveTransactions();
        assertEquals(0, result);
    }

//    @Test
//    public void negativeTransactions() {
//        int result = bank.getBalanceOfAllNegativeTransactions();
//        assertEquals(-500,result);
//    }
//
//    @Test
//    public void positiveTransactions() {
//        int result = bank.getBalanceOfAllPositiveTransactions();
//        assertEquals(500,result);
//    }
}