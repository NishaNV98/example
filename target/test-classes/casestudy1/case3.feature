Feature: Search
 
Scenario Outline: Searching Product
    Given user opens testmeapp
    When user clicks signIn button
    And user Enters "<username>" in the user id field
    And enters "<password>" in the password field
    And clicks on login
    Then Homepage displayed
    When user searchs "<product>" in search field
    And click searchs button

    Examples: 
      | username | password | product |
      |  Lalitha |  Password123| hand |
