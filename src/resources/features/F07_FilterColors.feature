@regression

Feature: Logged user could Filter Color
  Scenario: logged user can Filter Color
    Given user login with valid username and valid password Filter Color
    When Type "Shoes" in search Box choose second product
    And open product page adn choose any color
    Then image of selected color is appear