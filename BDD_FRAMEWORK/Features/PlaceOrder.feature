Feature:Add to cart and Place Order
Scenario: Place order
Given Launch the browser and enter the url 
When I enter the username "standard_user" and enter the password "secret_sauce"
Then I click submit
When I add the item to the cart
And I click cart
And I click checkout
And I enter the details "Dean" "Win" "2134"
And I click continue
And I verify total value
And I click Finish
And I verify the order
Then I navigate to home page