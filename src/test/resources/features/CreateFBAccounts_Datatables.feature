Feature: New facebook accounts
  Scenario: Create multiple new accounts in Facebook
    Given I open Facebook URL and Create accounts with below information
      | First Name | Last Name | Email Address | Password | Phone Number | DOB       |
      | Jack       | Sparrow   | jp@test.com   | test123  | 1234567890   | 1/1/1980  |
      | John       | Doe       | jd@test.com   | pass123  | 6515484684   | 1/10/1940 |
      | Jane       | Doe       | janeD@tes.com | pass345  | 6515484684   | 1/11/1982 |
