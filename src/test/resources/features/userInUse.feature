Feature: userInUse

  @userInUse
  Scenario Outline: user_in_use
    Given the user is authorised
    Then Create a user with email "<email>" already in use
    Examples:
    |email|
    |email|