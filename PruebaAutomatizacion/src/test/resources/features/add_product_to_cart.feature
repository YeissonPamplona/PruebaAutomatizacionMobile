Feature: Add a product to cart
  I as a user of the Dafiti application
  I need to add the product to the cart
  To validate that if they are stored in it

  Scenario: Add to cart
    Given the user select the category product
    When he add the product to cart
      | product            | size |
      | adidas Performance | 40   |
    Then he will see the product select in the cart section