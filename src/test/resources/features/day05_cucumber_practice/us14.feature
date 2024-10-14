#http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
#Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
#Tüm yapılacakların üzerini çiz.
#Tüm yapılacakları sil.
#Tüm yapılacakların silindiğini doğrulayın.

@US14
Feature: User Story 14 - Todo List

  Scenario: TC001 - Verify todo list application
    Given go to the url
    When add todo list
      | Prepare breakfast                 |
      | Wash the dishes                   |
      | Take care of the baby             |
      | Help your child with her homework |
      | Work with Selenium                |
      | Sleep                             |
    But user waits 3 seconds
    And cross out all the to-dos
    But user waits 3 seconds
    And delete all to-dos
    But user waits 3 seconds
    Then verify that all to-dos have been deleted.

