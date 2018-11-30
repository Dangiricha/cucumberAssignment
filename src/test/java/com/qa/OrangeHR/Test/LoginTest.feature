Feature: login OrangeHR Application

@Regression
Scenario: Login to Orange HR Application
Given I open my application
And I login with following credentials 
| Admin | admin123 |
Then Validate the landing page
| OrangeHRM |

