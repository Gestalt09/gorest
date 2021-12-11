Feature: update

  @Update
  Scenario Outline: update_profile
    Given the user is authorised
    Then user name is updated to "<name>"
    Examples:
    | name |
    | name |
