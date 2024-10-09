@US011
Feature:US011 - Google Test

  @audi
  Scenario: TC001 Search for car in the search box
    Given user goes to "googleUrl" page
    When searched for "audi rs6" in the search box
    But user waits 2 seconds
    Then verifies if the page title contains "audi"
    And closes the page

  @mercedes
  Scenario: TC002 Search for car in the search box
    Given user goes to "googleUrl" page
    When searched for "mercedes g class" in the search box
    But user waits 2 seconds
    Then verifies if the page title contains "mercedesss"
    And closes the page

  @porsche
  Scenario: TC003 Search for car in the search box
    Given user goes to "googleUrl" page
    When searched for "porsche taycan" in the search box
    But user waits 2 seconds
    Then verifies if the page title contains "porsche"
    And closes the page