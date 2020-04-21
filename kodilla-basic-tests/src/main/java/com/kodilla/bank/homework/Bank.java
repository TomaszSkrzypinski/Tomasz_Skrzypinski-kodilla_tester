package com.kodilla.bank.homework;

public class Bank {


        CashMachine cashMachine1 = new CashMachine(new int[]{150, 50, -200, -50});
        CashMachine cashMachine2 = new CashMachine(new int[]{250, 150, -250, -200});
        CashMachine cashMachine3 = new CashMachine(new int[]{100, 250, -150, -100});
        CashMachine cashMachine4 = new CashMachine(new int[]{200, 200, -100, -250});
        CashMachine cashMachine5 = new CashMachine(new int[]{100, 100, -50, -250});

        CashMachine[] cashMachines = new CashMachine[] {cashMachine1,cashMachine2, cashMachine3, cashMachine4, cashMachine5};

    public int getTotalBalance() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            for(int e = 0; e < cashMachines[e].length; e ++) //tu mam problem
                sum = sum + cashMachine[e]; //i tu mam problem
            }
        return sum;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
       // System.out.println(bank.getTotalBalance());
        System.out.println(bank.cashMachines[3]);
    }
}