@TimeLogs
Feature: Time Logs Functionality

  @S4 @timelogCookies @Test4
  Scenario: To check user is redirect on TimeLog page or not
    Given User is on dashboard page
    When User clicks on Work menu
    And User clicks on Time Logs sub menu
    Then User is redirect on the time Logs page
    Given User is on time log page
    And User can see the log time button
    When User clicks on log time button
    Then User is navigated to log time Page
    Given User is on time log details page
    When User fills up all the require details
    And User clicks on save button
    Then User is redirect on Time Logs page
    Given User is on time logs page
    When User clicks on the drop-down menu link
    And User clicks on the Edit menu
    And User updates a data
    And Clicks on save button
    Then Updated data is display