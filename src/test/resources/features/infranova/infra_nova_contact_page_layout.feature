Feature: InfraNova Layout Verification

  Scenario: Verify Contact link on the home page
    When he opens a url https://www.infranova.com/
    And he clicks on CONTACT button on the home page
    Then the contact page should be opened
