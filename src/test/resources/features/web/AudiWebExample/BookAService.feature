Feature: Book a Service MOT or Repair
  As a Customer
  I should be able to search for a nearest service center
  So that I can book for a Service MOT or Repair

  Background:
    Given AUDI HOME Page
    When User Click Book Service CTA

  @env @osb
  Scenario: Trigger book an appointment
    Then Book Appointment AUDI App is triggered

  @env @osb
    Scenario Outline: Nearest centres should be displayed
    And User Trigger Book an Appointment with "<VehicleReg>" and "<Location>"
    Then User Can View Nearest Centres within "<Location>"

    Examples:
      | VehicleReg | Location |
      | AUD1 | London |
      #| RY07BRV | Finchley |
      #| DP12BCV | Finchley |
      #| FG09UFA | London |

  @enr @osb
      Scenario Outline: : Change service centre
      And User Trigger Book an Appointment with "<VehicleReg>" and "<Location>"
      Then User Can View Nearest Centres within "<Location>"
      And User Can Change Service Centres with "<NewLocation>"

    Examples:
      | VehicleReg | Location | NewLocation |
      | AUD1 | London | Finchley |
      #| RY07BRV | Finchley | London |