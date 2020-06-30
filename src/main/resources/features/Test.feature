Feature: Login Functionality

  Scenario: User entered email and password
    Given User is on the home page
    When User entered email and password
    And click on submit button
    Then User will navigate on welcome page

    Scenario Outline: User entered email and password
      Given User is on home page
      When User entered "<email>" and "<pwd>"
      Examples:
      |email|pwd|
      |anuradhapandey087@gmail.com| 123  |
      |anuradhapandey099@gmail.com|123   |
