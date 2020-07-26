Feature: Registration features
  @registration
Scenario: User should be able to regester successfully
  Given user is on homepage
  When user clicks on registration button
  And user enters all required registration details
  And user clicks on registration-submit button
  Then user should able to see registration successful massage