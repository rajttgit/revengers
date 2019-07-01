Feature: User can sign into their demo.oscommerce account

Scenario: User successfully signs into their demo.oscommerce account
Given I open chrome 
When i navigate to demo.oscommerce.com 
And i click on my account
Then i should be taken to the login page
When I enter my email address
And my password
And click the sign in button
Then I should be taken to my account page
#And the browser should close 