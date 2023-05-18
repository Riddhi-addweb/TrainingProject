@Lead
Feature: Leads functionality

  @S1 @leadCookies @Test1
  Scenario: Check the Leads redirection from side menu
    Given The user on the site
    When The user click on Leads option
    Then The user redirect to Leads page
    And Click on add lead button
    Then The add lead information page is open
    And Fill all the fields
    And Click on the save button
    Then The new lead is create

  @S1 @leadCookies @Test1
  Scenario: Check the selected Lead is deleted proper

    Given User is on the Leads page
    And User is able to see Dropdown Menu Link
    When User clicks on the Dropdown menu link
    And Choose on delete option
    And Click on yes,delete it option from the pop-up box
    Then The data is delete successfully