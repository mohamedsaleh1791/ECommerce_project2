@regression
@QuitSearchProduct
Feature: Logged User could search for any product
  Scenario: logged user can search for products
    Given user navigate to login page and enter valid username and password
    When user search for product
    And click search button
    Then redirect to search page