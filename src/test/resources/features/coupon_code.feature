Feature: Coupon code functionality

  As a customer
  I want to have the possibility to apply my discount during the purchase
  So that I can be eligible for discount

  Scenario: User enters invalid coupon code end gets error message
    Given user open "https://shop.acodemy.lv"
    And user selects "Cap" product from a list
    And click on add to cart