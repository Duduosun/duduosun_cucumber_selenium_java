Feature: Audi Product Search
  As a customer
  I want to choose whether I want to see product search result presented as a list or a grid view
  So that I can see it in a way that works for me

  Background:
    Given AUDI Ecommerce Page

  @eproduct
  Scenario Outline: Search Result Products Default PLP
    When User Search Audi Store with String "<search>"
    Then Products List for "<search>" is Displayed
    And Displayed In PLP Grid View with Product "<eproduct>"

    Examples:
      | search | eproduct |
      | experience | Quattro Experience |
      | soft shell jacket | Audi Sport sweat jacket |
      | mini | Audi mini quattro, red |

  @eproduct
  Scenario Outline: Search Result Products PLP List View
    When User Search Audi Store with String "<search>"
    And Click Switch View CTA
    Then Products List for "<search>" is Displayed
    And Displayed In PLP List View with Product "<eproduct>"

    Examples:
      | search | eproduct |
      | experience | Quattro Experience |
      | car seat | Audi baby seat ISOFIX base |
      | misano red | Audi A1 1:87, Misano red |