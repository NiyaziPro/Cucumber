@US009
Feature: US009 Google search Test

  Scenario: TC001 Search products on Google page
    Given user goes to "googleUrl" page
    And user searches with the given information
      | Products |
      | iphone   |
      | macbook  |
      | ipad     |
      | airpods  |
    And closes the page

  @US009a
  Scenario: TC002 Search vehicles on Google page
    Given user goes to "googleUrl" page
    And user searches with the given information
      | Vehicles |
      | Audi     |
      | Mercedes |
      | Porsche  |
    And closes the page