Feature: Clock In and Out Functionality

  @ClockIn
  Scenario: To check Clock in functionality is working or not.
    Given User is on the Dashboard
    And User is able to see the Clock-In Button
    When User clicks on the Clock-In Button
    And And does the Clock-In
    Then User is successfully Clocked-In

  @Verify
  Scenario: To verify Clockin Time
    Given User is on Dashboard Sidebar Menu
    And User is able to see the HR Dropdown
    When User clicks on HR Dropdown
    And Clicks on Attendance Module from the HR dropdown
    And User is redirected to the Attendance Module
    Then User will verify the Clockin time of the respective user

  @ClockOut
  Scenario: To check Clock out functionality is working or not.
    Given User is on Dashboard Page
    And User is able to see the Clock-Out Button
    When User clicks on the Clock-Out Button
    Then User is successfully Clocked-Out