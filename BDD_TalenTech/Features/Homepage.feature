Feature: User can go to demo.oscommerce homepage

Scenario: User successfully goes to demo.oscommerce homepage
Given I open chrome
When i navigate to demo.oscommerce.com
Then i should be taken to the demo.oscommerce homepage
And the browser should close 