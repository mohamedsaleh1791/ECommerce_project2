@regression
@closeWhishList
  Feature: Logged user could add different products to Wishlist
    Scenario: logged user can add products to  whishList
      Given user login with valid username and valid password
      When press on wishList Button on any product from Home Page
      Then product added to whishList
