#USER STORY : US_manager_login_test
#Scenario:kullanici tum manager login bilgileriyle giriş yapabilmeli

#TEST DATA
#url : https://www.bluerentalcars.com/
#Managers:
#| ayhancan@bluerentalcars.com   | ayhan    |
#| beyhancan@bluerentalcars.com  | beyhan   |
#| sam.walker@bluerentalcars.com | sami     |
#| john_doe@gmail.com            | johndoe  |
#| johnson@bluerentalcars.com    | johnson  |

@US007
Feature: US007 - Manager login test

  Scenario Outline: The user must be able to log in with all manager login information.
    Given user goes to "blueRentalCarUrl" page
    When click on the login button
    And user must enter "<email>" and "<password>"
    But user waits 1 seconds
    Then verifies user is logged in "<email>"
    And closes the page
    Examples:
      | email                         | password |
      | ayhancan@bluerentalcars.com   | ayhan    |
      | beyhancan@bluerentalcars.com  | beyhan   |
      | sam.walker@bluerentalcars.com | sami     |
      | john_doe@gmail.com            | johndoe  |
      | johnson@bluerentalcars.com    | johnson  |