@wipMC
Feature: As a user, I should be able to log in.

  Scenario Outline: Verify login with valid credentials

    Given user is on the login page
    When user uses username "<username>" and passcode "<password>"
    And user clicks the login button
    Then verify the user is on the dashboard page
    Examples:
      | username |  | password    |
      | user27    |  | Userpass123 |
      | user57   |  | Userpass123 |
      | user87  |  | Userpass123 |
      | user117  |  | Userpass123 |