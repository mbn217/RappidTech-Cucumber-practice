Feature: Verify Labels on OHRM Main Dashboard

  Background:
    Given I am on the OHRM Main Dashboard


  Scenario: Verify Time at work label is displayed
    Then I should see the following label "Time at Work"


    Scenario: Verify My Actions label is displayed
    Then I should see the following label "My Actions"
