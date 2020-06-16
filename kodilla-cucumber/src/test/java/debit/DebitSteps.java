package debit;

import io.cucumber.java8.En;
import org.junit.Assert;
import wallet.TooMuchPayout;

public class DebitSteps implements En {

    private Debit debit = new Debit();
    private double totalBalance;

    public DebitSteps() {

        Given("my account has been credited with $100", () -> {
            debit.setDebit(100);
        });

        When("I check my balance", () -> {
            totalBalance = debit.getTotalBalance();
        });

        Then("I should see that my balance is $100", () -> {
            Assert.assertEquals(100, totalBalance, 0.01);
        });

        Given("my wallet has been credited with $100", () -> {
            debit.setDebit(100);
        });

        When("I withdraw $200", () -> {
            debit.withdraw(200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(100, debit.getTotalBalance(), 0.01);
        });

        Then("I should be {string}", (String string) -> {
            Assert.assertEquals(debit.getMessage(), string);
        });
    }
}
