Feature: User Account Management

  Rule: User can manage their account

    Scenario: User updates email
      Given I am a user
      When I update my email
      Then my email should be updated

    Scenario: User updates password
      Given I am a user
      When I update my password
      Then my password should be updated