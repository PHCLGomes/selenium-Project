Feature: Product purchase flow

  @Test @Positive_flow
  Scenario Outline: purchase flow of <productName>
    Given user is logged in site
    And select the product <productName>
    And click on the button "Add to cart"
    And click on the button "Shooping Cart"
    And click on the button "Checkout"
    When fill in the fields First name, Last Name and ZIP
    And click on the button "Finish"
    Then must see the message "Thank you for your order!"
    Examples:
      | productName               |
      | "Sauce Labs Bike Light"   |
      | "Sauce Labs Backpack"     |
      | "Sauce Labs Fleece Jacket"|
      | "Sauce Labs Onesie"       |
      | "Sauce Labs Bolt T-Shirt" |
      | "Test.allTheThings() T-Shirt (Red)"|

  @Test @Remove_flow
  Scenario: Remove the item from cart
    Given user is logged in site
    And select the product "Sauce Labs Backpack"
    And click on the button "Add to cart"
    And click on the button "Shooping Cart"
    When click on the button "Remove"
    Then The item removed did not show on the cart

  @Test @Cancel_flow
  Scenario: Cancel the purchase
    Given user is logged in site
    And select the product "Sauce Labs Backpack"
    And click on the button "Add to cart"
    And click on the button "Shooping Cart"
    And click on the button "Checkout"
    And fill in the fields First name, Last Name and ZIP
    When click on the button "Cancel"
    Then must return to products page









    
