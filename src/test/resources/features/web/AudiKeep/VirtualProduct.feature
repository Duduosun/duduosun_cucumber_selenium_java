@wip
Feature: Audi Product details page for Virtual product(Driving Experience)
  As Audi
  I also want to see products that we don't physically stock
  So that customers can buy driving experience

  Background:
    Given i am on "AUDI_HOME" page
    And i click the audi ecommerce link in the audi home page



  Scenario:Verify if the user is able to search driving experience from ecommerce home page
    When i enter driving experience from search page option in the ecommerce home page
    And I click on search icon
    Then i should be able to see the driving experience options list



  Scenario: Verify if the user is able to see the virtual product details
    When i click on "Audi Driving Experience" link in the ecommerce home page
    And i ciclk "Audi Sport Introductory experience" on audi driving experience page
    Then i should be navigated to the audi sport introductory experience details page
    And the page should consist of virtual product details;
      | Part Number    | tbc2015                            |
      | Experience     | Audi sport introductory experience |
      | Minimum Age    | 21                                 |
      | Maximum weight | 18 stone                           |



  Scenario: Verify if the user is able to select future dates from the dropdown
    When i click on "Audi Driving Experience" link in the ecommerce home page
    And i ciclk "Audi Sport Introductory experience" on audi driving experience page
    Then i should be navigated to the audi sport introductory experience details page
    When i give product quantity to "1"
    And i choose future dates "XXXXXXX" from drop down list
    And i click "Add to basket" on the product details page
    Then the driving experience order confirmation page should display all the given details










