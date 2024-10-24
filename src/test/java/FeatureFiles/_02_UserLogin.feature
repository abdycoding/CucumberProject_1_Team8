Feature: Login Functionality

  Background:
    Given Navigate to the Website
    When Enter username and password to login
    Then Success message should be displayed

  Scenario: Login in to the Website

    And Enter username and password to login
      | userName |
      | password |

    And Click on the Element in LeftNav
      | login |

    Then success message should be displayed

