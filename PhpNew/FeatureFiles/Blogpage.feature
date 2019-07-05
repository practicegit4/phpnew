Feature: Blog button features and informations collections
Scenario Outline: Blog button feature informations and travel documents 
    Given I navigated to the blog page 
    When I type "<something>" into search box
    And I click on search button
    Then it should show no result found

    Examples: 
      | something  | 
      | Bangladesh |
