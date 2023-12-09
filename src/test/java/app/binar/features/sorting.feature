@sorting
Feature: Sorting

  @sorting
  Scenario Outline: As a user, I should be able to choose price high to low
    Given user should be open "https://www.saucedemo.com/" in web browser
    When user input valid username "<username>" and valid password "<password>"
    And user choose price high to low
    Then compare first product price with second product price
    And user take screenshot "user-sorting-high-to-low-successfully"

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |