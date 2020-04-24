package com.kodilla.bank.homework;

public class Bank {

        CashMachine cashMachine1 = new CashMachine(new int[]{100, 100, 100, 100});
        CashMachine cashMachine2 = new CashMachine(new int[]{-100, -100, -100, -100});
        CashMachine cashMachine3 = new CashMachine(new int[]{});
        CashMachine cashMachine4 = new CashMachine(new int[]{100});
        CashMachine cashMachine5 = new CashMachine(new int[]{-100});

        CashMachine[] cashMachines = new CashMachine[] {cashMachine1,cashMachine2, cashMachine3, cashMachine4, cashMachine5};

    public int getTotalBalance() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getBalance();
        }
        return sum;
    }

    public int getNumberOfAllNegativeTransactions() {
        int number = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            number += cashMachines[i].getNumberOfNegativeTransactions();
        }
        return number;
    }

    public int zeroNegativeTransactions() {
        int number = 0;
            number += cashMachines[0].getNumberOfNegativeTransactions();
        return number;
    }

    public int zeroNegativeTransactions2() {
        int number = 0;
            number += cashMachines[2].getNumberOfNegativeTransactions();
        return number;
    }

    public int oneNegativeTransactions() {
        int number = 0;
        number += cashMachines[4].getNumberOfNegativeTransactions();
        return number;
    }

    public int getNumberOfAllPositiveTransactions() {
        int number = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            number += cashMachines[i].getNumberOfPositiveTransactions();
        }
        return number;
    }

    public int zeroPositiveTransactions() {
        int number = 0;
        number += cashMachines[1].getNumberOfPositiveTransactions();
        return number;
    }

    public int zeroPositiveTransactions2() {
        int number = 0;
        number += cashMachines[2].getNumberOfPositiveTransactions();
        return number;
    }

    public int onePositiveTransactions() {
        int number = 0;
        number += cashMachines[3].getNumberOfPositiveTransactions();
        return number;
    }

    public double getAverageOfAllNegativeTransactions() {
        double avg = getBalanceOfAllNegativeTransactions()/getNumberOfAllNegativeTransactions();
        return avg;
    }

    public double averageOfZeroNegativeTransactions() {
        double avg = zeroNegativeTransactions()/zeroNegativeTransactions();
        return avg;
    }

    public double averageOfZeroNegativeTransaction2() {
        double avg = zeroNegativeTransactions2()/zeroNegativeTransactions2();
        return avg;
    }

    public double getAverageOfAllPositiveTransactions() {
        double avg = getBalanceOfAllPositiveTransactions()/getNumberOfAllPositiveTransactions();
        return avg;
    }

    public double averageOfZeroPositiveTransactions() {
        double avg = zeroPositiveTransactions()/zeroPositiveTransactions();
        return avg;
    }

    public double averageOfZeroPositiveTransaction2() {
        double avg = zeroPositiveTransactions2()/zeroPositiveTransactions2();
        return avg;
    }

    public int getBalanceOfAllNegativeTransactions() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getBalanceOfNegativeTransactions();
        }
        return sum;
    }

    public int getBalanceOfAllPositiveTransactions() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getBalanceOfPositiveTransactions();
        }
        return sum;
    }

    public static void main(String[] args) {

        Bank bank = new Bank();

        System.out.println(bank.getTotalBalance());
        System.out.println(bank.getNumberOfAllPositiveTransactions());
        System.out.println(bank.getNumberOfAllNegativeTransactions());
        System.out.println(bank.getBalanceOfAllPositiveTransactions());
        System.out.println(bank.getBalanceOfAllNegativeTransactions());
        System.out.println(bank.getAverageOfAllPositiveTransactions());
        System.out.println(bank.getAverageOfAllNegativeTransactions());
    }
}