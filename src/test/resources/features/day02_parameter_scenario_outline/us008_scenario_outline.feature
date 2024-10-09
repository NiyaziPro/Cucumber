@US008
 #https://editor.datatables.net adresine gidiniz
# Sayfadaki tabloda new butonuna basalım
# Çıkan pencerede verilen bilgileri girelim
# Create butonuna basalım
# Search bölümüne girdiğimiz firstname bilgisini girelim
# Başarılı bir şekilde giriş yapıldığını doğrulayalım
# Sayfayı kapatalım

#| john   | smith    | tester      | NYC     | 2134      | 2023-02-25 | 80000   |
#| sam    | walton   | businessman | LA      | 5262      | 2021-02-21 | 2000000 |
#| nancy  | brown    | developer   | Dallas  | 2346      | 2021-02-26 | 850000  |
#| george | smith    | politician  | Dallas  | 9931      | 2021-02-24 | 9850000 |
#| barry  | allen    | unknown     | Central | 2103      | 2021-02-23 | 1000000 |

Feature: US008 Data Driven Test

  Scenario Outline: TC001 Registration Test
    Given user goes to "editorUrl" page
    When user clicks new button
    And user enters the given information "<Name>" , "<LastName>", "<Position>" , "<Office>" , "<Extention>" , "<StartDate>" , "<Salary>"
    And user clicks create button
    And user enters "<Name>" into the search box
    Then verifies that user "<Name>" was able to successfully register
    And closes the page
    Examples:
      | Name   | LastName | Position    | Office  | Extention | StartDate  | Salary  |
      | john   | smith    | tester      | NYC     | 2134      | 2023-02-25 | 80000   |
      | sam    | walton   | businessman | LA      | 5262      | 2021-02-21 | 2000000 |
      | nancy  | brown    | developer   | Dallas  | 2346      | 2021-02-26 | 850000  |
      | george | smith    | politician  | Dallas  | 9931      | 2021-02-24 | 9850000 |
      | barry  | allen    | unknown     | Central | 2103      | 2021-02-23 | 1000000 |