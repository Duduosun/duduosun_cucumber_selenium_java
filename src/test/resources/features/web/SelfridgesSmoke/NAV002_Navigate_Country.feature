@ChangeRequired
  Feature: NAVIGATE COUNTRY - As a user of Selfridges website, I want to navigate to different Shopping Locations
    Scenario Outline: Selfridges Shopping Locations - Countries
      Given Selfridges Home Page
      When User Click Country Tab
      Then User is taken to Location Preference Module
      And User Can View Shopping Locations "<Country>"

      Examples:
        | Country |
        | Australia |
        | Saudi Arabia |
        | Netherlands |