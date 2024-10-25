Feature: Account Creation Functionality

  Background:
    Given Navigate to the Website
    When Enter username and password to login

  @SmokeTest @RegressionTest
  Scenario Outline: Open a Bank Account

    And Click on the Element in LeftNav
      | openNewAccount |
    And The user is directed to the bank account opening page

    And The user selects the account type as "<name>" from the drop-down menu

    And  The user receives a warning that the new bank account must have a minimum balance

    And The user selects the account of <num>  the minimum balance from the drop-down menu

    And Click on the Element in LeftNav
      | openNewAccount |
    Then The user confirms that their account has been created and sees the account number.

    Examples:
      | name        | num |
      | CHECKING    | 0     |
      | SAVINGS     | 1     |