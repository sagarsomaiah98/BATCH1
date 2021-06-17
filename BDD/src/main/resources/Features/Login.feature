

Feature: Login to application

Background: User is Logged In
 Given server is running
 And I username and password is created



Scenario: Login to application
Given Enter the "http://www.gmail.com" of the application
When Enter the username "admin"
When Enter the  password "admin123"
And Click Submit
Then Login Successful


Scenario Outline: Login to application different login
Given Enter the "<url>" of the application
When Enter the username "<user>"
When Enter the  password "<password>"
And Click Submit
Then Login Successful

Examples:
|user | password| url |
|joe| joe |http://www.hotmail.com |
|mark| pwd123 |http://www.bing.com |


