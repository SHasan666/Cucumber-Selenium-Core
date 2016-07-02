#Author: your.email@your.domain.com
@HomePage
Feature: Home Page Test

  Background: 
    Given I am logged in facebook with Mozilla

  @HomePageButtonTest
  Scenario Outline: Test profile and home button
    Then "<Buttons>" should be present

    Examples: 
      | Buttons     |
      | profilelink |
      | homelink    |

  @HomePageTitleTest
   Scenario: Test title
    Then title should be "Google"

    