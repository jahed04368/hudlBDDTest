Feature: hudlHomePageTests

  @hudlTest
  Scenario Outline: User logs into hudl coach page successfully
    Given user is on Hudl login page
    When the user enters "<Username>" and "<Password>"
    And clicks login
    And User is shown their homepage
    And user searches for "<Team>"
    Examples:
      |Username|Password|Team|
      |jahed04368@gmail.com|Passw0rd|Liverpool|

  @hudlTest
  Scenario Outline: User logs into hudl coach page successfully and watches a video
    Given user is on Hudl login page
    When the user enters "<Username>" and "<Password>"
    And clicks login
    And User is shown their homepage
    Then user watches a video and logs out
    Examples:
      |Username|Password|
      |jahed04368@gmail.com|Passw0rd|



