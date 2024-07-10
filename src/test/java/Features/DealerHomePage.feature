
@Smoke
Feature: Homepage
  Scenario: Validate presence of all tabs
    Given user logs in as a dealer
    When user lands on home page
    Then user navigates to all tabs
    And user logs out