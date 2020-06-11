Feature: Czy jest podzielne?

  Scenario Outline: Czy dzieli sie przez 3 lub 5
    Given sprawdz liczbe <liczba>
    When Sprawdz czy dzieli sie przez 3 lub 5
    Then Jesli tak to <odpowiedz>
    Examples:
      | liczba | odpowiedz |
      | 3 | "Fizz" |
      | 5 |"Buzz" |
      | 9 | "Fizz" |
      | 10 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 30 | "FizzBuzz" |
      | 8 | "None" |
      | 17 | "None" |