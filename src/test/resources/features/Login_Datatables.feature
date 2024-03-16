Feature: Login to application

#  Scenario: Login to application with credentials
#    Given I open my application
#    And I login with credentials "admin" and "pass123"

  Scenario: Login to application with credentials
    Given I open my application
    And I login with following credentials
      | admin    | pass123 |
      | admin123 | pas345  |
      | admin456 | pass678 |

  Scenario: Login to application with credentials
    Given I open my application
    And I login with these following credentials
    | username | password |
    | admin    | pass123 |
    | admin123 | pas345  |
    | admin456 | pass678 |


#    [   { username : admin  , password: pass 123},
#
#        { username : admin123  , password: pas345},
#
#        { username : admin456  , password: pass678}
#  ]