Feature: Registration Functionality

  Background:
    Given Navigate to the Website

  @SmokeTest @RegressionTest
  Scenario: Register into the Website

    And Click on the Element in LeftNav
      | register |


    And User Sending the keys in DialogContent
      | firstName   | Cris                          |
      | lastName    | Leo                           |
      | address     | Bristol Street. ApartMent 2/5 |
      | city        | London                        |
      | state       | CaliforNia                    |
      | zipCode     | 663200                        |
      | phoneNumber | +614589652636                 |
      | ssn         | 9968553                       |
      | userName    | Rashy9                        |
      | password    | Invincibles                   |
      | confirm     | Invincibles                   |

    And Click on the Element in DialogContent
      | registerDC |

    Then Success message should be displayed