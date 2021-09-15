# Feature: Search for an item in Amazon and add it to the cart
#  As a user I want to be able to search for an item in Amazon, add it to the cart and then make changes
#
#  Scenario: Search for an item
#    Given I am on Amazon website
#     When I search for "hats for men"
#      And I add "2" for the first item
#      And I open the cart
#     Then The total price is "11.99" and the quantity is "2"
#      And I reduce the quantity to "1"
#     Then The total price is "11.99" and the quantity is "2"