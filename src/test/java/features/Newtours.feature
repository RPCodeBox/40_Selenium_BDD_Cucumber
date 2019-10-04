Feature: Test new tours login 

@newtours
Scenario Outline: Validate login valid user 
	Given I open the new tours application 
	When I enter valid credentials "<Username>" and "<Password>" 
	Then Welcome page is displayed 

	Examples:
	| Username | Password |
	| test1 | test1	|
