#Feature: contain the plan What I want to do (example: I want to go to Queens)
Feature: User able to validate the login functionalities 


# Description: optional; (you can add your user story)
	Description: As a users can login the application with valid credential 

	# Background: contains the common steps 
Background: Open any browser & enter the Url 

#Scenario: What to test ( Scenario contains single test cases/ or single Scenario)
Scenario: User able to login to application with valid credential 

# How to test (Given is prerequisite) (All the action contain inside when keyword) (And is optional or add extra steps)
# (Then contain the validation) 
	Given user able to open browser and user enter the url 
	When user click on sign_Button 
	And user able to enter User_Name 
	And user able to enter Password 
	And user able to click on Login_Button 
	Then user able to varify the userInfo ( Successfull login) 
	
	
