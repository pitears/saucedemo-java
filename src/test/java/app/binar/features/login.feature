@login
Feature: Login

  @login
  Scenario Outline: As a user, I should be able to log in using valid username and valid password
    Given user should be open "https://www.saucedemo.com/" in web browser
    When user input valid username "<username>" and valid password "<password>"
    Then user direct to home page
    And user see the product list
    And user take screenshot "user-login-successfully"
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |

  @login
  Scenario Outline: As a user, I should be not able to log in using valid username and invalid password
    Given user should be open "https://www.saucedemo.com/" in web browser
    When user input valid username "<username>" and invalid password "<password>"
    Then error alert exist with value "<snackbar_error>"
    And user take screenshot "user-login-successfully"

    Examples:
      | username               | password     | snackbar_error                                                            |
      | standard_user          | fake_sauce:p | Epic sadface: Username and password do not match any user in this service |

