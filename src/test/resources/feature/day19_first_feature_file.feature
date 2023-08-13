Feature: google search feature
  Scenario: TC01_iphone_search
    Given user is on the google home page
    And user search for iPhone
    Then verify the page title contains iPhone
#    Feature files are created using Gherkin  language
#    Feature files are used to write test scenarios / test cases
#    All feature files must begin with a Feature keyword
#    Scenario: is used to create test cases
#    Eeach step must begin with a Gherkin keyword : Given, And, When, But(not recommended), Then, *(not recommended)
#  CUCUMBER AUTOMATION :
#  1. create feature file (GHERKIN)
#  2. create step definitions (JAVA)