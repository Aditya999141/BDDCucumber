Feature: Feature to validate facebook login functionality

  Scenario: Validate facebook login is working fine
    Given Browser is open
    When User provide facebook URL, user id and password
    And Hits enter
    Then User navigated to result
