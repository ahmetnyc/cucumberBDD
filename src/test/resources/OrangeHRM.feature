Feature: Orange HRM functionality scenarios

  @Smoke @LoginWithoutParams @regression
  Scenario: Login to Orange HRM
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard


  @Smoke @TC100
  Scenario: Add new personal
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to PIM page
    Then The user wants to see add employee page
    Then The user wants to add user name as "Araz"
    Then The user wants to add last name as "atug"
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"


 @Smoke @TC200  @regression
  Scenario: Add new personal
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to PIM page
    Then The User wants to see add employee page
      |FirstName|Serdilan12312213  |
      |LastName |Jerry1231231223|
    Then The user wants to add login details
      |User Name   |jacyyy  |
      |Password    |Erkan!123  |
      |Status      |Disabled   |
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"




  @smoke @TC300
  Scenario: Add new personal
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to PIM page
    Then The user wants to see add employee page
    Then The user wants to add an employee in a list way
      |Tommm1234   | Jerryyyyyy |
      |Hasan7777   | Raman8888  |
    Then The user wants to add login details in a list way
      | renastech123  | RenasTech2021 |Disabled |
      | hasan         | hasan727272   |Disabled |
      | Ruken Ruzgar  | rukenR222$    |Disabled |
      | Mehmet        | secretpas     |Disabled |
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"






