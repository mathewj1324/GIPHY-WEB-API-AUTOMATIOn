@run
Feature: search api

  Scenario: Verify whether Search API is working as expected
    Given that user is having api_key "mU0vwi0OFS5fVdD0X7QoxcXEoFEs5xq5"
    When user is having search query term as "cheeseburgers"
    And the rating as "g"
    And the language as "en"
    Then the search results will be displayed


  Scenario: Verify whether Upload API is working as expected
    Given that user is having api_key "mU0vwi0OFS5fVdD0X7QoxcXEoFEs5xq5" and username as "Anitmathew"
    When user is having image upload source url as "http://www.mysite.com/myfile.mp4"
    And the tags as "pets"
    And the source post url as "http://www.mysite.com/my-post/"
    Then the image will be uploaded sucessfully




