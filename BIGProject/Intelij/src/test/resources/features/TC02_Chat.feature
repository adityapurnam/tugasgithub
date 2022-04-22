#@Chat
#Feature: Chat
#
#  Scenario: Input message Chat
#    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
#    And User Go to Home
#    When User see group chat page
#    And User Input "sepp" as a chat
#    Then User see message appears in group chat
#
#
#  Scenario: Delete message Chat
#    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
#    And User Go to Home
#    When User see group chat page
#    And Delete message group chat page
#    Then User see message delete in group chat
#
#
#
#
#  Scenario: Tag member chat
#    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
#    And User Go to Home
#    When User see group chat page
#    And Tag "@Aditya" as member
#    Then User see tag member in group chat
#
#  Scenario: Attach file in column chat
#    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
#    And User Go to Home
#    When User see group chat page
#    And Attach file "C:\\Users\\ADITYA\\Desktop\\lebah.jpg" as file
#    Then User see attch file in group chat
#
#
#
#  Scenario: Negatif user directly cliks button send
#    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
#    And User Go to Home
#    When User see group chat page
#    And User click button send
#    Then User can't see message appears in group chat
#
#  Scenario: Invalid Chat
#    Given Input "qa.zaky212@gmail.com" as email and "J@karta12345" as password
#    And User Go to Home
#    When User see group chat page
#    And Input 100 characters without spaces "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" as a chat
#    Then User see message appears in group chat