@US002
Feature: US002 Login test on BlueRentalCar page

  Scenario: TC01 Log in with the email and password provided.
    Given User goes to BlueRentalCar page
    When click on the login button
    And  login with email and password information
    And closes the page