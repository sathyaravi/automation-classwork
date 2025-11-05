Feature: Logging in to the Leaftaps application

Scenario Outline: Login with valid credentials

#Given launch the browser

#Given load the url

When enter the username <uname>

And enter the password <pswd>

When click on the login button

Then Navigate to the next page

But  Will not Navigate to the next page

Examples:
|uname|pswd|
|'demosalesmanager'|'crmsfa'|
|'demosalesmanager'|'crms'|