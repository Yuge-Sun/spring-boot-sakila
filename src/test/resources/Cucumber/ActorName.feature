Feature: Return Actor Details given Actor names
  As a user, I would like to search actor details based on actor names

  Scenario: Successfully getting actor details

    Given actor exists
    When user search for actor name
    Then show actor details
