Feature: user

  @User
  Scenario Outline: get_ser_profile
    Given the user is authorised
    And new user is created with name "<name>", gender "<gender>", email "<email>", status "<status>"
    Examples:
      | name | gender | email | status |
      | name | gender | email | status |

