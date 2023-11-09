Feature: To check login HRM

  Scenario: Login with valid credentials
    Given we are on the orange HRM website
    When user enters username and password
    And user click on login button
    Then user is redirected to home
