Feature: LoggedIn User View
  Scenario: Validate user is able to view after log in
    Given User navigates to the login page
    When User success-fully enters the log in details
    Then User should be able to view the product category page