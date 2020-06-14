package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
         wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance",200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
        });

        When("I request $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);
        });

        Then("$200 should be dispensed", () -> {
            Assert.assertEquals(200, cashSlot.getContents());;
        });

        Then("the balance of my wallet should be $0", () -> {
            Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance());
        });

        When("I request $210", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 0);
        });

        Then("TooMuchPayout", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $200", () -> {
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        Given("I have deposited $-200 in my wallet", () -> {
            wallet.deposit(-200);
            Assert.assertEquals("Incorrect wallet balance",0, wallet.getBalance());
        });

        Then("IncorrectDepositValue", () -> {

        });

        Then("the balance of my wallet not change", () -> {
            Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance());
        });
    }
}
