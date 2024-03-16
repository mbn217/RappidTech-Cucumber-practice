Feature: Login to application

#  Scenario: Login to application with credentials
#    Given I open my application
#    And I login with credentials "admin" and "pass123"

  Scenario: Login to application with credentials
    Given I open my application
    And I login with following credentials
      | admin    | pass123 |
      | admin123 | pas345  |
