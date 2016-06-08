Feature: Audi Product Categories Page
  As a customer
  I want to navigate my way around the site using product categories
  So that it is easier for me to find the product I want

  Background:
    Given AUDI Ecommerce Page

  @ecomerch
  Scenario Outline: Top Level Category Hover
    When User Hover Top Level Category "<tcat>" for Sub Category "<scat>"
    Then Sub Category "<scat>" is Displayed

    Examples:
      | tcat | scat |
      | Accessories | Bags |
      | Clothing | Women |
      | Model Cars | Gamma Testing Simple |
      | Alpha Testing | Delta Child |
      | Car Accessories | Family |

  @ecomerch
  Scenario Outline: Top Level Category CTA
    When User Click Top Level "<tcat>" CTA
    Then Products List for "<tcat>" is Displayed

    Examples:
      | tcat |
      | Offers |
      | Accessories |
      | Model cars |
      | Audi Driving Experience |
      | Alpha Testing |
      | Car Accessories |
      | Audi gift vouchers |
      | Code Storm Test |

  @ecomerch
  Scenario Outline: Second Level Category CTA - Sub-category
    When User Click Second Level "<scat>" CTA
    Then Products List for "<scat>" is Displayed

    Examples:
      | scat |
      | Bags |
      | Pens |
      | Women |
      | Alpha Test Configurable |
      | Gamma Testing Simple |
      | Delta Child |
      | Outta Stock |
      | Family |