Feature: Login feature

@loginMultiple
Scenario Outline: Login to application
Given Enter the url "<url>" of the application
When Enter the username "<uname>"
And Enter the password "<pwd>"
Then Click Submit
Examples:

|url|uname|pwd|
|gmail.com|steve|pwd123|
|hotmail.com|andy|andy123|
|yahoo.com|henry|henry099|
|webmail.com|mark|mark4646|





@login
Scenario: Login to application
Given Enter the url "gmail.com " of the application
When Enter the username "john"
And Enter the password "pwd123"
Then Click Submit

@Smoke
Scenario: Login to application different login
Given Enter the url "hotmail.com " of the application
When Enter the username "ken"
And Enter the password "kenpwd123"
Then Click Submit

@Regression @Smoke
Scenario: Delete mail

Given Logged to the application
When I select all the mail
And I click delete button
Then All mail are deleted


@Regression
Scenario: Outbox mail

Given  Logged to the application as admin
When I compose mail and dont send
Then Mail are saved in outbox