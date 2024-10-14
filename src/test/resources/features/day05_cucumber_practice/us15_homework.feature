@US15
  Feature: User Story 15 - Creating a room in Medunna
    Scenario: TC001 - Creating a room
      Given user goes to "medunnaUrl" page
      Then click on the User icon
      And click on the Sign In option
      And enter username in the Username field: "adminUserName"
      And enter password in the Password field: "adminPassword"
      And click on the Sign In button
      Then click on Items&Titles
      And click on the room option
      And click on the Create New Room button
      Then enter room number in the Room Number field: "95969493"
      And select SUIT from the Room Type menu - select: 3
      And checks the Status checkbox
      And enter price in the Price field: "150"
      And enter description in the description field:"This is description"
      Then click the Save button
      But wait for 2 seconds
      And verify that a room has been successfully created
      But wait for 2 seconds
      And click on the Created Date
      But wait for 2 seconds
      Then verify that the created room is in the list

    @US15a
    Scenario: TC002 - Creating a room with Faker
      Given user goes to "medunnaUrl" page
      Then click on the User icon
      And click on the Sign In option
      And enter username in the Username field: "adminUserName"
      And enter password in the Password field: "adminPassword"
      And click on the Sign In button
      Then click on Items&Titles
      And click on the room option
      And click on the Create New Room button
      Then enter room number in the Room Number field
      And select SUIT from the Room Type menu - select: 2
      And checks the Status checkbox
      And enter price in the Price field
      And enter description in the description field
      Then click the Save button
      But wait for 2 seconds
      And verify that a room has been successfully created
      But wait for 2 seconds
      And click on the Created Date
      But wait for 3 seconds
      Then verify that the created room is in the list.




