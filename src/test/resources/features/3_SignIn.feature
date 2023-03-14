#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@TC03_SignInPage
Feature: SignInPage
  I want to use this template for my feature file

  @tag1
  Scenario: Verifying Register link
    Given The user is on register page "https://dsportalapp.herokuapp.com/register"
    When The user clicks on register link on signin page
    Then The user redirected to Registration page from signin page "https://dsportalapp.herokuapp.com/login"
    

  @tag2
  Scenario Outline: User on login page and login with invalid inputs
    Given The user is on login page "https://dsportalapp.herokuapp.com/login"
    When  The user enter invalid username and password
    Then click login button to verify "https://dsportalapp.herokuapp.com/login"

     @tag3
  Scenario Outline:  User on login page and login with invalid and valid inputs from Excel
    Given The user is on register page "https://dsportalapp.herokuapp.com/login"
    When  The user enter valid and invalid input from excel sheet
    Then  click login button
    
     @tag4
  Scenario Outline:  Verifying signout link
    Given The user is in the Home page with valid  log in
    When  The user clicks Sign out
    Then  The user redirected to homepage "https://dsportalapp.herokuapp.com/home"
