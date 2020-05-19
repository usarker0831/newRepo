@flightBooking
Feature: flight booking

Scenario: Book A Flight

Given I am on the homepage
And Sign-in with valid UserName and Password
And Land in Flight Finder Page
When I choose all the options
And I enter Payment Informations
And I click on SECURE PURCHASE button
Then I find Flight Confirmation page