@ecomerch
Feature: YourAudi Changes
  As a customer
  I want my details kept in line in both YA and the Audi store whenever I update my details
  so that I don't have to manage my details twice

  Background:
    Given YourAudi, Audi Store, YourAudi User details, Audi Store User details

  Scenario Outline: Registered User from YourAudi to Audi Store
    When User change "<registereduserdetails>" on YourAudi
    Then "<registereduserdetails>" in Audi Store is updated in line

      Examples:
        | registereduserdetails |
        # - Name (excluding surname)
        # - Address
        # - email address
        # - Mobile number
        # - Password
        # - Marketing permissions

  Scenario Outline: Registered User from Audi Store to YourAudi
    When User change "<registereduserdetails>" on Audi Store
    Then "<registereduserdetails>" in YourAudi is updated in line

    Examples:
      | newuserdetails |
        # - Name (excluding surname)
        # - Address
        # - email address
        # - Mobile number
        # - Password
        # - Marketing permissions

  Scenario Outline: New User from YourAudi to Audi Store
    When User create "<newuserdetails>" on YourAudi
    Then "<newuserdetails>" is created in Audi Store

    Examples:
      | newuserdetails |
        # - Name (excluding surname)
        # - Address
        # - email address
        # - Mobile number
        # - Password
        # - Marketing permissions

  Scenario Outline: New User from Audi Store to YourAudi
    When User change "<newuserdetails>" on YourAudi
    Then "<newuserdetails>" is created in YourAudi

    Examples:
      | newuserdetails |
        # - Name (excluding surname)
        # - Address
        # - email address
        # - Mobile number
        # - Password
        # - Marketing permissions