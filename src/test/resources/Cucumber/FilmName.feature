Feature: Return Film Details given Film name
  As a user, I would like to search Film details based on Film names

  Scenario: Successfully getting film details

    Given film exists
    When user search for film name
    Then show film details
