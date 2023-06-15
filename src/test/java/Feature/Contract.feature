@Contract
Feature: Contract Module

  Scenario: To check if user is redirected to Contract Module or not.
    Given User is on the Dashboard sidebar menu
    When User clicks on the Work dropdown
    And User clicks on Contract Module
    Then User is navigated to Contract Module page
    And User can add contract module successfully
    And User should be edit the contract
    And User should be delete the contract