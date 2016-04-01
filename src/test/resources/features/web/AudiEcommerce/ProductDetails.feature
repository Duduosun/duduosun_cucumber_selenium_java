@wip
Feature: Audi Product Details Page
  As a customer
  I want to see the details for the product I am interested in
  So that I can decide whether it is the product I want

  Background:
    Given i am on "AUDI_HOME" page
    And i click the audi ecommerce link in the audi home page



  Scenario: Verify the product details on product details Page
    When i enter the product code or product name as "XXXXX"
    And i click on search icon
    Then i should be able to see the appropriate product details
      | Product Name  | XXXXXXXX |
      | Price         | XXXXXXXX |
      | Quantity      | XXXXXXXX |
      | Product Image | XXXXXXXX |
      | Part Number   | XXXXXXXX |
      | Colour        | XXXXXXXX |
    And all the information tabs are displayed
      | Details          |
      | More information |
      | Wish list        |
      | Compare          |


  Scenario Outline: Verify the multi SKU's product details on product details page
    When i hover on "<category>" menu
    And i cilck on "<sub category>" menu
    And i select any product "<product name>" in the product list page
    Then i should be navigated to "<product name>" details page
    And i should be able to see the details of the product like "<product name>","<price>","<quantity>","<colour>","<size>" details
    And all the information tabs are displayed
      | Details              |
      | More information     |
      | Wish list            |
      | Compare              |
      | Recommended Products |
      | Email                |
    Examples:
      | category | sub category | product name | price | quantity | colour | size |
      | XXXX     | XXX          | XXX          | XXX   | XXX      | XXX    | XXX  |
      | XXXX     | XXX          | XXX          | XXX   | XXX      | XXX    | XXX  |



  Scenario Outline: Verify if the Add to cart button is available in the product details page
    When i enter product code or product name as "<product name>"
    And I click on search icon
    Then I should be able to see the appropriate product details
    When i select the "<size>","<colour>","<quantity>"
    And i click on Add to cart button
    Then "<items>" should be added to the cart
    And the attributes should match the ones selected in product details page
    Examples:
      | product name | size | colour | quantity | items   |
      | XXXXX        | 1    | XXX    | XXX      | 1 items |
      | XXXXX        | 2    | XXX    | XXX      | 2 items |



  Scenario Outline: Verify multiple images available for the product on the product details page
    When i hover on "<category>" menu
    And i cilck on "<sub category>" menu
    And i select any product "<product name>" in the product list page
    Then i should be navigated to "<product name>" page
    And i should be able to see multiple images available for the product
    Examples:
      | category | sub category | product name |
      | XXX      | XXX          | XXXX         |




#  Scenario: Verify the product description on product details page
#    When i click on "XXXXXXXXX" on the product list page
#    Then i should be able to see the product short and long description;
#      | Short description | Men's S line polo shirt                                                   |
#      | Long description  | Elegant sportiness - this men's polo shirt is impressive across the board |





