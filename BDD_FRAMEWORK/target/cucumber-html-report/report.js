$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/PlaceOrder.feature");
formatter.feature({
  "line": 1,
  "name": "Add to cart and Place Order",
  "description": "",
  "id": "add-to-cart-and-place-order",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2824911400,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Place order",
  "description": "",
  "id": "add-to-cart-and-place-order;place-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I enter the username \"standard_user\" and enter the password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I click submit",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I add the item to the cart",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click cart",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click checkout",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter the details \"Dean\" \"Win\" \"2134\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click continue",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify total value",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click Finish",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify the order",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I navigate to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_StepDefintion.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 874282300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 22
    },
    {
      "val": "secret_sauce",
      "offset": 61
    }
  ],
  "location": "Login_StepDefintion.i_enter_the_username_and_enter_the_password(String,String)"
});
formatter.result({
  "duration": 467313300,
  "status": "passed"
});
formatter.match({
  "location": "Login_StepDefintion.i_click_submit()"
});
formatter.result({
  "duration": 1265803100,
  "status": "passed"
});
formatter.match({
  "location": "Order_StepDefinition.i_add_the_item_to_the_cart()"
});
formatter.result({
  "duration": 3072865000,
  "status": "passed"
});
formatter.match({
  "location": "Order_StepDefinition.i_click_cart()"
});
formatter.result({
  "duration": 3132812000,
  "status": "passed"
});
formatter.match({
  "location": "Order_StepDefinition.i_click_checkout()"
});
formatter.result({
  "duration": 3121742400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dean",
      "offset": 21
    },
    {
      "val": "Win",
      "offset": 28
    },
    {
      "val": "2134",
      "offset": 34
    }
  ],
  "location": "Order_StepDefinition.i_enter_the_details(String,String,String)"
});
formatter.result({
  "duration": 9444990300,
  "status": "passed"
});
formatter.match({
  "location": "Order_StepDefinition.i_click_continue()"
});
formatter.result({
  "duration": 3219442900,
  "status": "passed"
});
formatter.match({
  "location": "Order_StepDefinition.i_verify_total_value()"
});
formatter.result({
  "duration": 6063652900,
  "status": "passed"
});
formatter.match({
  "location": "Order_StepDefinition.i_click_Finish()"
});
formatter.result({
  "duration": 3141577400,
  "status": "passed"
});
formatter.match({
  "location": "Order_StepDefinition.i_verify_the_order()"
});
formatter.result({
  "duration": 48926000,
  "status": "passed"
});
formatter.match({
  "location": "Order_StepDefinition.i_navigate_to_home_page()"
});
formatter.result({
  "duration": 134256600,
  "status": "passed"
});
formatter.after({
  "duration": 173400,
  "status": "passed"
});
});