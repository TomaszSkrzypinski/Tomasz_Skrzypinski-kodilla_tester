package czyjestpodzielne;

import io.cucumber.java8.En;
import org.junit.Assert;

public class CzyJestPodzielneSteps implements En {
    private int liczba;
    private String odpowiedź;

    public CzyJestPodzielneSteps() {
        Given("sprawdź liczbę 3", () -> {
            this.liczba = 3;
        });

        Given("sprawdź liczbę 5", () -> {
            this.liczba = 5;
        });

        Given("sprawdź liczbę 9", () -> {
            this.liczba = 9;
        });

        Given("sprawdź liczbę 10", () -> {
            this.liczba = 10;
        });

        Given("sprawdź liczbę 15", () -> {
            this.liczba = 15;
        });

        Given("sprawdź liczbę 30", () -> {
            this.liczba = 30;;
        });

        Given("sprawdź liczbę 8", () -> {
            this.liczba = 8;
        });

        Given("sprawdź liczbę 17", () -> {
            this.liczba = 17;
        });

        When("Sprawdź czy dzieli się przez 3 lub 5", () -> {
            CzyJestPodzielne czyJestPodzielne = new CzyJestPodzielne();
            this.odpowiedź = czyJestPodzielne.czyJestPodzielne(this.liczba);
        });

        Then("Jeśli tak to {string}", (String string) -> {
            Assert.assertEquals(string, this.odpowiedź);
        });


    }
}
