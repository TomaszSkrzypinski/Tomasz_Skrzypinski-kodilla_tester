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
            Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance());;
        });

        When("I request $210", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 210);
        });

        Then("$210 should be dispensed", () -> {
            Assert.assertEquals(210, cashSlot.getContents());;
        });

        Then("the balance of my wallet should be $-10", () -> {
            Assert.assertEquals("Incorrect wallet balance", -10, wallet.getBalance());;
        });

        Given("I have deposited $-200 in my wallet", () -> {
            wallet.deposit(-200);
            Assert.assertEquals("Incorrect wallet balance",-200, wallet.getBalance());
        });

        When("I request $50", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 50);
        });
        Then("$50 should be dispensed", () -> {
            Assert.assertEquals(50, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $-250", () -> {
            Assert.assertEquals("Incorrect wallet balance", -250, wallet.getBalance());
        });
    }
}
