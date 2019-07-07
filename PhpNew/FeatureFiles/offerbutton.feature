  Feature: Offer button's features and it's informations 
  Scenario: Offer button will be located next to the blog button
    Given I will be in the homepage
    When I click on offers button offers page will be open
    And Dubai Special Packages and Rent Car should be appeard 
    And I click on Read More 
    Then Description should be appeard bottom of the picture
