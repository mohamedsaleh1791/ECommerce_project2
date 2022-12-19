@regression
@closeRegister
Feature: user should be able to register to the E-commerce site
  Scenario: user could register with valid data
    Given user navigate to signup page
    When user enter valid data
    And user click create account button
    Then user can create account successfully and go to homepage