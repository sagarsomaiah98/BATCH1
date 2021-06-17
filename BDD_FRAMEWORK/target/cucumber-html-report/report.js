$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to application",
  "description": "",
  "id": "login-to-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 332600,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login-to-application;login",
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
formatter.match({
  "location": "Login_StepDefintion.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 321579000,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.get(String)\" because \"StepDefinition.Login_StepDefintion.driver\" is null\r\n\tat StepDefinition.Login_StepDefintion.launch_the_browser_and_enter_the_url(Login_StepDefintion.java:22)\r\n\tat ✽.Given Launch the browser and enter the url(Login.feature:3)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "Login_StepDefintion.i_click_submit()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 22900,
  "status": "passed"
});
});