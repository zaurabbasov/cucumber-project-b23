@non_ui
Feature: Web order app login
  As a user
  I should be able to login to web order app

  Background:
    Given we are at web order login page

  Scenario: User login successfully
 #  Given we are at web order login page
    When we provide valid credentials
    Then we should see all order page

  Scenario: User login fail
 #   Given we are at web order login page
    When we provide invalid credentials
    Then we should still be at login page
    And login error message should be present

   Scenario: User login with specific credentials
     When user provide username "Tester" and password "test"
     Then we should see all order page

    Scenario: User login with wrong credentials
      When user provide username "BLA" and password "BLA"
      Then we should still be at login page
      And login error message should be present




