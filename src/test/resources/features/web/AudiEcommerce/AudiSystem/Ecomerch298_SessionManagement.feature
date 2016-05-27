@ecomerch
  Feature: Session Management Timeout
    As a user
    I want the system to see that I am logged in and active between YA and the store
    so that I don't keep getting timed out

  Background:
    Given YourAudi, Audi Store, YourAudi User details, Audi Store User details

  Scenario Outline:
    When Customer is logged into Audi Store
    Then Customer is active on YourAudi
    And Customer is active on Audi Store

  Scenario Outline:
    When Customer is logged into YourAudi
    Then Customer is active on YourAudi
    And Customer is active on Audi Store

  Scenario Outline:
    When Customer is inactive for more than 20 minutes on Audi Store
    Then Customer is logged out of Audi Store
    And Customer is logged out of YourAudi

  Scenario Outline:
    When Customer is inactive for more than 20 minutes on YourAudi
    Then Customer is logged out of Audi Store
    And Customer is logged out of YourAudi