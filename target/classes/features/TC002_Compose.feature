Feature: Compose Action
Scenario: check Create email with valid inputs
Given user is on home page
Then user clicks on Sign in link check title
When user enter valid user name and valid password logs in 
Then check user and display as login successful
When user clicks on Compose check Compose page appeared
Then enter valid email Subject and body click on send button
