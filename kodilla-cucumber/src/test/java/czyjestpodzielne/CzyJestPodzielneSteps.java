package czyjestpodzielne;

import io.cucumber.java8.En;
import org.junit.Assert;

public class CzyJestPodzielneSteps implements En {
    private int liczba;
    private String odpowiedź;

    public CzyJestPodzielneSteps() {
       Given("sprawdź liczbę {int}", (Integer int1) -> {
            this.liczba = 3;
        });

       Given("sprawdź liczbę {int}", (Integer int1) -> {
            this.liczba = 5;
        });

       Given("sprawdź liczbę {int}", (Integer int1) -> {
            this.liczba = 9;
        });

       Given("sprawdź liczbę {int}", (Integer int1) -> {
            this.liczba = 10;
        });

       Given("sprawdź liczbę {int}", (Integer int1) -> {
            this.liczba = 15;
        });

       Given("sprawdź liczbę {int}", (Integer int1) -> {
            this.liczba = 30;;
        });

       Given("sprawdź liczbę {int}", (Integer int1) -> {
            this.liczba = 8;
        });

       Given("sprawdź liczbę {int}", (Integer int1) -> {
            this.liczba = 17;
        });

       When("Sprawdź czy dzieli się przez {int} lub {int}", (Integer int1, Integer int2) -> {
            CzyJestPodzielne czyJestPodzielne = new CzyJestPodzielne();
            this.odpowiedź = czyJestPodzielne.czyJestPodzielne(this.liczba);
        });

       Then("Jeśli tak to {string}", (String string) -> {
            Assert.assertEquals(string, this.odpowiedź);
        });
    }
}
