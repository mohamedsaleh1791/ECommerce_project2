@regression

Feature: Logged user could add different products to compare List
  Scenario: logged user can add products to compare List
    Given user navigate to home page URL
    When press on to compare List Button on any product from Home Page
    Then product added to Compare List