package com.kodilla.bank.homework;

public class Bank {

        CashMachine cashMachine1 = new CashMachine(new int[]{150, 100, -150, -200});
        CashMachine cashMachine2 = new CashMachine(new int[]{100, 100, -100, -200});
        CashMachine cashMachine3 = new CashMachine(new int[]{150, 250, -150, -100});
        CashMachine cashMachine4 = new CashMachine(new int[]{150, 200, -150, -250});
        CashMachine cashMachine5 = new CashMachine(new int[]{100, 100, -100, -250});

        CashMachine[] cashMachines = new CashMachine[] {cashMachine1,cashMachine2, cashMachine3, cashMachine4, cashMachine5};

    public int getTotalBalance() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getBalance();
        }
        return sum;
    }

    public double getAverageOfAllPositiveTransations() {
        double avg = getBalanceOfAllPositiveTransactions()/getNumberOfAllPositiveTransactions();
        return avg;
    }

    public double getAverageOfAllNegativeTransations() {
        double avg = getBalanceOfAllNegativeTransactions()/getNumberOfAllNegativeTransactions();
        return avg;
    }

    public int getBalanceOfAllPositiveTransactions() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getBalanceOfPositiveTransaction();
        }
        return sum;
    }

    public int getBalanceOfAllNegativeTransactions() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getBalanceOfNegativeTransaction();
        }
        return sum;
    }

    public int getNumberOfAllPositiveTransactions() {
        int number = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            number += cashMachines[i].getNumberOfPositiveTransactions();
        }
        return number;
    }

    public int getNumberOfAllNegativeTransactions() {
        int number = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            number += cashMachines[i].getNumberOfNegativeTransactions();
        }
        return number;
    }

    public static void main(String[] args) {

        Bank bank = new Bank();

        System.out.println(bank.getTotalBalance());
        System.out.println(bank.getNumberOfAllPositiveTransactions());
        System.out.println(bank.getNumberOfAllNegativeTransactions());
        System.out.println(bank.getBalanceOfAllPositiveTransactions());
        System.out.println(bank.getBalanceOfAllNegativeTransactions());
        System.out.println(bank.getAverageOfAllPositiveTransations());
        System.out.println(bank.getAverageOfAllNegativeTransations());
    }
}