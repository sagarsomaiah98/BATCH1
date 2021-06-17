@All
Feature: compose
@Smoke
Scenario: Composing a mail


Given the credentials
When I click compose
Then mail sent
@Full
Scenario: oneselft compose
Given To address
When I enter self
Then I send
@Regression
Scenario: Multiple select
Given  multi select
When  multi details
Then  I Send
