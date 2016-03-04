Feature: Book a Service MOT or Repair
  As a Customer
  I should be able to search for a nearest service center
  So that I can book for a Service MOT or Repair

  @env @osb
  Scenario: Trigger book an appointment
    Given User Navigate to AUDI HOME page
    When User Click Book a Service CTA
    Then User Can Book Appointment with Audi
    After ScreenshotHook.embedScreenshot(Scenario)

  @env @osb
    Scenario: Nearest centres should be displayed
    Given User Navigate to AUDI HOME page
    When User Trigger Book an Appointment with "<VehicleReg>" amd "<Location>"
    Then User Can View Nearest Centres
    After ScreenshotHook.embedScreenshot(Scenario)

  @enr @osb
      Scenario: Change service centre
      Given User navigate to AUDI HOME page
      When User Trigger Book an Appointment with "<VehicleReg>" and "<Location>"
      Then User Can View Nearest Centres
      And User Can Change Service Centres with "<NewLocation>"