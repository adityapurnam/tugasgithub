@Blast
Feature: Blast

  Scenario: Create Blast
    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
    And User Go to Home
    When User see blast page
    And Input "kendaraan" as title and "motor" as text blast
    Then User see page blast


  Scenario: Negative check mandatory blast
    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
    And User Go to Home
    When User see blast page
    And User click publish
    Then User can't see page blast

  Scenario: set due date manually
    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
    And User Go to Home
    When User see blast page
    And Input "bambu" as title and set date "2022-10-20" as blast
    Then User see page blast