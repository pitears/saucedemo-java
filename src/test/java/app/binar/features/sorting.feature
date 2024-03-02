@sorting
Feature: Sorting

  @sorting
  Scenario Outline: As a user, I should be able to choose price high to low
    Given user should be open "https://www.saucedemo.com/" in web browser
    When user input valid username "<username>" and valid password "<password>"
    And user choose price high to low
    Then first product's price is higher than the second product's
    And user take screenshot "user-sorting-high-to-low-successfully"

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |

  @sorting
  Scenario Outline: As a user, I should be able to choose price low to low
    Given user should be open "https://www.saucedemo.com/" in web browser
    When user input valid username "<username>" and valid password "<password>"
    And user choose price low to high
    Then first product's price is lower than the second product's
    And user take screenshot "user-sorting-low-to-high-successfully"

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |

