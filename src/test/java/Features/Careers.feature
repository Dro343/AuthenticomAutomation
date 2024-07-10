Feature: Careers
  Scenario: Submit application
    Given user clicks on Home page burger menu
    When user clicks on Careers button
    And user clicks on Contact Us button
    Then user sees Get In Touch text
    And user fills the form
    Then user sees 'Thank you! Your request has been received!TEST' message



