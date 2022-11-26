Feature: Country Multi Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    And User should login successfuly
    And Navigate to country page

    Scenario: Create Country
      When Create a country
      Then Success message should be displayed

      Scenario:  Create a country parameter data
        When Create a country name as "yeni" code as "kode"
        Then Success message should be displayed
