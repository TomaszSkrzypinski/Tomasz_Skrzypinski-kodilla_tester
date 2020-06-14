package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {
    }

    public void deposit (int money) {
        if (money <= 0) {
            this.balance = balance;
        } else {
        this.balance += money;}
    }

    public int getBalance() {
        return balance;
    }

    public void debit(int money) {
        if (money > balance) {
            this.balance = balance;
        } else {
            this.balance -= money;
        }
    }
}
