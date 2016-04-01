@wip
Feature: Audi Product categories Page
  As a customer
  I want to navigate my way around the site using product categories
  So that it is easier for me to find the product I want

  Background:
    Given i am on "AUDI_HOME" page
    When i click on ecommerce link on the audi home page


  Scenario: Verify the product categories on the audi ecommerce page
    Then the top level <categories> should appear on the audi ecommerce page
      | Men             |
      | Women           |
      | Accessories     |
      | Kids            |
      | Car Accessories |



  Scenario Outline: Verify the product categories and sub categories on the audi ecommerce page
    When i click on particular "<category>" on audi ecommerce page
    Then i should be able to see "<sub category1>","<sub category2>","<sub category3>","<sub category4>" of the selected category
    Examples:
      | category        | sub category1               | sub category2       | sub category3             | sub category4 |
      | Men             | T-shirts, shirts and polos  | Jackets and fleeces | Ties, belts and cufflinks | Caps & gloves |
      | Women           | T-shirts, polos and blouses | Jackets and fleeces | Caps, gloves and scarves  | View all      |
      | Car Accessories | Sport and Design            | Safety and security | Transport and touring     | Family        |


