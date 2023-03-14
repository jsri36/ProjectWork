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
@GraphPage
Feature: Graph page
  I want to use this template for my feature file

  @tag1
  Scenario: DS Algo portal
    Given Signin with user credential
    When The user select Graph item from the drop down menu
    And  The user be directed to Graph from Data Structure Page
    Then verify user is on Graph page

  @tag2
  Scenario Outline: User navigate to Graph page
    Given User clicks Graph hyperlink
    And verify user is on Graph page 
    And user clicks on tryhere button
    And verify user is redirected to tryeditor page
    When user enter invalid python code and click Run button
    And user handle the alert
    And user enter valid python code and click the Run button
    Then The output success message should be displayed
    
    
    
   @tag3
  Scenario Outline: User navigate to Graph Representation page
    Given User clicks Graph Representation hyperlink
    And verify user is on Graph Representation page 
    And user clicks on tryhere button
    And verify user is redirected to tryeditor page
    When user enter invalid python code and click Run button
    And user handle the alert
    And user enter valid python code and click the Run button
    Then The output success message should be displayed

@tag4
  Scenario Outline: User navigate to Practice page
    Given User clicks Practice page hyperlink
    When  Verify user is on Practice page 
    Then  User Signout from Application
    


