Feature: Access all Audi Applications
  As a Customer
  I want to trigger all Audi Applications CTA from Home Page
  So I can access all Audi Applications

  @env @audiappcta
    Scenario: Book Service and MOT
    Given AUDI HOME Page
    When User Click Book Service CTA
    Then Book Appointment AUDI App is triggered
    #After ScreenshotHook.embedScreenshot(Scenario)

  @env @audiappcta
     Scenario: Book Repair
     Given AUDI HOME Page
     When User Click Book Repair CTA
     Then Book Appointment AUDI App is triggered
     #After ScreenshotHook.embedScreenshot(Scenario)

  @env @audiappcta
      Scenario:How To Videos
      Given AUDI HOME Page
      When User Click How To Video CTA
      Then Owners Area Get to Know your AUDI is triggered
      #After ScreenshotHook.embedScreenshot(Scenario)

  @env @audiappcta
    Scenario: Audi Tyres
    Given AUDI HOME Page
    When User Click Audi Tyres CTA
    Then AUDI Tyres App is triggered
    #After ScreenshotHook.embedScreenshot(Scenario

  @env @audiappcta
    Scenario: Service Price Match
    Given AUDI HOME Page
    When User Click Service Price Match CTA
    Then Owner Area AUDI Service Price Match App is triggered
    #After ScreenshotHook.embedScreenshot(Scenario

  @env @audiappcta
    Scenario: Part Exchange
    Given AUDI HOME Page
    When User Click Part Exchange CTA
    Then Value Your Vehicle App is triggered
    #After ScreenshotHook.embedScreenshot(Scenario