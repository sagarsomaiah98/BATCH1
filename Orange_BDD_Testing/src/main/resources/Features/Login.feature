Feature: Login feature



Scenario: Login to application
Given Enter the url "https://opensource-demo.orangehrmlive.com/index.php/dashboard" of the application
When Enter the username "Admin"
And Enter the password "admin123"
Then Click Submit
And Close the application


Scenario: Login to application
Given Enter the url "https://opensource-demo.orangehrmlive.com/index.php/dashboard" of the application
When Enter the username "ad"
And Enter the password "pwd"
Then Click Submit
And I see the invalid message
And Close the application

