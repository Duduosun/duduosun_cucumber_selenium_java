@ecomerch
Feature: Audi Product Details Page - Category and Search
  As a customer
  I want to see the details for the product I am interested in
  So that I can decide whether it is the product I want

  Background:
    Given AUDI Ecommerce Page

  Scenario: Navigate Simple Product
    When User Navigate Category
    And User Click Simple Product
    Then Audi PDP is Displayed

  Scenario: Navigate Configurable Product
    When User Navigate Category
    And User Click Configurable Product
    Then Audi PDP is Displayed

  Scenario: Navigate Audi Experience Product
    When User Navigate Category
    And User Click Audi Experience Product
    Then Audi PDP is Displayed

  Scenario: Search Simple Product
    When User Search Product
    And User Click Simple Product
    Then Audi PDP is Displayed

  Scenario: Search Configurable Product
    When User Search Product
    And User Click Configurable Product
    Then Audi PDP is Displayed

  Scenario: Search Audi Experience Product
    When User Search Product
    And User Click Audi Experience Product
    Then Audi PDP is Displayed