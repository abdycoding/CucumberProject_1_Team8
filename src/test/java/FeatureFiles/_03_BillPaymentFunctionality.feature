Feature: Payment Functuanility

  @SmokeTest @RegressionTest
  Scenario: Pay the Bills
    Given Navigate to the Website
    When Enter username and password to login
    And User Sending the keys in DialogContent_three
    Then success message should display

