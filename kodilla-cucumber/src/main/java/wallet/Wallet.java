package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {
    }

    public void deposit (int money) throws IncorrectDepositValue {
        if (money <= 0) {
            throw new IncorrectDepositValue(); }
        else {
        this.balance += money;}
    }

    public int getBalance() {
        return balance;
    }

    public void debit(int money) throws TooMuchPayout {
        if (money > balance)
            throw new TooMuchPayout();
        this.balance -= money;
    }
}
