Feature: Login page

  Scenario Outline: Check login successful with credential
    Given User will on login page
    When User enters <UserName> & <Password>
    And Click on Login button
    Then User redirected to Home Page

    Examples: 
      | UserName   | Password    |
      | Aditya141  | Aditya@141  |
      | Namrata141 | Namrata@141 |
      | Sadiya141  | Sadiya@141  |
      | student    | Password123 |
