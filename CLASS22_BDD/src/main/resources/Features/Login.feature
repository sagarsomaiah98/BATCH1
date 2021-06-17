Feature: Login feature



Background: User is Logged In
 Given server is running
 And I username and password is created






Scenario: Login to application
Given Enter the url "gmail.com " of the application
When Enter the username "john"
And Enter the password "pwd123"
Then Click Submit


Scenario: Login to application different login
Given Enter the url "hotmail.com " of the application
When Enter the username "ken"
And Enter the password "kenpwd123"
Then Click Submit


Scenario: Delete mail

Given Logged to the application
When I select all the mail
And I click delete button
Then All mail are deleted



Scenario: Outbox mail

Given  Logged to the application as admin
When I compose mail and dont send
Then Mail are saved in outbox