Feature: Transfer Funds

  Background:
    Given Navigate to the Website
    When Enter username and password to login

  Scenario: Money Transfer into the Website

    And Click on the Element in LeftNav
      | transferFunds |

    And User Sending the keys in DialogContent
      | amount | 100 |

    And Click on the Element in DialogContent
      | trnsfrBtn |

    And Click on the Element in DialogContent







