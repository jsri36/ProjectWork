@TreePage
Feature: TreePage
  
  @TreePage_UC_001
  Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "Sample93@sdet100" and "RT56YU@78"
    Then The user redirected to homepage
    
  @TreePage_UC_002
  Scenario: The user is directed to "Tree" Page
    Given The user is on the "home page" after logged in
    When The user select Tree item from the drop down menu
    Then The user should be directed to "Tree" Page
    
  @TreePage_UC_003
  Scenario: The user is able to navigate to "Overview of Trees" page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Overview of Trees link
    Then The user should then be directed to Overview of Trees Page 
    
  @TreePage_UC_004
  Scenario: The user is able to navigate to a Overview of Trees page having an tryEditor
    Given The user is on the "Overview of Trees" after logged in
    When The user clicks "Try Here" button in "Overview of Trees" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
  @TreePage_UC_005
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees
    
    Examples: 
         |Sheetname   |RowNumber  | 
         |pythonCode  |         0 | 
              
  @TreePage_UC_006
  Scenario Outline: The user is able to get the error message for invalid syantax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees
    
     Examples: 
           | Sheetname  | RowNumber | 
           | pythonCode |         1 |    
    
  @TreePage_UC_007
  Scenario: The user is able to navigate to "Terminologies" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks Terminologies button
    Then The user should be directed to Terminologies Page
    
  @TreePage_UC_008
  Scenario: The user is able to navigate to Terminologies page having an tryEditor
    Given The user is on the "Terminologies page" after logged in
    When The user clicks "Try Here" button in "Terminologies" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
  @TreePage_UC_009
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees
    
    Examples: 
         |Sheetname   |RowNumber  | 
         |pythonCode  |         0 | 
              
  @TreePage_UC_010
  Scenario Outline: The user is able to get the error message for invalid syantax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees
    
     Examples: 
           | Sheetname  | RowNumber | 
           | pythonCode |         1 |        
 
  @TreePage_UC_011
  Scenario: The user is able to navigate to "Types of Trees" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Types of Trees button
    Then The user should be directed to Types of Trees Page
    
  @TreePage_UC_012
  Scenario: The user is able to navigate to Types of Tree page having an tryEditor
    Given The user is on the "types of trees" after logged in
    When The user clicks "Try Here" button in "Types of trees" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
  @TreePage_UC_013
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees
    
    Examples: 
         |Sheetname   |RowNumber  | 
         |pythonCode  |         0 | 
              
  @TreePage_UC_014
  Scenario Outline: The user is able to get the error message for invalid syantax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees
    
     Examples: 
           | Sheetname  | RowNumber | 
           | pythonCode |         1 |     
  
  @TreePage_UC_015
  Scenario: The user is able to navigate to "Tree Traversals" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks Tree Traversals button
    Then The user should be directed to Tree Traversals Page
    
  @TreePage_UC_016
  Scenario: The user is able to navigate to Tree Traversals page having an tryEditor
    Given The user is on the "tree traversals" after logged in
    When The user clicks "Try Here" button in "tree traversals" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
  @TreePage_UC_017
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees
    
    Examples: 
         |Sheetname   |RowNumber  | 
         |pythonCode  |         0 | 
              
  @TreePage_UC_018
  Scenario Outline: The user is able to get the error message for invalid syantax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees
    
     Examples: 
           | Sheetname  | RowNumber | 
           | pythonCode |         1 |     
    
  @TreePage_UC_019
  Scenario: The user is able to navigate to "Traversals illustration" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Traversals Illustration button
    Then The user should be directed to Traversals Illustration Page
    
  @TreePage_UC_020
  Scenario: The user is able to navigate to Traversals illustration page having an tryEditor
    Given The user is on the "traversals illustration page" after logged in
    When The user clicks "Try Here" button in "traversals illustration" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
  @TreePage_UC_021
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees
    
    Examples: 
         |Sheetname   |RowNumber  | 
         |pythonCode  |         0 | 
              
  @TreePage_UC_022
  Scenario Outline: The user is able to get the error message for invalid syantax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees
    
     Examples: 
           | Sheetname  | RowNumber | 
           | pythonCode |         1 |     
  
  @TreePage_UC_023
  Scenario: The user is able to navigate to "Binary trees" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Binary Trees button
    Then The user should be directed to Binary Trees Page
    
  @TreePage_UC_024
  Scenario: The user is able to navigate to Binary trees page having an tryEditor
    Given The user is on the "binary trees page" after logged in
    When The user clicks "Try Here" button in "binary trees" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
  @TreePage_UC_025
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees
    
    Examples: 
         |Sheetname   |RowNumber  | 
         |pythonCode  |         0 | 
              
  @TreePage_UC_026
  Scenario Outline: The user is able to get the error message for invalid syantax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees
    
     Examples: 
           | Sheetname  | RowNumber | 
           | pythonCode |         1 |     
    
  @TreePage_UC_027
  Scenario: The user is able to navigate to "Types of Binary trees" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the types of binary trees button
    Then The user should be directed to types of binary trees Page
    
  @TreePage_UC_028
  Scenario: The user is able to navigate to Types of Binary trees page having an tryEditor
    Given The user is on the "types of binary trees page" after logged in
    When The user clicks "Try Here" button in "binary trees" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
  @TreePage_UC_029
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees
    
    Examples: 
         |Sheetname   |RowNumber  | 
         |pythonCode  |         0 | 
              
  @TreePage_UC_030
  Scenario Outline: The user is able to get the error message for invalid syantax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees
    
     Examples: 
           | Sheetname  | RowNumber | 
           | pythonCode |         1 |       
    
  @TreePage_UC_031
  Scenario: The user is able to navigate to Implementation in Python Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Implementation in Python button
    Then The user should be directed to Implementation in Python Page
    
  @TreePage_UC_032
  Scenario: The user is able to navigate to Implementation in Python page having an tryEditor
    Given The user is on the "Implementation in Python" after logged in
    When The user clicks "Try Here" button in "implementation in python" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
  @TreePage_UC_033
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees
    
    Examples: 
         |Sheetname   |RowNumber  | 
         |pythonCode  |         0 | 
              
  @TreePage_UC_034
  Scenario Outline: The user is able to get the error message for invalid syantax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees
    
     Examples: 
           | Sheetname  | RowNumber | 
           | pythonCode |         1 |       
    
  @TreePage_UC_035
  Scenario: The user is able to navigate to binary tree traversals Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the binary tree traversals button
    Then The user should be directed to Binary Tree Traversals Page
    
  @TreePage_UC_036
  Scenario: The user is able to navigate to Binary Tree Traversals page having an tryEditor
    Given The user is on the "Binary Tree Traversals" after logged in
    When The user clicks "Try Here" button in "binary tree traversals" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
  @TreePage_UC_037
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees
    
    Examples: 
         |Sheetname   |RowNumber  | 
         |pythonCode  |         0 | 
              
  @TreePage_UC_038
  Scenario Outline: The user is able to get the error message for invalid syantax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees
    
     Examples: 
           | Sheetname  | RowNumber | 
           | pythonCode |         1 |         
    
  @TreePage_UC_039
  Scenario: The user is able to navigate to Implementation of Binary Trees Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Implementation of Binary Trees button
    Then The user should be directed to Implementation of Binary Trees Page
    
  @TreePage_UC_040
  Scenario: The user is able to navigate to Implementation of Binary Trees page having an tryEditor
    Given The user is on the "Implementation of Binary Trees" after logged in
    When The user clicks "Try Here" button in "Implementation of binary trees" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
  @TreePage_UC_041
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees
    
    Examples: 
         |Sheetname   |RowNumber  | 
         |pythonCode  |         0 | 
              
  @TreePage_UC_042
  Scenario Outline: The user is able to get the error message for invalid syantax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees
    
     Examples: 
           | Sheetname  | RowNumber | 
           | pythonCode |         1 |      
    
  @TreePage_UC_043
  Scenario: The user is able to navigate to Applications of Binary Trees Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Applications of Binary trees button
    Then The user should be directed to Applications of Binary trees Page
    
  @TreePage_UC_044
  Scenario: The user is able to navigate to Applications of Binary trees page having an tryEditor
    Given The user is on the "Applications of Binary Trees" after logged in
    When The user clicks "Try Here" button in "Applications of binary trees" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
  @TreePage_UC_045
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees
    
    Examples: 
         |Sheetname   |RowNumber  | 
         |pythonCode  |         0 | 
              
  @TreePage_UC_046
  Scenario Outline: The user is able to get the error message for invalid syantax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees
    
     Examples: 
           | Sheetname  | RowNumber | 
           | pythonCode |         1 |       
    
  @TreePage_UC_047
  Scenario: The user is able to navigate to "Binary Search Trees" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Binary Search Trees button
    Then The user should be directed to Binary Search Trees Page
    
  @TreePage_UC_048
  Scenario: The user is able to navigate to Binary Search Trees page having an tryEditor
    Given The user is on the "Binary Search Trees" after logged in
    When The user clicks "Try Here" button in "Binary Search Trees" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
  @TreePage_UC_049
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees
    
    Examples: 
         |Sheetname   |RowNumber  | 
         |pythonCode  |         0 | 
              
  @TreePage_UC_050
  Scenario Outline: The user is able to get the error message for invalid syantax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees
    
     Examples: 
           | Sheetname  | RowNumber | 
           | pythonCode |         1 |    
           
  @TreePage_UC_051
  Scenario: The user is able to navigate to "Implementation of BST" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Implementation Of BST button
    Then The user should be directed to Implementation Of BST Page
    
  @TreePage_UC_052
  Scenario: The user is able to navigate to Implementation of BST page having an tryEditor
    Given The user is on the "Implementation Of BST" after logged in
    When The user clicks "Try Here" button in "Implementation of BST" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
    
  @TreePage_UC_053
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees
    
    Examples: 
         |Sheetname   |RowNumber  | 
         |pythonCode  |         0 | 
              
  @TreePage_UC_054
  Scenario Outline: The user is able to get the error message for invalid syantax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees 
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees
    
     Examples: 
           | Sheetname  | RowNumber | 
           | pythonCode |         1 |    
      
  @TreePage_UC_055
  Scenario: The user validating "Practice Questions" page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Overview of Trees link
    And The user clicks on the Practice Questions in Overview of Trees
    Then The user should be redirected to Practice Questions of tree page
  
    
    