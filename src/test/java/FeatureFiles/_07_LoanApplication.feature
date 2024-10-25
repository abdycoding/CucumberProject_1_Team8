Feature: Request Loan Functionality

  Background:
    Given Navigate to the Website
    When Enter username and password to login

    Scenario: Request Loan
      When User clicks on Request Loan link
      Then User applies for loan
      Then User validates Loan Request Processed fields
      Then User validates approval message
      Then User clicks on the credit account number link
      Then User validates information under Account Details
      And User validates message under Account Activity





