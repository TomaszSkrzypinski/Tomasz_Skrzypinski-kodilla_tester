Feature: Czy jest podzielne?

  Scenario Outline: Czy dzieli się przez 3 lub 5
    Given <liczba>
    When Sprawdź czy dzieli się przez 3 lub 5
    Then Jeśli tak to <odpowiedź>
    Examples:
      | liczba | odpowiedź |
      | sprawdź liczbę 3 | "Fizz" |
      | sprawdź liczbę 5 |"Buzz" |
      | sprawdź liczbę 9 | "Fizz" |
      | sprawdź liczbę 10 | "Buzz" |
      | sprawdź liczbę 15 | "FizzBuzz" |
      | sprawdź liczbę 30 | "FizzBuzz" |
      | sprawdź liczbę 8 | "None" |
      | sprawdź liczbę 17 | "None" |