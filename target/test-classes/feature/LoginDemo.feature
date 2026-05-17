Feature: Login Functionality
@Smoke
  Scenario: Valid Login
    Given user launches application
    When user enters username and password
    Then user should login successfully
    Then user lands on dashboard
    
    @PAC
   Scenario: Valid Login
     Given user setup PAC details successfully
     
     @PAC @Regression
Scenario: Create PAC
Given user setup REG details successfully
