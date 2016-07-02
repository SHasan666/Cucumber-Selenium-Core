#Author: your.email@your.domain.com
@Login
Feature: Test Facebook Login
  In order to work 
  As a user
  I want to login

  Scenario Outline: Test login with valid cred
    Given Runmode is "<Runmode>"
    Given Open "<Browser>" and go to "testSitebaseURL"
      | URL_Description | URL                    |
      | Prod            | https://www.google.com |
      | Uat             | https://www.google.com |
    When I enter valid "<username>" and valid "<password>"
    And I click on "loginButton" button
    Then Login should be "<ExpectedResult>"

    Examples: 
      | Runmode | Browser | username                | password  | ExpectedResult |
      | N       | Mozilla | sakib@gmail.com         |      1234 | Fail           |
      | N       | Mozilla | zerin@gmail.com         |  12345555 | Success        |
      | Y       | Mozilla | seleniumsakib@gmail.com | sakib1234 | Success        |
