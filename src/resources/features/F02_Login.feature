@regression
@closeLogin
Feature: user should be able to login to the E-commerce site
  Scenario: user could login with valid data
    Given user navigate to login page
    When user enter valid "victoria_victoria@nopCommerce.com" and valid "123456"
    And user click login button
    Then user can login successfully and go homepage

