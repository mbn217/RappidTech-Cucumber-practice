Feature: Examples of Cucumber data table implementation

  Scenario: List og fruit I like
    Given I have the following list of fruit
      | fruit  |
      | apple  |
      | banana |
      | orange |
    When I go to the market
    Then I should have 3 fruits in my basket

#    Scenario: old way of writing fruit
#      Given I Have an apple
#      And I have a banana
#      And I have an orange
#      When I go to the market
#      Then I should have 3 fruits in my basket


  Scenario: User should be able to see all 12 months in months dropdown
    Given user is on the dropdown page of kayak website
    Then user should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |
