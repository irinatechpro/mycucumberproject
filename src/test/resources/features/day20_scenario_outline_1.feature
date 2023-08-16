@so1
Feature: search_feature

  Background: user_goes_to_google_home_page
    Given user navigates to "https://google.com"

  Scenario Outline: Google_Search
    When user search for "<word>"
    Then verify the page title contains "<word>"
    And close the application
    Examples:
      | word       |
      | iPhone     |
      | tesla      |
      | bmw        |
      | flower     |
      | bread      |
      | sport cars |
      | tablet     |

#Scenario: ->   Scenario Outline:
#Examples:  must be added
#"" -> "<>"
#"<column_names>"
#Add data under the column in Examples:
#      | word       |
#      | iPhone     |
#      | tesla      |


