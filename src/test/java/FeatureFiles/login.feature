Feature: Login Functionality

  @SmokeTest
  Scenario:Login with valid username and password

    Given Navigate to website
    And Click to Sign in button
    And Enter username as "username" and password as "password"
    When click login button
    Then Verify that you are logged in.