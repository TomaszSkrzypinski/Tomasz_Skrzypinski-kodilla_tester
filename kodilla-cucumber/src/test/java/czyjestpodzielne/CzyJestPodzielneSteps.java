package czyjestpodzielne;

import io.cucumber.java8.En;
import org.junit.Assert;

public class CzyJestPodzielneSteps implements En {
    private int liczba;
    private String odpowiedz;

    public CzyJestPodzielneSteps() {
       Given("sprawdz liczbe {int}", (Integer int1) -> {
            this.liczba = int1;
        });

       When("Sprawdz czy dzieli sie przez {int} lub {int}", (Integer int1, Integer int2) -> {
            CzyJestPodzielne czyJestPodzielne = new CzyJestPodzielne();
            this.odpowiedz = czyJestPodzielne.czyJestPodzielne(this.liczba);
        });

       Then("Jesli tak to {string}", (String string) -> {
            Assert.assertEquals(string, this.odpowiedz);
        });
    }
}