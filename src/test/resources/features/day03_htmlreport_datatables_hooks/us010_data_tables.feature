@US010
Feature: US010 - Manager login test BlueRentalCar

  Scenario: TC001 - The user must be able to log in with all manager login information.
    Given user goes to "blueRentalCarUrl" page
    When click on the login button
    And login with the given user information test
      | email                         | password |
      | ayhancan@bluerentalcars.com   | ayhan    |
      | beyhancan@bluerentalcars.com  | beyhan   |
      | sam.walker@bluerentalcars.com | sami     |
      | john_doe@gmail.com            | johndoe  |
      | johnson@bluerentalcars.com    | johnson  |
    And closes the page


    #burada calistigimiz sey : verilen bilgilerin iki tarafi da string. Dolayisiyla iki
    #stringi bir tane string sepetine koyamayiz. bu veriler string list'tir.
    #bluerentalStepdef. te dataTable 'imizi elimize alip asList()'in string olanini seciyoruz.