Feature: Login
 
Scenario Outline: SignIn
    Given user opens testmeapp
    When user clicks signIn button
    And user Enters "<username>" in the user id field
    And enters "<password>" in the password field
    And clicks on login
    Then Homepage displayed

    Examples: 
      | username | password |
      |  Lalitha |  Password123|
