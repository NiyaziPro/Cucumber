@US013
Feature:US013 - Google Test


  Scenario: TC001 Search for car in the search box
    Given user goes to "googleUrl" page
    When searched for "audi rs6" in the search box
    But user waits 2 seconds
    Then verifies if the page title contains "audi"
    And closes the page


  Scenario: TC002 Search for car in the search box
    Given user goes to "googleUrl" page
    When searched for "mercedes g class" in the search box
    But user waits 2 seconds
    Then verifies if the page title contains "mercedes"
    And closes the page


  Scenario: TC003 Search for car in the search box
    Given user goes to "googleUrl" page
    When searched for "porsche taycan" in the search box
    But user waits 2 seconds
    Then verifies if the page title contains "porsche"
    And closes the page