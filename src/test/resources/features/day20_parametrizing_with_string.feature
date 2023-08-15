@param_feature
Feature: search_feature

  Background: user_goes_to_google_home_page
    Given user navigates to "https://google.com"


  Scenario: TC01_iphone_search
    When user search for "iPhone"
    Then verify the page title contains "iPhone"
    And close the application

  Scenario: TC02_tesla_search
    When user search for "Tesla"
    Then verify the page title contains "Tesla"
    And close the application