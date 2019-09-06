Feature: case_4
 

 
Scenario Outline: add to cart without login
 
Given users in login page
 
When user searchs product "<product>" 
 
Then user clicks search button
 
And clicks add to cart
 
Then login page should displayed


 
Examples: 
 
           | product | 

           | head | 
