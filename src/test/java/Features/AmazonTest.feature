Feature: Amazon Test
  As a user I want to be able to perform a search, add an item to the cart and then make changes to it

  Scenario Outline: Add 2 hats to the cart and then reduce it to 1
    Given I am in Amazon website
     When I perform a search for "hats for men"
      And I am redirected to search results page
      And I select the first item
      And Add <initialQty> to the shopping cart
      And I go to the shopping cart
     Then The price and quantity are right
      And I change quantity to <finalQty>
     Then The price and quantity are right

  Examples:
    |initialQty|finalQty|
    |    2     |   1    |