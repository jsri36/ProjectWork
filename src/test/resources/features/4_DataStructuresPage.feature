@DataStructuresPage
Feature: DataStructures Module

	@DSPage_UC_001
  Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "Sample93@sdet100" and "RT56YU@78"
    Then The user redirected to homepage

  @DSPage_UC_002
  Scenario: The user is able to navigate to Data Structure introduction page
    Given The user is on the "home page" after logged in
    When The user clicks the "Getting Started" button in Data Structure Page introduction Panel
    Then The user be directed to "Data Structures-Introduction" page

  @DSPage_UC_003
  Scenario: The user is able to navigate to Time Complexity page
    Given The user is on the "Data Structures Introduction" after logged in
    When The user clicks Time Complexity link
    Then The user should be redirected to "Time Complexity" page

  @DSPage_UC_004
  Scenario: The user is able to navigate to a page having an tryEditor from Time Complexity page
    Given The user is on the "Time Complexity" after logged in
    When The user clicks "Try Here" button on "Time Complexity" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @DSPage_UC_005
  Scenario Outline: The user is able to run code in tryEditor for Time Complexity page
    Given The user is in page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> 
    And The user clicks on Run button
    Then The user should be presented with Run output
    
    Examples: 
         |Sheetname   |RowNumber  | 
         |pythonCode  |         0 |

  @DSPage_UC_006
  Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Time Complexity page
    Given The user is in page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button
    Then The user should be presented with error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |