@regression

Feature: Logged user could choose different tags
  Scenario: logged user can choose different tags
    Given user login with valid username and valid password choose different tags
    When press on any product from Home Page
    And choose any tag
    Then rdirect to page of products that have same choosen tag