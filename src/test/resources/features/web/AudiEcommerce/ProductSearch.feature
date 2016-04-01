@wip
Feature: I am able to search products in the audi e-commerce page
  As a customer
  I want to search the products that I want
  So that I can find it quickly

  Background:
    Given i am on "AUDI_HOME" page
    And i click the e-commerce link in the audi home page

  Scenario:Verify the product search in the audi e-commerce home page
    When i enter the product name or product keywords in the search box
      | Caps    |
      | Jackets |
    And i click on search icon
    Then the search results page is displayed

#  Scenario: Verify the store search in the audi e-commerce page
#    When i enter the store name or keywords in the search box
#    And I click on search icon
#    Then the search results page should displayed

