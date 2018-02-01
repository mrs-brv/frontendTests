Feature: Test login Page
  @Login @Notification
  Scenario: Check user is logged in
    Given User is in wordpress website "https://www.wordpress.com"
    When User click login button
    Then User is on first login page
    When User enter login and press <continue>
    Then User is on password page
    When User enter password and press <login>
    Then User is on his main page
    When User press avatar
    Then User is on personal page
    When User clicks notification link
    Then User is on notification page
    When User clicks checkbox
    Then User is unselected