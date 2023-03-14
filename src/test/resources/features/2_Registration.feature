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
@TC02_RegistrationPage
Feature: Registration page
  I want to use this template for my feature file

  @tag1
  Scenario: The user is presented with error message for empty fields below Username textbox
    Given The user opens Register Page "https://dsportalapp.herokuapp.com/register"
    When The user clicks Register button with all fields empty
    Then It should display an error "Please fill out this field" below Username textbox
    

  @tag2
  Scenario Outline: The user is presented with error message for empty fields below Password textbox
    Given The user opens Register Page "https://dsportalapp.herokuapp.com/register"
     When The user clicks Register button after entering username with other fields empty
          | Numpy |
    Then It should display an error "Please fill out this field" below Password textbox
    
  @tag3
  Scenario Outline: The user is presented with error message for empty fields below Password Confirmation textbox
    Given The user opens Register Page "https://dsportalapp.herokuapp.com/register"
     When The user clicks Register button after entering username and password with Password Confirmation field empty
          | Numpy |
          |testpassword|
    Then It should display an error "Please fill out this field" below Password Confirmation textbox
    
 @tag4
 Scenario Outline: The user is presented with error message for invalid username
    Given The user opens Register Page "https://dsportalapp.herokuapp.com/register"
     When The user enters a username with characters other than Letters, digits
      | username | password     | passwordconfirmation |
      | &**&**&  | testpassword | testpassword          |
    Then It should display an error message "Please enter a valid username"
    
  @tag5  
    Scenario Outline: The user is presented with error message for username already exists
    Given The user opens Register Page "https://dsportalapp.herokuapp.com/register"
     When The user enters a valid existing username with password and password confirmation
      | username     | password  | passwordconfirmation |
      | Numpy@sdet84 | RT56YUabc | RT56YUabc  |
    Then It should display an error message "Username already exists"
    
 @tag6
 Scenario Outline: The user is presented with error message for password mismatch
    Given The user opens Register Page "https://dsportalapp.herokuapp.com/register"
     When  The user clicks Register button after entering valid username and different passwords in password and password confirmation fields
      | username     | password     | passwordconfirmation |
      | Numpy@sdet84_1 | testpassword | testpassword1   | 
    Then It should display an error message "password_mismatch:The two password fields didn’t match."
    
 @tag7
  Scenario Outline: The user is presented with error message for password with characters less than eight
    Given The user opens Register Page "https://dsportalapp.herokuapp.com/register"
     When  The user enters a valid username and password with characters less than eight
      | username     | password | passwordconfirmation |
      | Numpy@sdet84_1 | a1b2c3d  | a1b2c3d            |
    Then It should display an error message "Password should contain at least 8 characters"
    
 @tag8
  Scenario Outline: The user is presented with error message for password with only numbers
    Given The user opens Register Page "https://dsportalapp.herokuapp.com/register"
     When  The user enters a valid username and password with only numbers
      | username     | password | passwordconfirmation |
      | Numpy@sdet84_1 | 12345678 |           12345678 |
    Then It should display an error message "Password can’t be entirely numeric."
    
  @tag9
  Scenario Outline: The user is presented with error message for password too similar to your other personal information
    Given The user opens Register Page "https://dsportalapp.herokuapp.com/register"
     When The user enters a valid username and password similar to username
      | username     | password   | passwordconfirmation |
      | Numpy@sdet84_1 | testsdet84 | testsdet84          |
    Then It should display an error message "password can’t be too similar to your other personal information."
    
    @tag10
     Scenario Outline: The user is presented with error message for commonly used password
    Given The user opens Register Page "https://dsportalapp.herokuapp.com/register"
     When The user enters a valid username and commonly used password password
      | username     | password | passwordconfirmation |
      | Numpy@sdet84_1 | Welcome1 | Welcome1          |
    Then It should display an error message "Password can’t be commonly used password"
    
    
   @ignore
    Scenario Outline: The user is presented with error message for commonly used password
    Given The user opens Register Page "https://dsportalapp.herokuapp.com/register"
     When  The user enters a valid username and password and password confirmation
      | username     | password  | passwordconfirmation |
      | LathaRajini | Latha123 | Latha123      |
    Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as <username>"
    
    
  

   