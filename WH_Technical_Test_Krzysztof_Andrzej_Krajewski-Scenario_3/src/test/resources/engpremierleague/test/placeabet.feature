Feature: Place a bet on English Premier League event
       As a WH customer,
       I want the ability to place a bet on a English Premier League event
      
  	Scenario Outline: Place a bet on English Premier League football event
	    Given the user is on English Premier League Page
	    When he choose "<event>" from the list
	    And he bet "<bet_slip>" for the home team to Win
	    Then assert the odds and returns offered

	Examples:
		| event | bet_slip |
		| Arsenal v Leicester  | 0,05	|
