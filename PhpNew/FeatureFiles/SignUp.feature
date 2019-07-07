 Feature: Signup page's activities testing and it's  functionalities 
  Scenario Outline: I am on the signup page
    Given Signup page should be opened successfully
    When I put "<FirstName>" 
    And I give "<LastName>" 
    And I input "<Phone>" 
    And I have given "<Email>" 
    And I place "<Password>" 
    And I choose "<ConfirmPassword>"      
    And I click on signup button
    Then It should say Email Already Exists

    Examples: 
      | FirstName  | LastName | Phone     | Email            | Password | ConfirmPassword |
      | For        | Testing  | 0123456789| king@gmail.com   | king1234 |  king1234       |
