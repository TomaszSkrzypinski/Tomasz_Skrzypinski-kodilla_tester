Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Successful withdrawal from a wallet 2
    Given I have deposited $200 in my wallet
    When I request $200
    Then $200 should be dispensed
    And the balance of my wallet should be $0

  Scenario: Unsuccessful withdrawal from a wallet
    Given I have deposited $200 in my wallet
    When I request $210
    Then $210 should be dispensed
    And the balance of my wallet should be $-10

  Scenario: Unsuccessful deposited in a wallet
    Given I have deposited $-200 in my wallet
    When I request $50
    Then $50 should be dispensed
    And the balance of my wallet should be $-250