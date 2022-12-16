Feature: user should be able to reset password
  Scenario: user could rest password with valid Email
    Given user navigate to home page
    When user click forget password button
    And user enter valid Email and user click recover Button
    Then user recieve Instruction mail to rest password
