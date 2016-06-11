Feature: Audi product list page
  As a customer
  I want to choose whether I want to see product lists presented as a list or a grid view
  So that I can see it in a way that works for me

  Background:
    Given AUDI Ecommerce Page

  @ecomerch
  Scenario Outline: Navigate Simple Products Default PLP
    When User Click Top Level "<tcat>" CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP Grid View with Product "<eproduct>"

    Examples:
      | tcat | eproduct |
      | Offers | Baby long sleeve 'face' shirt |
      | Accessories | Valve caps with Audi logo |
      | Code Storm Test | Audi 200 quattro Trans Am |

  @ecomerch
  Scenario Outline: Navigate Configurable Products Default PLP
    When User Click Top Level "<tcat>" CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP Grid View with Product "<eproduct>"

  Examples:
      | tcat | eproduct |
      | Clothing | Children's type C t-shirt |
      | Alpha Testing | Baby long sleeve 'face' shirt |
      | Motorsport | Women's S line fleece jacket |

  @ecomerch
  Scenario Outline: Navigate Audi Experience Products Default PLP
    When User Click Top Level "<tcat>" CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP Grid View with Product "<eproduct>"

    Examples:
      | tcat | eproduct |
      | Audi Driving Experience | Quattro Experience |
      | Code Storm Test | Audi Sport Experience |
      | Audi Driving Experience | Audi Experience Stock Test |

  @ecomerch
  Scenario Outline: Navigate Mixed Products Default PLP
    When User Click Top Level "<tcat>" CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP Grid View with Product "<eproduct>"

  Examples:
      | tcat | eproduct |
      | Code Storm Test | Audi mini quattro, red |
      | Code Storm Test | Audi Sport Introductory Experience |
      | Code Storm Test | Audi Rings lanyard, 3 colours available |

  @ecomerch
  Scenario Outline: Navigate Simple Products PLP List View
    When User Click Top Level "<tcat>" CTA
    And Click Switch View CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP List View with Product "<eproduct>"

    Examples:
      | tcat | eproduct |
      | Offers | Baby long sleeve 'face' shirt |
      | Accessories | Valve caps with Audi logo |
      | Code Storm Test | Audi 200 quattro Trans Am |
  @ecomerch
  Scenario Outline: Navigate Configurable Products PLP List View
    When User Click Top Level "<tcat>" CTA
    And Click Switch View CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP List View with Product "<eproduct>"

    Examples:
      | tcat | eproduct |
      | Clothing | Children's type C t-shirt |
      | Alpha Testing | Baby long sleeve 'face' shirt |
      | Motorsport | Women's S line fleece jacket |

  @ecomerch
  Scenario Outline: Navigate Audi Experience Products PLP List View
    When User Click Top Level "<tcat>" CTA
    And Click Switch View CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP List View with Product "<eproduct>"

    Examples:
      | tcat | eproduct |
      | Audi Driving Experience | Quattro Experience |
      | Code Storm Test | Audi Sport Experience |
      | Audi Driving Experience | Audi Experience Stock Test |

  @ecomerch
  Scenario Outline: Navigate Mixed Products PLP List View
    When User Click Top Level "<tcat>" CTA
    And Click Switch View CTA
    Then Products List for "<tcat>" is Displayed
    And Displayed In PLP List View with Product "<eproduct>"

    Examples:
      | tcat | eproduct |
      | Code Storm Test | Audi mini quattro, red |
      | Code Storm Test | Audi Sport Introductory Experience |
      | Code Storm Test | Audi Rings lanyard, 3 colours available |

  @ecomerch
  Scenario Outline: Search Result Products Default PLP
    When User Search Audi Store with String "<search>"
    Then Products List for "<search>" is Displayed
    And Displayed In PLP Grid View with Product "<eproduct>"

    Examples:
      | search | eproduct |
      | experience | Quattro Experience |
      | soft shell jacket | Audi Sport sweat jacket |
      | mini | Audi mini quattro, red |

  @ecomerch
  Scenario Outline: Search Result Products PLP List View
    When User Search Audi Store with String "<search>"
    And Click Switch View CTA
    Then Products List for "<search>" is Displayed
    And Displayed In PLP List View with Product "<eproduct>"

    Examples:
      | search | eproduct |
      | experience | Quattro Experience |
      | soft shell jacket | Audi Sport sweat jacket |
      | mini | Audi mini quattro, red |