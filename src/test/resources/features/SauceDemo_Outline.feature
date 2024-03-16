Feature: Login to SauceDemo
  As a user
  I want to be able to login to the SauceDemo website
  So that I can access the products page

  Scenario Outline: Login with invalid credentials
    Given I am on the Sauce Demo login page
    When I enter invalid username "<username>" and password "<password>"
    And I click the login button
    Then I should see an error message "<errorMessage>"

    Examples:
      | username        | password         | errorMessage                                                              |
      | standard_user   | invalid_password | Epic sadface: Username and password do not match any user in this service |
      | invalid_user    | secret_sauce     | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user | secret_sauce     | Epic sadface: Username and password do not match any user in this service |