@regression
@closeRegister
Feature: Logged user could select different Categories
  Scenario: user could select different categories and sub categories
    Given user open home page
    When user hover on category and user click on sub category

    Then user redirect to the page of selected sub-category