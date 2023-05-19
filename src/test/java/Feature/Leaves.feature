@Leaves
Feature: Leave Module Scenarios

  @L000
  Scenario: To check if user is redirected to Leaves Module or not.
    Given User is on Dashboard sidebar menu
    When User clicks on HR dropdown
    And User clicks on Leaves Module
    Then User is navigated to Leaves Module page

  @L001
  Scenario: To check if user is able to Add the Leave or not.
    Given User is on Leaves Page
    And User is able to see Add Leave Button
    When User clicks on Add Leave Button
    And Input all the data into it
    Then User is able to apply the Leave Successfully
    And User will be navigated to Leaves Listing Page

#   Validations (Negative Scenarios)

  @L123
  Scenario: To check the validation for the calendar field.
    Given User is on Add Leave Page
    When User click on Dropdown Menu Link
    And Click on Edit Option from it
    And User is able to see the Calender Field on Add Leave Page
    And User leaves the Calendar Field Blank
    And To save, User will click on the Save button
    Then User will able to see the validation message

  @L321
  Scenario: To check the validation of wrong format of the date entered by user.
    Given User is on the Add Leave Page
    When User click on the Dropdown Menu Link
    And Click on the Edit Option from it
    And User is able to see Calender Field on Add Leave Page
    And User adds invalid format of the date
    And To save, User will click the Save button
    Then User will able to see validation message

  @L456
  Scenario: To check if field accept zeros or not.
    Given User is on Add Leaves page
    When User clicks on the Dropdown Menu Link
    And Click on the Edit Option from dropdown
    And User is able to see Calender on Add Leave Page
    And User adds all zeros in calendar field
    And To save, User click the Save button
    Then User will able to see validation message on screen

  @L654
  Scenario: To check if user is able to Add Alphabets or not.
    Given This user is viewing the Add Leaves page
    When The user clicks on the Dropdown Menu Link
    And Select Edit from the dropdown menu
    And The calendar is visible on the Add Leave page
    And User adds alphabets to the calendar field
    And To save, click the Save button
    Then A validation message will appear on the screen

  @L789
  Scenario: To check if user is able to add numbers more than there are in a month.
    Given The user is viewing the Add Leaves page
    When User clicks on the Menu Link
    And Will select Edit from the dropdown menu
    And The calendar is visible on the Add Leaves page
    And User adds numbers more than there are in a month to the calendar field
    And Click on the Save Button
    Then Validation message will appear on the screen

  @L987
  Scenario: To check if user is able to leave the text field blank or not.
    Given The user is viewing the Add Leave page
    When The User clicks on the Dropdown Menu
    And Selects Edit from the Menu
    And Text Field is displayed to user
    And The User leaves the text field blank
    And Click on Save Button
    Then It shows validation message