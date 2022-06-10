Feature: User should be able to login to the system

Scenario: user login with valid username and password
  Given user open browser
  And user navigate to login page

  When user enter valid "Abanob" and "123456"
  Then click on login button

  And user go to home page