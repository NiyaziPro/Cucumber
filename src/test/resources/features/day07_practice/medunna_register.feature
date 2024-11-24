
Feature: Creating an account in Medunna

  Background:
    Given the user navigates to the "medunnaRegisterUrl" page
  @medunna_register
  Scenario: Succesfull user registration
    When user provides the following valid data
      | SSN         | First name | Last name | Username    | Email                  | New password | Confirm password |
      | 789-55-1248 | Smiths     | Do        | smithsdo1238 | smithsdos1238@gmail.com | Smiths1234!  | Smiths1234!      |
    And click Register button
    Then verify the "Registration Saved" message is displayed


  @mandatory
  Scenario Outline: Mandatory fields in the registration
    And enter "<SSN>" in the SSN field
    And enter "<First name>" in the First Name field
    And enter "<Last name>" in the Last Name field
    And enter "<Username>" in the Username field
    And enter "<Email>" in the Email field
    And enter "<New password>" in the New Password field
    And enter "<Confirm password>" in the New password confirmation field
    But wait for 2 seconds
    #And click Register button
    Then verify the "<errorMessage>" validation message is displayed
    And close the page
    Examples:
      | SSN         | First name | Last name | Username    | Email                  | New password | Confirm password | errorMessage                            |
      |             | John       | Do        | smithsdo123 | smithsdos123@gmail.com | Smiths1234!  | Smiths1234!      | Your SSN is required.                   |
      | 789-55-0001 |            | Do        | smithsdo123 | smithsdos123@gmail.com | Smiths1234!  | Smiths1234!      | Your FirstName is required.             |
      | 789-55-0001 | Smiths     |           | smithsdo123 | smithsdos123@gmail.com | Smiths1234!  | Smiths1234!      | Your LastName is required.              |
      | 789-55-0001 | Smiths     | Do        |             | smithsdos123@gmail.com | Smiths1234!  | Smiths1234!      | Your username is required.              |
      | 789-55-0001 | Smiths     | Do        | smithsdo123 |                        | Smiths1234!  | Smiths1234!      | Your email is required.                 |
      | 789-55-0001 | Smiths     | Do        | smithsdo123 | smithsdos123@gmail.com |              | Smiths1234!      | Your password is required.              |
      | 789-55-0001 | Smiths     | Do        | smithsdo123 | smithsdos123@gmail.com | Smiths1234!  |                  | Your confirmation password is required. |