@wip
Feature: Audi product list page
  As a customer
  I want to choose whether I want to see product lists presented as a list or a grid view
  So that I can see it in a way that works for me

  Background:
    Given i am on "AUDI_HOME" page
    And i click the audi ecommerce link in the audi home page


  Scenario: Navigate to product list page
    When i hover on "women" menu
    Then the list of values should get displayed
      | T-shirts, polos and blouses |
      | Jackets and fleeces         |
      | Caps, gloves and scarves    |
      | View all                    |
    When i click on "T-shirts, polos and blouses" menu
    Then i should be navigated to "T-shirts, polos and blouses" page


  Scenario Outline: Verifying the sort results functionality in the product list page
    When i hover on "<category>" menu
    And i cilck on "<sub category>" menu
    Then i should be navigated to "<sub category>" page
    When i selects "<product name>" option from sort by list
    Then the products on the page should be displayed in sorted by "<product name>"
    When i selects "<price>" as high to low or low to high from sort by list
    Then the products on the page should be displayed in sorted by "<price>"
    When i selects "<relevant>" option from sort by list
    Then the products on the page should be displayed in sorted by most "<relevant>"
    When i selects "<colour>" option from the left hand side menu
    Then the products on the page should be displayed in given "<colour>"
    When i selects "<style>" option from the left hand side menu in the product list page
    Then the products on the page should be displayed in given "<style>"
    Examples:
      | category | sub category                | product name | price | relevant | colour | style |
      | Women    | T-shirts, polos and blouses | XXX          | XXX   | XXXX     | XXXX   | XXXX  |
      | Men      | Jackets and fleeces         | XXX          | XXX   | XXXX     | XXXX   | XXXX  |
      | Kids     | Toys                        | XXX          | XXX   | XXXX     | XXXX   | XXXX  |




