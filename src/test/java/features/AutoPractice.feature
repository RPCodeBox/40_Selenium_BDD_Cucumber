Feature: Test new tours login 

@AutoPractice
Scenario Outline: Validate login valid user 
	Given I open the new tours application 
	When I enter valid credentials "<Username>" and "<Password>" 
	Then Welcome page is displayed 

	Examples:
	| Username | Password |
	| testuser1@gmail.com | testuser1	|
