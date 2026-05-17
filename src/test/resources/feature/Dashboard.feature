Feature: Dashboard Validation
Scenario: Dashboard Validation
    Given user launches application
    When user enters username and password
    Then user should login successfully
    Then user lands on dashboard