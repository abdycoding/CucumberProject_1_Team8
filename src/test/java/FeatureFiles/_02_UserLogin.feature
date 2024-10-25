Feature: Login Functionality

  @SmokeTest @RegressionTest
  Scenario: Login to the website

    Given Navigate to the Website
    When Enter username and password to login
    Then success message should be displayed
    And Navigate to the Website
    When Enter wrong username or password to login
    Then success message should not be displayed

