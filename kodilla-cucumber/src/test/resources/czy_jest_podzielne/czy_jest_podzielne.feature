Feature: Czy jest podzielne?

  Scenario Outline: Czy dzieli się przez 3 lub 5
    Given sprawdź liczbę <liczba>
    When Sprawdź czy dzieli się przez 3 lub 5
    Then Jeśli tak to <odpowiedź>
    Examples:
      | liczba | odpowiedź |
      | 3 | "Fizz" |
      | 5 |"Buzz" |
      | 9 | "Fizz" |
      | 10 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 30 | "FizzBuzz" |
      | 8 | "None" |
      | 17 | "None" |