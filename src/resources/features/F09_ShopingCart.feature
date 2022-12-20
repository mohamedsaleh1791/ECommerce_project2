@regression

Feature: Logged user could add different products to  Shopping Cart
  Scenario: logged user can add products to  Shopping Cart
    Given user login with valid username and valid password to add to Shopping Cart
    When press on add to cart Button on any product from Home Page
    Then product added to shopping cart