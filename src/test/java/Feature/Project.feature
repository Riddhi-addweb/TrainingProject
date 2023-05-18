@Project
Feature: Add Project

  @S3 @projectCookies @Test3
  Scenario: To check if user is redirected to Project Module and can add input or not.
    Given User is on Dashboard sidebar menu
    When User clicks on Work dropdown
    And User clicks on Project Module
    Then User is navigated to Project Module page
    And User can see the Add Project Button
    When User clicks on Add Project Button
    And User is navigated to Add Project Page
    And User enters the data in to the fields
    And Click on Save Button
    Then User is able to see the data on Project Listing page
    And User is able to see the Search Field
    When User clicks on the Search Field
    And User enters the Search Data
    Then User is able to view the Search Data

  @S3 @projectCookies @Test3
  Scenario: To check if user is able to Edit the data or not.
    Given User is on Projects Page
    And User is able to see the dropdown menu link
    When User clicks on the dropdown menu link
    And Clicks on the edit option from dropdown menu link
    Then User is navigated to Edit Project Page
    And User is able to Edit all the data

  @S3 @projectCookies @Test3
  Scenario: To check if user is able to View the data or not.
    Given User is on the Projects Page
    And Dropdown menu link is visible to the User
    When Dropdown menu link is clicked by User
    And Clicks on the view option from dropdown menu link
    Then User is navigated to View Project Page

  @S3 @projectCookies @Test3 @Delete
  Scenario: To check if user is able to Delete the data or not.
    Given User is on projects page
    And Dropdown menu link is displayed to the User
    When User will click the Dropdown menu link
    And Will click Delete option from Dropdown menu link
    And Delete Confirmation Card is visible to user
    And User clicks on Yes Delete It Option
    Then The project will be deleted