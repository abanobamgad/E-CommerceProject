Feature: User should be able to sign up to the system

  Scenario: user sign up with valid data
    Given user open browser
    And user navigate to register page

    When user enter valid data "firstname" and "lastname" and "email" and "password" and "confirmpassword"
    Then click on register button

    Then user could register successfully
    And user go to Home page