@ecomerch
  Feature: Password Recovery
    As a customer
    I want to recover my password when I have forgotten it
    so that I can access my account

  Background:
    Given Audi Store Sign in Page

  Scenario: User Provide Password Recovery Email
    When User click on 'forgot your password?'
    Then User has ability to enter email address


  Scenario: User Receive Password Recovery CTA
    When User click submit CTA
    Then Message displayed to say a link will be sent to User's email address
    And User receives an email offering a link to allow User change password


  Scenario: Recovered Password Functions
    When User click on link to change password
    Then New Password works on YourAudi
    And New Password works on Audi Store