@failed_tests
Feature: data_tables

  Scenario: TC01_admin_login
    Given user navigates to "https://www.bluerentalcars.com/login"
    When user enters the admin email and password
      | admin_email     | admin_password |name|
      | jack1@gmail.com | 12345          |Jack|
    And user clicks on login button
    Then verify the login is successful
    And close the application