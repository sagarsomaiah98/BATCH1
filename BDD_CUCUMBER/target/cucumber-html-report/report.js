$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ComposeMail.feature");
formatter.feature({
  "line": 1,
  "name": "Compose mail",
  "description": "",
  "id": "compose-mail",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Compose mail",
  "description": "\r\nGiven: login to application\r\nWhen: I click compose\r\nThen: mail sent",
  "id": "compose-mail;compose-mail",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.uri("Outboox.feature");
formatter.feature({
  "line": 1,
  "name": "outbox mail",
  "description": "",
  "id": "outbox-mail",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "outbox mail",
  "description": "\r\nGiven: login to application\r\nWhen: I click outbox\r\nThen: mail saved",
  "id": "outbox-mail;outbox-mail",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "login;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "there user logs in through Login Window by using Username as \"USER\" and Password as \"PASSWORD\"",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "login must be successful.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefintion.enterurl()"
});
formatter.result({
  "duration": 266738900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "USER",
      "offset": 62
    },
    {
      "val": "PASSWORD",
      "offset": 85
    }
  ],
  "location": "LoginStepDefintion.entercredentials(String,String)"
});
formatter.result({
  "duration": 2271400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefintion.login_successful()"
});
formatter.result({
  "duration": 76100,
  "status": "passed"
});
});