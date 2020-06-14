//package debit;
//
//import wallet.TooMuchPayout;
//
//public class Debit {
//
//    private double balance = 0;
//    private double debit = 0;
//    private double totalBalance = balance + debit;
//
//    Debit object = new Debit();
//
//    public double getTotalBalance() {
//        return totalBalance;
//    }
//
//    public void increaseBalance(double increase) {
//        this.balance += increase;
//    }
//
//    public void decreaseBalance(double decrease) {
//        this.balance -= decrease;
//    }
//
//    public void setDebit(double addDebit) {
//        this.debit += addDebit;
//    }
//
//    public void withdraw(double withdraw) {
//        if (balance >= withdraw) {
//            object.decreaseBalance(withdraw);
//        } else if (totalBalance >= withdraw) {
//            this.balance = 0;
//            this.debit = totalBalance - withdraw;
//        } else {
//            System.out.println("You have insufficient funds in your account");
//        }
//    }
//}
