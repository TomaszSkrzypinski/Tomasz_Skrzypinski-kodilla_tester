package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuit {

    Bank bank = new Bank();

    @Test
    public void totalBalance() {
         int result = bank.getTotalBalance();
         assertEquals(0, result);
    }

    @Test
    public void numberOfAllNegativeTransactions() {
        int result = bank.getNumberOfAllNegativeTransactions();
        assertEquals(5, result);
    }

    @Test
    public void numberOfZeroNegativeTransactions() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[0].getNumberOfNegativeTransactions();
        assertEquals(0, result);
    }

    @Test
    public void numberOfZeroNegativeTransactions2() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[2].getNumberOfNegativeTransactions();
        assertEquals(0, result);
    }

    @Test
    public void oneNegativeTransactions() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[4].getNumberOfNegativeTransactions();
        assertEquals(1, result);
    }

    @Test
    public void numberOfAllPositiveTransactions() {
        Bank bank = new Bank();
        int result = bank.getNumberOfAllPositiveTransactions();
        assertEquals(5, result);
    }

    @Test
    public void numberOfZeroPositiveTransactions() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[1].getNumberOfPositiveTransactions();
        assertEquals(0, result);
    }

    @Test
    public void numberOfZeroPositiveTransactions2() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[2].getNumberOfPositiveTransactions();
        assertEquals(0, result);
    }

    @Test
    public void onePositiveTransactions() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[3].getNumberOfPositiveTransactions();
        assertEquals(1, result);
    }

    @Test
    public void averageNegativeTransactions() {
        Bank bank = new Bank();
        double result = bank.getAverageOfAllNegativeTransactions();
        assertEquals(-100.0, result);
    }

    @Test
    public void balanceOfZeroNegativeTransactions() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[0].getBalanceOfNegativeTransactions();
        assertEquals(0, result);
    }

    @Test
    public void balanceOfZeroNegativeTransactions2() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[2].getBalanceOfNegativeTransactions();
        assertEquals(0, result);
    }

    @Test
    public void averagePositiveTransactions() {
        Bank bank = new Bank();
        double result = bank.getAverageOfAllPositiveTransactions();
        assertEquals(100.0, result);
    }

    @Test
    public void balanceOfZeroPositiveTransactions() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[1].getBalanceOfPositiveTransactions();
        assertEquals(0, result);
    }

    @Test
    public void balanceOfZeroPositiveTransactions2() {
        CashMachine[] cashMachines = bank.getCashMachines();
        int result = cashMachines[2].getBalanceOfPositiveTransactions();
        assertEquals(0, result);
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