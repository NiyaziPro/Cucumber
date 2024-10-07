#TASK:
# 3 TANE SCENARIO OLUŞTURUNUZ
# AMAZON SAYFASINDA IPHONE, SAMSUNG VE NOKIA ARATINIZ
  #   Eger feature file da kullanacağımız senaryolarda ortak adimlar var ise Feature keywordunden
#   sonra Background yazarak burada ortak adimlari belirtebiliriz
#   Backgound yapisi @BeforeMethod mantigi ile calisir
@US003
Feature: US003 Amazon Test

  Background:
    Given User goes to amazon page
  @iphone
  Scenario: TC001 Search for iphone in the search box
    When search for iphone in the search box
    And closes the page

  @samsung
  Scenario: TC002 Search for samsung in the search box
    When search for samsung in the search box
    And closes the page

  @nokia
  Scenario: TC003 Search for nokia in the search box
    When search for nokia in the search box
    And closes the page

