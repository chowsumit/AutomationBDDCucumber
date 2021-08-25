Feature: Application Login

Scenario: Home page default login
Given User is on the Netbanking landing page
When User logins into application with username and password
And User logins into application with username "John" and password "1234" 
Then Home page is populated
And Cards are displayed  