@StackPage
Feature: Stack
   
  @StackPage_UC_001
 	Scenario: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "Sample93@sdet100" and "RT56YU@78"
    Then The user redirected to homepage
	
	@StackPage_UC_002
  Scenario: The user is directed to "Stack" Page
    Given The user is on the "home page" after logged in
    When The user select stack item from the drop down menu
    Then The user should be directed to Stack Page

	@StackPage_UC_003
  Scenario: The user is able to navigate to "Operations in Stack" page
    Given The user is on the "Stack page" after logged in
    When The user clicks on the Operations in Stack link
    Then The user should then be directed to "Operations in Stack" Page

  @StackPage_UC_004
  Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the Operations in Stack page after logged in
    When The user clicks "Try Here" button on "stack" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @StackPage_UC_005
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> 
    And The user clicks on Run button
    Then The user should be presented with Run output
	  
	  Examples: 
						| Sheetname	 |RowNumber| 
						| pythonCode |       0 |

	@StackPage_UC_006
  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button
    Then The user should be presented with error message in stack page

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

	@StackPage_UC_007
  Scenario: The user is able to navigate to "Implementation" Page  
    Given The user is on the "Stack page" after logged in
    When The user clicks on the Implementation button
    Then The user should then be directed to Implementation Page
  
  @StackPage_UC_008
  Scenario: The user is able to navigate to Implementation page having an tryeditor
    Given The user is on "Stack Implementation page" after logged in
    When The user clicks "Try Here" button in "stack Implementation" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @StackPage_UC_009
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> 
    And The user clicks on Run button
    Then The user should be presented with Run output
	  
	  Examples: 
						| Sheetname	 |RowNumber| 
						| pythonCode |       0 |
    
  @StackPage_UC_010
  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button
    Then The user should be presented with error message in stack page

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

	@StackPage_UC_011
  Scenario: The user is able to navigate to "Applications" in stack Page
    Given The user is on the "Stack page" after logged in
    When The user clicks on the Applications button
    Then The user should be directed to Applications Page
    
  @StackPage_UC_012
  Scenario: The user is able to navigate to Applications page having an tryEditor
    Given The user is on the Applications stack page after logged in
    When The user clicks "Try Here" button in "stack Applications" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
		
	@StackPage_UC_013
  Scenario Outline: The user is able to run code in tryEditor
    Given The user is in page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> 
    And The user clicks on Run button
    Then The user should be presented with Run output
	  
	  Examples: 
						| Sheetname	 |RowNumber| 
						| pythonCode |       0 |

 @StackPage_UC_014
  Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on Run button
    Then The user should be presented with error message in stack page

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

	@StackPage_UC_015
  Scenario: The user is able to navigate to "Practice Questions" in stack Page
    Given The user is on the "stack page" after logged in
    When The user clicks on the Practice Questions button
    Then The user should be directed to Practice Questions Page
