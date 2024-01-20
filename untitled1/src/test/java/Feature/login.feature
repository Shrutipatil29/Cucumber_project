@Login_123

Feature: Login functionality

  Scenario: verify the login by entering valid username and password

    Given Navigates to login page

    When Enters the valid username and password

    Then Verify the user status


#    Assignment............
  Scenario: verify the login by entering invalid username and invalid password

    Given Navigates to login page

    When Enters the invalid username and invalid password

    Then Verify the user status