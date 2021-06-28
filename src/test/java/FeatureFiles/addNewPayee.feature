Feature: New Payee Functionality

  Background:
    Given Navigate to website
    And Click to Sign in button
    And Enter username as "username" and password as "password"
    When click login button
    Then Verify that you are logged in.

  @RegressionTest
  Scenario Outline: Fill in the required information completely

    And Click to Pay Bills button
    And Click to Add New Payee button
    And Enter payee name as "<name>"
    And Enter payee address as "<address>"
    And Enter account as "<account>"
    And Enter payee details as "<details>"
    When Click to add button
    Then successfully message should be displayed

    Examples:
      | name   | address  | account | details         |
      | Jess   | NewYork | 254896  | rent payment     |
      | Victor | Toronto | 785961  | amazon payment   |
      | Alex   | Moscow  | 963485  | electricity bill |

  @RegressionTest
    Scenario: Fill in the information
      And Click to Pay Bills button
      And Click to Add New Payee button
      And Fill in your information
      |payeeName|Kostas|
      |payeeAddress|Greek|
      |account||
      |payeeDetails|transfer|
      When Click to add button
      Then error message should be displayed