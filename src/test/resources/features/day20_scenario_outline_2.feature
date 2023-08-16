@so2
Feature: data_table_creation

  Scenario Outline: Create user and verify user creation

    Given user navigates to "https://editor.datatables.net/"
    When user clicks on new button
    And user enters first name as "<first_name>"
    And user enters last name as "<last_name>"
    And user enters position as "<position>"
    And user enters office as "<office>"
    And user enters extension as "<extension>"
    And user enters start date as "<start_date>"
    And user enters salary as "<salary>"
    And user clicks on create button
    Then user searches for the firstname "<first_name>"
    And verify the name field contains the firstname "<first_name>"
    And verify the name field contains the lastname "<last_name>"
    Then close the application

    Examples:
      | first_name | last_name | position | office | extension | start_date | salary  |
      | John       | Doe       | QA       | NY     | 123       | 2023-08-15 | 10000   |
      | Mary       | Foe       | Manager  | LA     | 555       | 2021-08-15 | 30000   |
      | Jim        | cam       | qa       | AR     | 23462     | 2022-10-12 | 7890006 |
      | Betty      | york      | lawyer   | NY     | 5613      | 2022-10-13 | 6100000 |
      | Sue        | Lui       | dev      | CA     | 400       | 2022-10-14 | 100000  |