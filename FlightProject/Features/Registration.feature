@userRegistration
Feature: user registration

Scenario: add a new valid user

Given I am on the application homepage
When I click on register link
And I enter Informations
And I click on submit button
Then I find registration successful page