@grid
Feature: grid_feature

  @chrome
  Scenario: TC01_chrome_test_case
    Given user navigates to "https://techproeducation.com/" by using "chrome" browser
    Then verify title contains "TechPro Education"
    And close the remote driver

  @firefox
  Scenario: TC02_firefox_test_case
    Given user navigates to "https://google.com/" by using "firefox" browser
    Then verify title contains "Google"
    And close the remote driver

  @edge
  Scenario: TC03_edge_test_case
    Given user navigates to "https://amazon.com/" by using "edge" browser
    Then verify title contains "Amazon"
    And close the remote driver