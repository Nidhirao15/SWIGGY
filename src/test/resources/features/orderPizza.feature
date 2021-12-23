Feature: a user should be able to order Pizza from Swiggy
@Pizza
Scenario: Order Pizza From Swiggy
Given user is on the mainpage of Swiggy

And user Enters location as "<city>"
When user selects first location from suggested location in suggestion-box
And user redirects to ItemPage
And user hover over search icon
And user Enters Item as "Pizza"
And user redirects to orderPage 
And user adds first item to cart 
Then user should be able to order a Pizza suscessfully 

Examples: 
|city|
|Hyderabad|
