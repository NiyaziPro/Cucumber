@US001
Feature: US001 Amazon Home Page Test
  Scenario: TC01 Search for iphone in the search box

  Given User goes to amazon page
    When search for iphone in the search box
    Then closes the page


    Scenario: TC02 Search for samsung in the search box
      Given User goes to amazon page
      When search for samsung in the search box
      Then closes the page