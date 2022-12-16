@regression
@closeswitchCurrency
  Feature: Logged User could switch between currencies US-Euro
    Scenario: logged user can switch between currencies
      Given user login with valid username and password
      When user switch between currencies
      Then currency of product changed