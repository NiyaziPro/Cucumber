#    Feature file i daha dynamic hale getirmek icin gitmek istedigimiz url yada aratmak istedigimiz bir ifadeyi
#  ""(cift tirnak) icine belirtebiliriz, cunku tirnak icinde yazdigimiz ifade artik stepdefiniton classindaki
#  methodta bir parametreye dönüsür, böylece tekrar tekrar method olusturmadan istedigimiz url e gidebilir
#  yada istedigimiz kelimeyi aratabiliriz

  # To make the feature file more dynamic, we can specify the url we want to go to or a phrase we want to search for in
  # "" (double quotes), because the phrase we write in quotes now becomes a parameter in the method in the stepdefiniton class,
  # so we can go to the url we want without creating the method again and again
  # or search for the word we want
@US004
Feature: US004 Amazon Test

  Background:
    Given user goes to "amazonUrl" page

  Scenario: TC001 Search for iphone in the search box
    When search for "iphone" in the search box
    And closes the page


    Scenario: TC002 Search for nokia in the search box
      When search for "nokia" in the search box
      And closes the page

  Scenario: TC003 Search for samsung in the search box
    When search for "samsung" in the search box
    And closes the page
