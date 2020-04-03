package com.kodilla.bank.homework;

public class CashMachine {

    int [] cashMachine = new int [] {100, -200, 200, -50};

    public int getBalance() {
        int sum = 0;
        for(int i = 0; i < cashMachine.length; i ++){
            sum = sum + cashMachine[i];
        }
        return sum;
    }

    public int getNumberOfTransactions () {
        int numberOfElements = cashMachine.length;
        return numberOfElements;
    }

    public static void main(String[] args) {

        CashMachine machine = new CashMachine();
        System.out.println("Liczba transakcji wynosi " + machine.getNumberOfTransactions());
        System.out.println("Saldo bankomatu wynosi " + machine.getBalance());

    }
}



