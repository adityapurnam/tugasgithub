#@all
#Feature: Board
#
#  Scenario: Add Card
#    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
#    And User Go to Home
#    When User see board page
#    And Create add card "coba" as board
#    Then User see add card
#
#  Scenario: Negatif check mandatory card
#    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
#    And User Go to Home
#    When User see board page
#    And User click add card
#    Then User failed add new card
#
#
#  Scenario: Input notes
#    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
#    And User Go to Home
#    When User see board page
#    And Input notes "critical" as board
#    Then User see notes
#
#  Scenario: Update notes
#    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
#    And User Go to Home
#    When User see board page
#    And Update notes "pagi sekali" as board
#    Then User see notes
#
#
#  Scenario: Negatif Update notes without writing
#    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
#    And User Go to Home
#    When User see board page
#    And Update notes "" as board
#    Then User see notes
#
#  Scenario: Create label
#    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
#    And User Go to Home
#    When User see board page
#    And Input name label "low" and the color of the label card appears
#    Then User see colour label
#
#  Scenario: Input Comment
#    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
#    And User Go to Home
#    When User see board page
#    And Input comment "mantappp" as page coloumn comment
#    Then User see comment on board page
#
#  Scenario: Input Comment emoticon
#    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
#    And User Go to Home
#    When User see board page
#    And Input comment "mantull" as emoticon
#    Then User see comment on board page
#
#  Scenario: Attchment file board
#    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
#    And User Go to Home
#    When User see board page
#    And  User Attach file in board "C:\\Users\\ADITYA\\Desktop\\lebah.jpg" as file
#    Then User see attch file in card
#
#
#  Scenario: Change Name
#    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
#    And User Go to Home
#    When User see board page
#    And Input change name "QA" as board
#    Then  User see add card