@US006
Feature:US006 - Google Test

  Scenario Outline: TC001 Search for car in the search box

    Given user goes to "googleUrl" page
    When searched for "<cars>" in the search box
    But user waits 2 seconds
    Then verifies if the page title contains "<cars>"
    And closes the page
    Examples:
      | cars     |
      | audi     |
      | mercedes |
      | porsche  |
      | bmw      |



