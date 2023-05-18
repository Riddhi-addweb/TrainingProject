@Contract
Feature: Contract Module

  @S2 @contractCookies @Test2
  Scenario: To check if user is redirected to Contract Module or not.
    Given User is on the Dashboard sidebar menu
    When User clicks on the Work dropdown
    And User clicks on Contract Module
    Then User is navigated to Contract Module page
    Given The user is on the Add Contract window
    When User can enter all data in given fields
    And User click on Save button
    Then The contact is successfully saved
    And User can see the added contract on Contract page