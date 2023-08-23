@jdbc
Feature: jdbc_feature

  Background: connect_db
    Given user connects to the application database


  Scenario: TC01_read_the _login_information
    When user gets the column "*" from the table "jhi_user"
    Then user reads all column "login" data