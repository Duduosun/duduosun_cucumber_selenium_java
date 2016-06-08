@ecomerch
Feature: Audi product list page
  As a customer
  I want to choose whether I want to see product lists presented as a list or a grid view
  So that I can see it in a way that works for me

  Background:
    Given AUDI Ecommerce Page

  Scenario Outline: : Navigate Simple Products Default PLP
    When User Click Top Level "<tcat>" CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP Grid View with Product "<eproduct>"

    Examples:
      | tcat | eproduct |
      | Offers | Baby long sleeve 'face' shirt |
      | Accessories | Valve caps with Audi logo |
      | Code Storm Test | Audi 200 quattro Trans Am |

  Scenario Outline: Navigate Configurable Products Default PLP
    When User Click Top Level "<tcat>" CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP Grid View with Product "<eproduct>"

  Examples:
      | tcat | eproduct |
      | Clothing | Children's type C t-shirt |
      | Alpha Testing | Baby long sleeve 'face' shirt |
      | Motorsport | Women's S line fleece jacket |

  Scenario Outline: Navigate Audi Experience Products Default PLP
    When User Click Top Level "<tcat>" CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP Grid View with Product "<eproduct>"

    Examples:
      | tcat | eproduct |
      | Audi Driving Experience | Quattro Experience |
      | Code Storm Test | Audi Sport Experience |
      | Audi Driving Experience | Audi Experience Stock Test |

  Scenario: Navigate Mixed Products Default PLP
    When User Click Top Level "<tcat>" CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP Grid View with Product "<eproduct>"

  Examples:
      | tcat | eproduct |
      | Code Storm Test | Audi mini quattro, red |
      | Code Storm Test | Audi Sport Introductory Experience |
      | Code Storm Test | Audi Rings lanyard, 3 colours available |

  Scenario: Search Result Products Default PLP
    When User Navigate Category
    Then Audi PLP Grid View is Displayed


  Scenario Outline: Navigate Simple Products PLP List View
    When User Click Top Level "<tcat>" CTA
    Then Products List for "<tcat>" is Displayed
    When Click Switch View CTA
    Then Product "<eproduct>" is Displayed in PLP List View

    Examples:
      | tcat | eproduct |

  Scenario: Navigate Configurable Products PLP List View
    When User Navigate Category
    And Click Switch View CTA
    Then Audi PLP List View is Displayed

  Scenario: Navigate Audi Experience Products PLP List View
    When User Navigate Category
    And Click Switch View CTA
    Then Audi PLP List View is Displayed

  Scenario: Navigate Mixed Products PLP List View
    When User Navigate Category
    And Click Switch View CTA
    Then Audi PLP List View is Displayed

  Scenario: Search Result Products PLP List View
    When User Navigate Category
    And Click Switch View CTA
    Then Audi PLP List View is Displayed