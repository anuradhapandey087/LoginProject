Feature: Login Functonality

  Scenario Outline: Multiple login test
    Given User is on home page
    When User entered "<username>" and "<password>"
    Examples:
    |username        |password|
    | a@gmail.com    |   123     |
    | b@gmail.com    |   123     |
    | c@gmail.com    |   123     |