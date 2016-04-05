Feature: Audi Ecommerce Illustrative Entry Points
  As Audi Customer
  I want to trigger Ecommerce Entry Points
  So that I can access all Ecommerce Entry Points

Background:
  Given AUDI HOME Page

Scenario: Home Page Entry Point
  When User Click Stores CTA
  Then Audi Ecommerce Landing Page is returned

Scenario: Model Pages Entry Point
  And Audi Model Page
  When User Click Add to my shortlist CTA
  Then Audi Ecommerce Landing Page is returned

Scenario: Driving Experience Entry Point
  And Audi Driving Experience Page
  When User Click Buy Experience CTA
  Then  Audi Ecommerce Landing Page is returned

Scenario: Audi Sport Entry Point
  And Audi Sport Page
  When User Click Featured Products
  Then Audi Ecommerce Landing Page is returned