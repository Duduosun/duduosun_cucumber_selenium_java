Feature: As a Customer I want to check if Sainsburys Groceries deliver to my Postcode
  Scenario: Do we Deliver to you
    Given Sainsburys GOL
    When I enter valid shopping area postcode
    And click Check postcode CTA
    Then Good News Page is displayed

