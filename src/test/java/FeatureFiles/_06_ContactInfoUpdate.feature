Feature: Update Contact Functionality

  Background:
    Given Navigate to the Website


  @SmokeTest
  Scenario: Update Contact Info (Positive)

    And User Sending the keys in LeftNav
      | username | gizem |
      | password | 123   |

    And Click on the Element in LeftNav
      | login             |
      | updateContactInfo |

    And User Sending the keys in DialogContent
      | firstname | test1     |
      | lastname  | test2     |
      | address   | canada    |
      | city      | London    |
      | state     | New York  |
      | zipCode   | 984835    |
      | phone     | +61455676 |

    And Click on the Element in DialogContent
      | updateButton |

    And Successfully updated message should be displayed

    And Click on the Element in LeftNav
      | logout |

    And User Sending the keys in LeftNav
      | username | gizem |
      | password | 123   |

    Then User verifies update


  @SmokeTest
  Scenario: Update Contact Info (Negative)

    And User Sending the keys in LeftNav
      | username | gizem |
      | password | 123   |

    And Click on the Element in LeftNav
      | login             |
      | updateContactInfo |

    And User Sending the keys in DialogContent
      | firstname |  |
      | lastname  |  |
      | city      |  |

    And Error messages should be displayed

    Then User verifies non-update