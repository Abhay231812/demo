Feature: Login Action
Scenario: Validate Login for Valid values and display Successful message
Given user is on home page
When user clicks on Sign in link check title
When user enters username and password clicks on Submit button
Then Check user and if valid display successful message
Then Logout and Close browser
 