Feature: Book a Service MOT or Repair
  As a Customer
  I should be able to search for a nearest service center
  So that I can book for a Service MOT or Repair

  @env @osb
  Scenario: Trigger book an appointment
    Given AUDI HOME Page
    When User Click Book Service CTA
    Then Book Appointment AUDI App is triggered

  @env @osb
    Scenario Outline: : Nearest centres should be displayed
    Given AUDI HOME Page
    When User Click Book Service CTA
    And User Trigger Book an Appointment with "<VehicleReg>" and "<Location>"
    Then User Can View Nearest Centres

    Examples:
      | VehicleReg | Location |

  @enr @osb
      Scenario: Change service centre
      Given User navigate to AUDI HOME page
      When User Trigger Book an Appointment with "<VehicleReg>" and "<Location>"
      Then User Can View Nearest Centres
      And User Can Change Service Centres with "<NewLocation>"