package debit;

import wallet.TooMuchPayout;

public class Debit {

    private double balance = 0;
    private double debit = 0;
    private double totalBalance;

    public double getTotalBalance() {
        return totalBalance = balance + debit;
    }

    public void increaseBalance(double increase) {
        this.balance += increase;
    }

    public void decreaseBalance(double decrease) {
        this.balance -= decrease;
    }

    public void setDebit(double addDebit) {
        this.debit += addDebit;
    }

    public void withdraw(double withdraw) {
        if (balance >= withdraw) {
            this.decreaseBalance(withdraw);
        } else if (this.getTotalBalance() >= withdraw) {
            this.balance = 0;
            this.debit = this.totalBalance - withdraw;
        } else {
            System.out.println("You have insufficient funds in your account");
        }
    }
}
