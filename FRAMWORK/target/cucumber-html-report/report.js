$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to application",
  "description": "",
  "id": "login-to-application",
  "keyword": "Feature"
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
  "location": "StepDefintion.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 6590648800,
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
  "location": "StepDefintion.i_enter_the_username_and_enter_the_password(String,String)"
});
formatter.result({
  "duration": 486474200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefintion.i_click_submit()"
});
formatter.result({
  "duration": 314685600,
  "status": "passed"
});
});