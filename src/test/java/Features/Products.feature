Feature: Products
  Scenario: Validate presence of all products under Products page
    Given user clicks on Home page burger menu
    When user clicks on Products button
    And user lands on Products page
    Then user validates the presence of all products