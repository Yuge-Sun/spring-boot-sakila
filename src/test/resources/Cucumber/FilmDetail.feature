Feature: Browsing Film Details
  As a user, I would like to see film details on the latest films

  Scenario: Browsing the latest movie details

    Given website shows the movie posters to the user
    When user hover over the movie poster
    Then show film title and film description
