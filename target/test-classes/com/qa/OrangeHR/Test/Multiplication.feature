Feature: Calculate the multiplication of given numbers

@Smoke
Scenario: The multiplication of a list of numbers should be calculated
Given a list of numbers
|4|
|5|
|6|
When I multiply them
Then I should get 120
