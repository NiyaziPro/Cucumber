#ACCEPTANCE CRITERIA:
#AC1: Kullanıcıya Ad, Soyad, SSN, E-posta, Telefon Numarası ve Şifre bilgilerini dolduracakları alanlar sunulmalıdır.


#AC2: Tüm gerekli alanlar (Ad, Soyad, SSN, E-posta, Telefon Numarası ve Şifre) zorunlu olarak işaretlenmelidir.
#Bu alanlardan herhangi biri boş bırakıldığında, sistem uygun hata mesajları göstermelidir.


#AC3: SSN alanı yalnızca geçerli bir SSN formatını kabul etmelidir (örneğin, 000-00-0000).
#Geçersiz bir SSN girildiğinde veya SSN girilmediğinde, "SSN'iniz geçersiz" şeklinde bir hata mesajı gösterilmelidir.


#AC4: E-posta alanı, geçerli bir e-posta formatını doğrulamalıdır (örneğin, example@domain.com).
#E-posta eksik veya geçersizse, "E-posta adresiniz geçersiz" şeklinde bir hata mesajı görüntülenmelidir.


#AC5: Telefon Numarası alanı yalnızca geçerli telefon numarası formatlarını kabul etmelidir (örneğin, 000-000-0000).
#Numara eksik veya yanlışsa, "Telefon numaranız geçersiz" mesajı gösterilmeli ve gönderim engellenmelidir.


#AC6: Şifre alanı en az 8 karakter uzunluğunda olmalı ve en az bir büyük harf, bir rakam ve bir özel karakter içermelidir.
#ifre bu gereksinimleri karşılamıyorsa,
#"Şifre en az 8 karakter uzunluğunda olmalı, en az bir büyük harf, bir rakam ve bir özel karakter içermelidir"
#şeklinde bir hata mesajı gösterilmelidir.


@US017
Feature: USER STORY 17 - Creating an account in Medunna

  Scenario Outline: TC001 - Creating an Account with valid data
    Given the user navigates to the "medunnaUrl" page
    When click on the User icon
    And click on the Register
    And enter "<SSN>" in the SSN field
    And enter "<First name>" in the First Name field
    And enter "<Last name>" in the Last Name field
    And enter "<Username>" in the Username field
    And enter "<Email>" in the Email field
    And enter "<New password>" in the New Password field
    And enter "<Confirm password>" in the New password confirmation field
    But wait for 2 seconds
    And click Register button
    Then verify a registration created successfully
    And close the page
    Examples:
      | SSN         | First name | Last name | Username    | Email                  | New password | Confirm password |
      | 789-55-1241 | Smiths     | Do        | smithsdo123 | smithsdos123@gmail.com | Smiths1234!  | Smiths1234!      |

  Scenario Outline: TC002 - Create an Account by leaving the required fields blank
    Given the user navigates to the "medunnaUrl" page
    When click on the User icon
    And click on the Register
    And enter "<SSN>" in the SSN field
    And enter "<First name>" in the First Name field
    And enter "<Last name>" in the Last Name field
    And enter "<Username>" in the Username field
    And enter "<Email>" in the Email field
    And enter "<New password>" in the New Password field
    And enter "<Confirm password>" in the New password confirmation field
    But wait for 2 seconds
    And click Register button
    Then verify a registration not created successfully
    And close the page
    Examples:
      | SSN | First name | Last name | Username | Email | New password | Confirm password |
      |     |            |           |          |       |              |                  |


