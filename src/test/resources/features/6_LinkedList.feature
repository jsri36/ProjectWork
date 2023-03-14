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
@TC05_Linkedlist
Feature: Linked list module
  I want to use this template for my feature file

  @tag1
  Scenario: The user is logged in to DS Algo portal
    Given user is on Signin page of DS Algo portal
    When user enter valid credential
    Then user redirected to home
    When The user select LinkedList item from the drop down menu
    Then The user be directed to LinkedList Data Structure Page "https://dsportalapp.herokuapp.com/linked-list/"
    
    
    
  @tag2
  Scenario Outline: The user is able to navigate to Introduction page
    When The user clicks Introduction link
    Then The user should be redirected to Introduction page "https://dsportalapp.herokuapp.com/linked-list/introduction/"
    When  user clicks Try Here button
    Then  user should be redirected to a page having an tryEditor with a Run button to test "https://dsportalapp.herokuapp.com/tryEditor"
    And   Enter invalid python code and click Run button handle the alert
    When  user enter valid python code in tryEditor from sheet
    And   user clicks on run button
    Then  user should be presented with Run result
    
    @tag3
    Scenario Outline: The user is able to navigate to creating Linked List page
    When The user clicks creating Linked List link
    Then The user should be redirected to creating Linked List link "https://dsportalapp.herokuapp.com/linked-list/creating-linked-list/"
    When user clicks Try Here button
    Then user should be redirected to a page having an tryEditor with a Run button to test "https://dsportalapp.herokuapp.com/tryEditor"
     And   Enter invalid python code and click Run button handle the alert
    When user enter valid python code in tryEditor from sheet
    And  user clicks on run button
    Then user should be presented with Run result
    
    @tag4
    Scenario Outline: The user is able to navigate to Types of Linked List page
    When The user clicks Types of Linked List page
    Then The user should be redirected to Types of Linked List page "https://dsportalapp.herokuapp.com/linked-list/types-of-linked-list/"
    When user clicks Try Here button
    Then user should be redirected to a page having an tryEditor with a Run button to test "https://dsportalapp.herokuapp.com/tryEditor"
     And   Enter invalid python code and click Run button handle the alert
    When user enter valid python code in tryEditor from sheet
    And  user clicks on run button
    Then user should be presented with Run result
    
     @tag5
    Scenario Outline: The user is able to navigate to Implement Linked List in python page
    When The user clicks Implement Linked List in python link
    Then The user should be redirected to Implement Linked List page "https://dsportalapp.herokuapp.com/linked-list/implement-linked-list-in-python/"
    When user clicks Try Here button
    Then user should be redirected to a page having an tryEditor with a Run button to test "https://dsportalapp.herokuapp.com/tryEditor"
     And   Enter invalid python code and click Run button handle the alert
    When user enter valid python code in tryEditor from sheet
    And  user clicks on run button
    Then user should be presented with Run result
    
    @tag6
    Scenario Outline: The user is able to navigate to Traversal page
    When The user clicks on Traversal page
    Then The user should be redirected to Traversal page page "https://dsportalapp.herokuapp.com/linked-list/traversal/"
    When  user clicks Try Here button
    Then  user should be redirected to a page having an tryEditor with a Run button to test "https://dsportalapp.herokuapp.com/tryEditor"
     And   Enter invalid python code and click Run button handle the alert
    When  user enter valid python code in tryEditor from sheet
    And   user clicks on run button
    Then  user should be presented with Run result
    
    @tag7
    Scenario Outline: The user is able to navigate to Insertion page
    When The user clicks Insertion link
    Then The user should be redirected to Insertion page "https://dsportalapp.herokuapp.com/linked-list/insertion-in-linked-list/"
    When user clicks Try Here button
    Then user should be redirected to a page having an tryEditor with a Run button to test "https://dsportalapp.herokuapp.com/tryEditor"
     And   Enter invalid python code and click Run button handle the alert
    When user enter valid python code in tryEditor from sheet
    And  user clicks on run button
    Then user should be presented with Run result
    
     @tag8
    Scenario Outline: The user is able to navigate to Deletion page
    When The user clicks Deletion link
    Then The user should be redirected to Deletion page "https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/"
    When user clicks Try Here button
    Then user should be redirected to a page having an tryEditor with a Run button to test "https://dsportalapp.herokuapp.com/tryEditor"
     And   Enter invalid python code and click Run button handle the alert
    When user enter valid python code in tryEditor from sheet
    And  user clicks on run button
    Then user should be presented with Run result
    
    
    
     @tag9
    Scenario Outline: The user is able to navigate to Practice qns page
    Given user clicks Practice Questions link
    And   user should be redirected to Practice page "https://dsportalapp.herokuapp.com/linked-list/practice"
    When user clicks signout button
    Then user successfully signed out
    
    
    
       
    

   