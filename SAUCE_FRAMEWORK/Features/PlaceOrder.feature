Feature:Add to cart and Place Order
Scenario: Place order
Given Launch the browser and enter the url 
When I enter the username "standard_user" and enter the password "secret_sauce"
Then I click submit
When I add the item to the cart
And I checkout
And I enter the details
And I place the order
Then I navigate to home page