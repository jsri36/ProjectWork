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
@TC04_ArrayPage
Feature: Array module
  I want to use this template for my feature file

  @tag1
  Scenario: DS Algo portal
    Given Signin page of DS Algo portal
    When The user enter valid credential
    Then The user redirected to homepage
    When The user select Array item from the drop down menu
    Then The user be directed to ARRAY Data Structure Page
    
    
    
  @tag2
  Scenario Outline: The user is able to navigate to Arrays in Python page
    When The user clicks Arrays in Python link
    Then The user should be redirected to Arrays in Python page "https://dsportalapp.herokuapp.com/array/arrays-in-python/"
    When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test "https://dsportalapp.herokuapp.com/tryEditor"
    And  The user enter invalid python code and click Run button
    When The user enter valid python code in tryEditor from sheet
    And  The user clicks on run button
    Then The user should be presented with Run result
    
    @tag3
    Scenario Outline: The user is able to navigate to Arrays Using List page
    When The user clicks Arrays Using List link
    Then The user should be redirected to Arrays Using List page "https://dsportalapp.herokuapp.com/array/arrays-using-list/"
    When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test "https://dsportalapp.herokuapp.com/tryEditor"
     And  The user enter invalid python code and click Run button
    When The user enter valid python code in tryEditor from sheet
    And  The user clicks on run button
    Then The user should be presented with Run result
    
    @tag4
    Scenario Outline: The user is able to navigate to Basic Operation List page
    When The user clicks Basic Operation List link
    Then The user should be redirected to Basic Operation List page "https://dsportalapp.herokuapp.com/array/basic-operations-in-lists/"
    When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test "https://dsportalapp.herokuapp.com/tryEditor"
    And  The user enter invalid python code and click Run button
    When The user enter valid python code in tryEditor from sheet
    And  The user clicks on run button
    Then The user should be presented with Run result
    
     @tag5
    Scenario Outline: The user is able to navigate to Application of Array page
    When The user clicks Application of Array link
    Then The user should be redirected to Application of Array page "https://dsportalapp.herokuapp.com/array/applications-of-array/"
    When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button to test "https://dsportalapp.herokuapp.com/tryEditor"
    And  The user enter invalid python code and click Run button
    When The user enter valid python code in tryEditor from sheet
    And  The user clicks on run button
    Then The user should be presented with Run result
    
     @tag6
    Scenario Outline: The user is able to navigate to Practice qns search the array page
    Given The user clicks Practice Questions link
    And The user should be redirected to Practice page "https://dsportalapp.herokuapp.com/array/practice"
    And  The user clicks the Search the array link
    And  The user should be redirected to question page "https://dsportalapp.herokuapp.com/question/1"
    When  user write the valid python code for search the array
    And  click the Run button
    And  user verify the message
    And  clicks the Submit Button
    Then The user should be presented with successful submission message 
    


    @tag7
    Scenario Outline: The user is able to navigate to Practice qns Max Consecutive ones page
    Given The user clicks Practice Questions link
    And The user should be redirected to Practice page "https://dsportalapp.herokuapp.com/array/practice"
    And The user clicks the  Max Consecutive ones link
    And  The user should be redirected to question page "https://dsportalapp.herokuapp.com/question/2"
    When  user write the valid python code for Max Consecutive ones page
    And  click the Run button
    And  user verify the message
    And  clicks the Submit Button
    Then The user should be presented with successful submission message 
    
    @tag8
    Scenario Outline: The user is able to navigate to Practice qns find odd or even number page
    Given The user clicks Practice Questions link
    And The user should be redirected to Practice page "https://dsportalapp.herokuapp.com/array/practice"
    And The user clicks the find odd or even number link
    And  The user should be redirected to question page "https://dsportalapp.herokuapp.com/question/3"
    When  user write the valid python code for find odd or even number page
    And  click the Run button
    And  user verify the message
    And  clicks the Submit Button
    Then The user should be presented with successful submission message 
    
    
     @tag9
    Scenario Outline: The user is able to navigate to Practice qns Square of Sorted Array page
    Given The user clicks Practice Questions link
    And The user should be redirected to Practice page "https://dsportalapp.herokuapp.com/array/practice"
    And The user clicks the Square of Sorted Array link
    And  The user should be redirected to question page "https://dsportalapp.herokuapp.com/question/4"
    When  user write the valid python code for Square of Sorted Array link
    And  click the Run button
    And  user verify the message
    And  clicks the Submit Button
    Then The user should be presented with successful submission message 
    And  The user will signout successfully
    
    
       
    

   