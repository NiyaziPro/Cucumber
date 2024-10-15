@US16
Feature: User Story 16 - Creating a room in Medunna

  Scenario Outline: TC001 - Creating a room
    Given the user navigates to the "medunnaUrl" page
    When click on the User icon
    And click on the Sign In option
    And enter username in the Username field
    And enter password in the Password field
    And click on the Sign In button
    And click on Items&Titles
    And click on the room option
    And click on the Create New Room button
    And enter a room number in the Room Number field
    And select SUIT from the Room Type menu
    And click on the Status checkbox
    And enter "<price>" in the Price field
    And enter "<description>" in the Description field
    And click on the Save button
    Then verify a new room created successfully
    And close the page
    Examples:
      | price | description                     |
      | 150   | Created from validation  via UI |
