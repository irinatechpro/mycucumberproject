@google
Feature: google search feature

  Background: navigating_google_homepage
    Given user is on the google home page

  @iphone
  Scenario: TC01_iphone_search
    And user search for iPhone
    Then verify the page title contains iPhone
    And close the application

  @teapot
  Scenario: TC02_porcelain_tea_pot_search
    And user search for porcelain tea pot
    Then verify the page title contains porcelain tea pot
    And close the application


#    Feature files are created using Gherkin  language
#    Feature files are used to write test scenarios / test cases
#    All feature files must begin with a Feature keyword
#    Scenario: is used to create test cases
#    Each step must begin with a Gherkin keyword : Given, And, When, But(not recommended), Then, *(not recommended)

#  CUCUMBER AUTOMATION :
#  1. create feature file (GHERKIN)
#  2. create step definitions (JAVA)

# Note: Cucumber test cases in the feature file run from top to bottom
# Note: dryRun = true --> is used to check if there is any MISSING JAVA CODE(STEP DEFINITIONS)
#       dryRun = false --> used for regular execution
# Note: In a feature file, there can be multiple scenarios
# Note: @tags are used to run specific test scenarios
# Note: Background is used for repeated prerequisites. It will execute steps before each Scenario