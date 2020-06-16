package debit;

import wallet.TooMuchPayout;

public class Debit {

    private double balance = 0;
    private double debit = 0;
    private double totalBalance;
    private String message;

    public double getTotalBalance() {
        return totalBalance = balance + debit;
    }

    public String getMessage() {
        return message;
    }

    public void setDebit(double addDebit) {
        this.debit += addDebit;
    }

    public void increaseBalance(double increase) {
        this.balance += increase;
    }

    public void decreaseBalance(double decrease) {
        this.balance -= decrease;
    }


    public void withdraw(double withdraw) {
        if (balance >= withdraw) {
            this.decreaseBalance(withdraw);
        } else if (this.getTotalBalance() >= withdraw) {
            this.balance = 0;
            this.debit = this.totalBalance - withdraw;
        } else {
            message = "You have insufficient funds in your account";
            System.out.println(message);
        }
    }
}
