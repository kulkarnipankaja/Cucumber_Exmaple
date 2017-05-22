Feature: Login Functionalities are tested in this feature file

Description : Login Functionalities are tested in this feature file
@Smoketest
Scenario: Login page Verification

Given user is in the amazon.com homepage

When user clicks on Login Button

Then Login page should be displayed

@Smoketest @RegressionTest

Scenario: Verifying the Elements of Login Page

Given user is in the amazon.com homepage

When user clicks on Login Button

Then email should be displayed

And Pw should be displayed

And Sign in button should be displayed


Scenario Outline: verify Succefull Login
Given Useris on Login

When user enters "<email>" emial id

And Clicks on Sign on Button

Then User should be Successfully logged in

Examples:

|email | pw |
|tester@test.com| mercury|
|sele@test.com|mercury|

@EmailTest

Scenario:  verifying Successfull Login

Given user is on login page

When user enters "mercury"email id

And  user enetrs "mercury" pw

And Clicks on Sign in Button 

Then user should be successfully logged in  

Scenario Outline: verify Successfull Login

Given user is on Login 



