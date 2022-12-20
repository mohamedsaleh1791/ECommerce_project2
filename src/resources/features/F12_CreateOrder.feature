@regression

Feature: Logged user can create order
  Scenario: logged user can create order
    Given user login with valid username and valid password and product add to Shopping Cart
    When Open Shopping cart and  check Term of Services
    And Click checkout Button
    And choose address and Click Continue Button
    And Choose shipping method and Click Continue Button
    And Choose payment method and Click Continue Button
    And check personal information and Click Continue Button
    And Click Confirm Button
    Then Order is processed successfully