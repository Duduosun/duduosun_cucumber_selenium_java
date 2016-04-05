Feature: Access all Audi Applications
  As a Customer
  I want to trigger all Audi Applications CTA from Home Page
  So I can access all Audi Applications

  Background:
    Given AUDI HOME Page

  @env @audiappcta
    Scenario: Book Service and MOT

    When User Click Book Service CTA
    Then Book Appointment AUDI App is triggered

  @env @audiappcta
     Scenario: Book Repair
     When User Click Book Repair CTA
     Then Book Appointment AUDI App is triggered

  @env @audiappcta
      Scenario:How To Videos
      When User Click How To Video CTA
      Then Owners Area Get to Know your AUDI is triggered

  @env @audiappcta
    Scenario: Audi Tyres
    When User Click Audi Tyres CTA
    Then AUDI Tyres App is triggered

  @env @audiappcta
    Scenario: Service Price Match
    When User Click Service Price Match CTA
    Then Owner Area AUDI Service Price Match App is triggered

  @env @audiappcta
    Scenario: Part Exchange
    When User Click Part Exchange CTA
    Then Value Your Vehicle App is triggered