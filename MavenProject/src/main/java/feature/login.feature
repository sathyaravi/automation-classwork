Feature: Logging in to the Leaftaps application

@smoke
Scenario: Login with valid credentials

#Given launch the browser

#Given load the url

When enter the username 'demosalesmanager'

And enter the password 'crmsfa'

When click on the login button

Then Navigate to the next page

@sanity,@smoke
Scenario: Login with Invalid credentials

#Given launch the browser

#Given load the url

When enter the username 'demosalesmanager'

And enter the password 'crm'

When click on the login button

But  Will not Navigate to the next page