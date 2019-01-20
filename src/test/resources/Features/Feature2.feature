Feature: Application in Prod
Scenario Outline: Login to Production 
Given Open the LoginPage
When Enter the "<user>" UserId 
Then Enter the "<pwd>" Passord
And Check Select Role
|Role|
|admin|
|admin|
And Click the SubmitButton
Examples:
|user        |pwd         |
|prod_valid  |prod_valid  |
|prod_invalid|prod_invalid|
