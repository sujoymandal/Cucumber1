Feature: Login Test
Scenario Outline: Login to the Application
Given Open the LoginPage
When Enter the "<user>" UserId 
Then Enter the "<pwd>" Passord
And Click the SubmitButton
Examples:
|user|pwd|
|valid|valid|
|invalid|invalid|



