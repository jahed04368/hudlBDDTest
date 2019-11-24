Feature: testfile

  @JahedGCMandate1
  Scenario Outline: User logs into hudl coach page successfully
    Given user is on Hudl login page
    When the user enters "<Username>" and "<Password>"
    And clicks login
    Then User is shown their homepage
    Examples:
      |Username|Password|
      |jahed04368@gmail.com|Passw0rd|

  @hudlTest
  Scenario Outline: User logs into hudl coach page with invalid username and password
    Given user is on Hudl login page
    When the user enters "<Username>" and "<Password>"
    And clicks login
    Then User is shown error message
    Examples:
      |Username|Password|
      |hudltesting@gmail.com|fakePassword|

  @hudlTest
  Scenario: user signs up to Hudl with a new team
    Given user is on sign up page
    And user enters about organization
    And user selects sport
    And user selects their package
    And user enters relevant information
    Then user is redirected to homepage
