@regression
@QuitSearchProduct
Feature: Logged User could search for any product
  Scenario Outline:user can search for products
    Given user navigate to login page and enter valid username and password
    When user search for product by "<product name>"
    And click search button
    Then redirect to search page that contain "<product name>"
    Examples:
      |product name|
      |macbook|
      |laptop|
      |nike|
