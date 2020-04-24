package com.kodilla.bank.homework;

import java.util.Arrays;

public class CashMachine {

    private int [] cashMachine;

    public CashMachine(int[] cashMachine) {
        this.cashMachine = cashMachine;
    }

    public int[] getCashMachine() {
        return cashMachine;
    }

    public int getBalance() {
        int sum = 0;
        for(int i = 0; i < cashMachine.length; i ++){
            sum = sum + cashMachine[i];
        }
        return sum;
    }

    public int getBalanceOfPositiveTransactions() {
        int sum = 0;
        for(int i = 0; i < cashMachine.length; i ++){
            if(cashMachine[i] > 0)
            sum = sum + cashMachine[i];
        }
        return sum;
    }

    public int getBalanceOfNegativeTransactions() {
        int sum = 0;
        for(int i = 0; i < cashMachine.length; i ++){
            if(cashMachine[i] < 0)
                sum = sum + cashMachine[i];
        }
        return sum;
    }

    public int getNumberOfPositiveTransactions() {
        int number = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            if (cashMachine[i] > 0)
                number++;
        }
        return number;
    }

    public int getNumberOfNegativeTransactions() {
        int number = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            if (cashMachine[i] < 0)
                number++;
        }
        return number;
    }


    public int getNumberOfTransactions () {
        int numberOfElements = cashMachine.length;
        return numberOfElements;
    }

    @Override
    public String toString() {
        return "CashMachine{" +
                Arrays.toString(cashMachine) +
                '}';
    }

    public static void main(String[] args) {

        CashMachine machine = new CashMachine(new int[] {50,150,-250,55});
        System.out.println("Liczba transakcji wynosi " + machine.getNumberOfTransactions());
        System.out.println("Saldo bankomatu wynosi " + machine.getBalance());

    }
}



