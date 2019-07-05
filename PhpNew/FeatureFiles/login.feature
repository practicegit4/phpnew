Feature: php Login Feature
  This login feature is for login functionality in PHP website

  Scenario Outline: homepage should be open successfully
    Given I navigated to php login page
    When I entered "<username>"  and "<password>" 
    And I click on login
    Then I should be on the login page

    Examples: 
      | username               | password   |
      | islam.roman92@gmail.com| Gold123    |
      