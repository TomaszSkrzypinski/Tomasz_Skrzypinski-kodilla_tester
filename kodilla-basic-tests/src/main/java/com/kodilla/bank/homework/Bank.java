package com.kodilla.bank.homework;

public class Bank {

    public static void main(String[] args) {

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        CashMachine cashMachine4 = new CashMachine();
        CashMachine cashMachine5 = new CashMachine();

        CashMachine[] cashMachines = new CashMachine[5];
        cashMachines[0] = cashMachine1;
        cashMachines[1] = cashMachine2;
        cashMachines[2] = cashMachine3;
        cashMachines[3] = cashMachine4;
        cashMachines[4] = cashMachine5;

    }
}
