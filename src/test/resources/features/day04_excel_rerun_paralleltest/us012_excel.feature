#       şimdi biz burda excel dosyası oluşturmak için, bir sayfa ismi girmek zorundayız ya; olur da sayfa ismi girerken elimiz çarptı yanlış yazarsak, yanlış bir isim girersek nolacak? o yüzden
#  	 	daha bu obje oluşturma aşamasındayken kontrol sağlamış oluyoruz. yoksa diğer steplerden null pointer gelecek bize.
#  	 	işte o null pointer vermesin diye, en baştan excel objem daha oluşturulma aşamasındayken, onun null olmadığını garanti etmek için kullanıyorum.


@US012
Feature: US012 - Manager login test BlueRentalCar

  Scenario: TC001 - The user must be able to log in with all manager login information from excel.
    Given user goes to "blueRentalCarUrl" page
    When click on the login button
    And login with the information on the "admin_info" page in Excel
    But user waits 1 seconds
    Then closes the page