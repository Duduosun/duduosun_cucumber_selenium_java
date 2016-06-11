Feature: Audi product list page
  As a customer
  I want to choose whether I want to see product lists presented as a list or a grid view
  So that I can see it in a way that works for me

  Background:
    Given AUDI Ecommerce Page

  @eproduct
  Scenario Outline: Navigate Simple Products Default PLP
    When User Click Top Level "<tcat>" CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP Grid View with Product "<eproduct>"

    Examples:
      | tcat | eproduct |
      | Offers | Baby long sleeve 'face' shirt |
      | Accessories | Valve caps with Audi logo |
      | Code Storm Test | Audi 200 quattro Trans Am |

  @eproduct
  Scenario Outline: Navigate Configurable Products Default PLP
    When User Click Top Level "<tcat>" CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP Grid View with Product "<eproduct>"

  Examples:
      | tcat | eproduct |
      | Clothing | Children's type C t-shirt |
      | Alpha Testing | Baby long sleeve 'face' shirt |
      | Motorsport | Women's S line fleece jacket |

  @eproduct
  Scenario Outline: Navigate Audi Experience Products Default PLP
    When User Click Top Level "<tcat>" CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP Grid View with Product "<eproduct>"

    Examples:
      | tcat | eproduct |
      | Audi Driving Experience | Quattro Experience |
      | Code Storm Test | Audi Sport Experience |
      | Audi Driving Experience | Audi Experience Stock Test |

  @eproduct
  Scenario Outline: Navigate Mixed Products Default PLP
    When User Click Top Level "<tcat>" CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP Grid View with Product "<eproduct>"

  Examples:
      | tcat | eproduct |
      | Code Storm Test | Audi mini quattro, red |
      | Code Storm Test | Audi Sport Introductory Experience |
      | Code Storm Test | Audi Rings lanyard, 3 colours available |

  @eproduct
  Scenario Outline: Navigate Simple Products PLP List View
    When User Click Top Level "<tcat>" CTA
    And Click Switch View CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP List View with Product "<eproduct>"

    Examples:
      | tcat | eproduct |
      | Model cars | A3 Cabriolet 1:43 |
      | Stocking fillers | quattro stylus ballpoint pen |
      | Baby | Anti-freeze screenwash (500ml) |

  @eproduct
  Scenario Outline: Navigate Configurable Products PLP List View
    When User Click Top Level "<tcat>" CTA
    And Click Switch View CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP List View with Product "<eproduct>"

    Examples:
      | tcat | eproduct |
      | Gifts for her | Women's S line t-shirt |
      | Gifts for him | Audi Sport bath robe |
      | Motorsport | Men's S line t-shirt, black |

  @eproduct
  Scenario Outline: Navigate Audi Experience Products PLP List View
    When User Click Top Level "<tcat>" CTA
    And Click Switch View CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP List View with Product "<eproduct>"

    Examples:
      | tcat | eproduct |
      | Audi Driving Experience | Audi Experience Stock Test |
      | Code Storm Test | Audi Sport Experience |
      | Audi Driving Experience | Quattro Experience |

  @eproduct
  Scenario Outline: Navigate Mixed Products PLP List View
    When User Click Top Level "<tcat>" CTA
    And Click Switch View CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP List View with Product "<eproduct>"

    Examples:
      | tcat | eproduct |
      | Gifts for him | Audi Sport bath robe |
      | Gifts for him | Audi Sport Corkscrew |
      | Gifts for him | Audi Sport Introductory Experience |