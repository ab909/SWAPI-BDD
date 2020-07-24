Feature: Search Planet Feature

Scenario: StarWars Planet Search Test Scenario

Given user is on the Home Page
When title is SWAPI The Star Wars API
Then the user will input planet into the search box
Then the user will click on the request button
Then the user can see the results
Then the user closes the browser

