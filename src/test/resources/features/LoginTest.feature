Feature: This will validate login feature
	
	Given - pre codition
	When - Action
	Then - Verification / Result 
	And - Combining multiple actions


	Scenario: Verify user can login
		Given user open the website
		When user login with valid credentials
		Then verify user is on homepage
			
	Scenario: Verify user cannot login with invalid credentials
		Given user open the website
		When user login with invalid credentials
		Then verify invalid login error message is displayed
