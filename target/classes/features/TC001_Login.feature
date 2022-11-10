Feature: Login Action
Scenario: check Login with valid inputs
Given user is on home page
Then user clicks on Sign in link check title
When user enter valid user name and valid password logs in 
Then check user and display as login successful
