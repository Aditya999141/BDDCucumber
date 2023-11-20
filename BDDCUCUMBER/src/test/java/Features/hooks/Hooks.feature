Feature: Check the login functinality

  Scenario: 
    Given user is on the login page
    When user enters valid Username and Password
    And click on login button
    Then user is redirected to home page
