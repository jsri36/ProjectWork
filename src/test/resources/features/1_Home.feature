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
@TC01_HomePage
Feature: Login into Home page
  I want to use this template for my feature file

  @tag1
  Scenario: User validate Home page
    Given Launch DS Algo portal link
    When The user clicks the Get Started button
    Then The user redirected to home page url as the home
    Then The user clicks on data structure dropdown
    When The user select one of the dropdown menu
    Then It should Alert the user with the message 
    When The user click any of thr Get started button in home page
    Then It should Alert the user with the message 
    When The user click on Register
    Then The user should be redirected to Register page as title "Register"
   
  