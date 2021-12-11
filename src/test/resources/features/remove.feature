Feature: remove

  @Remove
  Scenario Outline: remove_user
    Given the user is authorised
    Then Remove user
    And Remove the already removed user "<user>"
    Examples:
      |user|
      |user|